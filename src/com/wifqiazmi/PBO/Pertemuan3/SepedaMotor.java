package com.wifqiazmi.PBO.Pertemuan3;

public class SepedaMotor {
    private String merk;
    private String tipe;
    private int harga;

    //Constructor
    public SepedaMotor(){}
    //constructor Ber-Parameter
    public SepedaMotor(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    //method
    public void showinfo() {
        System.out.println();
        System.out.println("merk : " + merk);
        System.out.println("tipe : " + tipe);
        System.out.println("harga : " + harga);
    }
/*
    //method Getter & Setter
    public String getMerk(){
        return merk;
        }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getTipe() {
        return tipe;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
*/
}


