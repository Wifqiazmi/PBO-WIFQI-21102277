package com.wifqiazmi.PBO.Pertemuan9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DemoDatabase extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JTextField txtNama;
    private JTextField txtNim;
    private JSpinner sprNilai;
    private JButton clearButton;
    private JButton submitButton;
    private JTable TableMahasiswa;

    private static Connection c;
    private static Statement s;
    private static ResultSet rs;

    private DefaultTableModel model;

    public DemoDatabase(){

        super("Demo Database");

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = txtNim.getText( );
                String nama = txtNama.getText( );
                int nilai = (int) sprNilai.getValue( );
                if (nim == "" | nama == "" | nilai == 0){
                    JOptionPane.showMessageDialog(null,"Please fill all forms");
                }else{
                    try {
                        openDb();
                        s.executeUpdate(
                                "INSERT INTO maha VALUE ( '" + nim + "','" + nama + "','" + nilai + "')"
                        );
                        Object[] row = {nim, nama, nilai};
                        model.addRow(row);
                        JOptionPane.showMessageDialog(null, "Data added! ");
                    }catch (SQLException | ClassNotFoundException ex) {
                        ex.printStackTrace( ) ;
                        JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                    }finally {
                        closeDb();
                    }
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNim.setText("");
                txtNama.setText("");
                sprNilai.setValue(0);
                JOptionPane.showMessageDialog(null, "Form cleared! ");
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new DemoDatabase();
        mainFrame.setVisible(true);
    }

    private static void openDb() throws ClassNotFoundException, SQLException{
        String URL = "jdbc:mysql://localhost:3306/dbdemo1";
        String Username = "root";
        String Password = "";


        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(URL, Username, Password);
        s = c.createStatement();
    }
    private static void closeDb(){
        try {
            rs.close();
            s.close();
            c.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        model = new DefaultTableModel() ;
        TableMahasiswa = new JTable(model);
        model.addColumn( "NIM" ) ;
        model.addColumn( "Nama" ) ;
        model.addColumn( "Nilai" ) ;
        try {
            openDb();
            rs = s.executeQuery("SELECT * FROM maha");
            while (rs.next()) {
                Object[] row = {
                        rs.getString("nim"),
                        rs.getString("nama"),
                        rs.getInt("nilai")
                };
                model.addRow(row);
            }
        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }finally{
            closeDb();
        }
    }
}
