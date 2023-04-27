package com.wifqiazmi.PBO.Pertemuan4;

import java.util.Scanner;
public class Mainn {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("SELAMAT DATANG DI KANG LAUNDRY");
        System.out.println("==============================");
        System.out.println();
        System.out.println("Daftar harga layanan Laundry");
        System.out.println("+------------------------+");
        System.out.println("1. Cuci Biasa: Rp. 10.000");
        System.out.println("2. Cuci Setrika: Rp. 15.000");
        System.out.println("3. Cuci Kering: Rp. 20.000");

        Scanner sc = new Scanner(System.in);
        System.out.println("+------------------------+");
        System.out.print("Pilih jenis layanan (1-3) : ");

        int pilihan = sc.nextInt();

        LaundryService layanan = switch (pilihan) {
            case 1 -> new CuciBiasa(10000);
            case 2 -> new CuciSetrika(15000);
            case 3 -> new CuciKering(20000);
            default -> {
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
                yield null;
            }
        };

        System.out.println("Harga layanan: Rp. " + layanan.hitungHarga());

        System.out.print("Ingin menggunakan diskon? (y/n): ");
        String jawaban = sc.next();
        if (jawaban.equalsIgnoreCase("y")) {
            if (layanan instanceof CuciBiasa) {
                int diskon = ((CuciBiasa) layanan).hitungDiskon();
                System.out.println("Diskon: Rp. " + diskon);
                System.out.println("Tagihan setelah diskon: Rp. " + (layanan.hitungHarga() - diskon));
            } else {
                System.out.println("Maaf, layanan ini tidak mendukung diskon.");
            }
        } else {
            System.out.println("Terima kasih sudah menggunakan layanan kami.");
        }
    }
}
