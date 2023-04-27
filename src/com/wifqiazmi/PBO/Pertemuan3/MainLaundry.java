package com.wifqiazmi.PBO.Pertemuan3;

public class MainLaundry {
    private String nama;
    private String benefit;
    private int harga;
    public MainLaundry(String nama, String benefit, int harga) {
        this.nama = nama;
        this.benefit = benefit;
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }
    public String getBenefit() {
        return benefit;
    }
    public int getHarga() {
        return harga;
    }
}

