package com.wifqiazmi.PBO.Pertemuan5;

public class Main {
    public static void main(String[] args) {
        //  Membuat array
        barang[] keranjang = new barang[10];

        // Membuat array dengan isiya
        barang[] etalase = {
                new barang( "Indomie",  3000),
                new barang( "Pulpen",   3000),
                new barang( "Pensil",   2500),
                new barang( "Spidol",   5000),
                new barang( "Penghapus",4000)
        };

        //Menampilkan jumlah data dalam arrray
        System.out.println("Daftar barang yang ada dalam etalase : ");

        //Perulangan for each untuk menampilkan data yang ada dalam array

        int i = 1;
        for (barang b : etalase) {
            System.out.println();
            System.out.println("Barang ke- " + i);
            b.showInfo();
            i++;
        }
    }
}
