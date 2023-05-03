package com.wifqiazmi.PBO.Pertemuan5;

public class barang {
    String nama;
    int harga;
    public barang(){}
    public barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void showInfo() {
        System.out.println("Nama " +nama);
        System.out.println("harga " +harga);
    }

}
