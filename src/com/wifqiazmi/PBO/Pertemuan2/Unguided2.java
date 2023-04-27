package com.wifqiazmi.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguided2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan nama Anda    : ");
        String nama = input.nextLine();

        // Meminta input gaji, tunjangan, dan pajak
        System.out.print("Masukkan gaji         : ");
        double gaji = input.nextDouble();
        System.out.print("Masukkan tunjangan    : ");
        double tunjangan = input.nextDouble();
        double pajak = 7.65;
        System.out.println();

        // Menghitung gaji bersih
        double gajiKotor = gaji + tunjangan;
        double pajakNegara = gajiKotor * (pajak / 100);
        double gajiBersih = gajiKotor - pajakNegara;

        // Mencetak hasil
        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut:");
        System.out.println("Gaji Kotor: Rp. " + gajiKotor);
        System.out.println("Pajak Negara (7.65%): Rp. -" + pajakNegara);
        System.out.printf("Gaji Bersih: Rp. " + gajiBersih);
        System.out.println();
        System.out.println("===============================================================");
        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu Rp. " + gajiBersih + ".");
        System.out.println("===============================================================");

    }
}

