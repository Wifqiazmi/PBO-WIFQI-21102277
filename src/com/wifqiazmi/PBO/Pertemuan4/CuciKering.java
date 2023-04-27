package com.wifqiazmi.PBO.Pertemuan4;

public class CuciKering extends LaundryService {
    public CuciKering(int harga) {
        super(harga);
    }

    public int hitungHarga() {
        return getHarga() + 10000;
    }
}

