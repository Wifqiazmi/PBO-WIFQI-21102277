package com.wifqiazmi.PBO.Pertemuan4;

public class CuciBiasa extends LaundryService {
    public CuciBiasa(int harga) {
        super(harga);
    }

    public int hitungHarga() {
        return getHarga();
    }
    public int hitungDiskon() {
        return (int)(hitungHarga() * 0.1);
    }
}