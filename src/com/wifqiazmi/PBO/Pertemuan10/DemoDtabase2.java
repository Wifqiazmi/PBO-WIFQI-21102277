package com.wifqiazmi.PBO.Pertemuan10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class DemoDtabase2 extends JFrame{
    private JTextField txt_nim;
    private JTextField txt_nama;
    private JButton saveButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JSpinner spr_nilai;
    private JButton clearButton;
    private JTable dataTable;
    private JPanel mainPanel;
    private DefaultTableModel model;
    private static Connection c;
    private static Statement s;
    private static ResultSet rs;

    public DemoDtabase2(){
        super("DemoDtabase");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600,400);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txt_nama.getText();
                String nim = txt_nim.getText();
                int nilai = (int) spr_nilai.getValue();

                try {
                    openDb();
                    s.executeUpdate(
                            "INSERT INTO tb_mahasiswa SET (nim = '" + nim + "', nama = '" + nama + "', nilai = '" + nilai + "')"
                    );
                    Object[] row = {nim, nama, nilai};
                    model.addRow(row);
                    JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data ");
                }catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace( ) ;
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                }finally {
                    closeDb();
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_nim.setText("");
                txt_nama.setText("");
                spr_nilai.setValue(0);
            }
        });
        dataTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = dataTable.getSelectedRow();

                String nim = dataTable.getValueAt(row, 0).toString();
                String nama = dataTable.getValueAt(row, 1).toString();
                int nilai = dataTable.getValueAt(row, 2).hashCode();

                txt_nim.setText("");
                txt_nama.setText("");
                spr_nilai.setValue(nilai);
            }
        });
    }
    public static void main(String[] args) {
        DemoDtabase2 Frame = new DemoDtabase2();
        Frame.setVisible(true);
    }
// Open DB
    private static void openDb() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/db_demo2";
        String Username = "root";
        String Password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(URL, Username, Password);
        s = c.createStatement();
    }
// Close DB
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
        model = new DefaultTableModel();
        dataTable = new JTable(model);
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Nilai");
        try {
            openDb();
            s.executeUpdate("SELECT * FROM tb_mahasiswa");
            while (rs.next()){
                Object[] row = {
                      rs.getString("nim"),
                      rs.getString("nama"),
                      rs.getInt("nilai"),

                };
                model.addRow(row);
            }
        }catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace( ) ;
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        }finally {
            closeDb();
        }
    }
}
