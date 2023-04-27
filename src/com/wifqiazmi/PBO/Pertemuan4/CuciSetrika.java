package com.wifqiazmi.PBO.Pertemuan4;

public class CuciSetrika extends LaundryService {
    public CuciSetrika(int harga) {
        super(harga);
    }

    public int hitungHarga() {
        return getHarga() + 5000;
    }
}