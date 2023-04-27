package com.wifqiazmi.PBO.Pertemuan3;

import java.util.ArrayList;
import java.util.Scanner;

public class UnguidedLaundry {
    public static void main(String[] args) {
        // Membuat objek paket-paket layanan laundry
        MainLaundry regular = new MainLaundry("Paket Regular",
                "Cuci dan setrika (2 hari) ", 15000);
        MainLaundry express = new MainLaundry("Paket Express",
                "Cuci, setrika, + pengiriman (1 hari)", 25000);
        MainLaundry premium = new MainLaundry("Paket Premium",
                "Cuci, setrika, + pengiriman Kilat (2 Jam)", 50000);

        // Menampilkan list paket-paket layanan laundry yang tersedia
        ArrayList<MainLaundry> Laundry = new ArrayList<>();
        Laundry.add(regular);
        Laundry.add(express);
        Laundry.add(premium);

        System.out.println();
        System.out.println("=============================");
        System.out.println("Daftar Paket Layanan Laundry:");
        System.out.println("=============================");
        System.out.println();

        for (int i = 0; i < Laundry.size(); i++) {
            System.out.println((i+1) + ". " + Laundry.get(i).getNama()
                    + " - " + Laundry.get(i).getBenefit() + " - Rp " + Laundry.get(i).getHarga());
        }
        // Meminta input dari pengguna mengenai paket-paket layanan yang ingin dipesan
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan nomor paket-paket layanan yang ingin dipesan : ");
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Integer> selectedPackages = new ArrayList<>();
        for (String str : input) {
            selectedPackages.add(Integer.parseInt(str)-1);
        }
        // Menghitung total biaya dari paket-paket layanan yang dipilih
        int totalHarga = 0;
        System.out.println("Paket Layanan yang Dipesan :");
        for (int i : selectedPackages) {
            System.out.println("- " + Laundry.get(i).getNama() + " (" + Laundry.get(i).getBenefit()
                    + "): Rp " + Laundry.get(i).getHarga());
            totalHarga += Laundry.get(i).getHarga();
        }
        System.out.println("Total Biaya: Rp " + totalHarga);
    }
}
