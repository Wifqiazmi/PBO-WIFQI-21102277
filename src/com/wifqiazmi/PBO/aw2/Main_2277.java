package com.wifqiazmi.PBO.aw2;

import java.util.Scanner;

public class Main_2277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // membuat array untuk dua objek Nelayan dan dua objek Dokter
        Nelayan_2277[] nelayanArray_2277 = new Nelayan_2277[2];
        Dokter_2277[] dokter_2277 = new Dokter_2277[2];

        // input data Nelayan
        for (int i = 0; i < nelayanArray_2277.length; i++) {
            nelayanArray_2277[i] = new Nelayan_2277();
            System.out.println("-------------------------");
            System.out.println("Masukkan data Nelayan ke-" + (i+1));
            System.out.println("-------------------------");
            nelayanArray_2277[i].inputNelayan_2277();
        }

        // input data Dokter
        for (int i = 0; i < dokter_2277.length; i++) {
            dokter_2277[i] = new Dokter_2277();
            System.out.println("-------------------------");
            System.out.println("Masukkan data Dokter ke-" + (i+1));
            System.out.println("-------------------------");
            dokter_2277[i].inputDokter_2277();
        }

        // tampilkan data Nelayan
        for (int i = 0; i < nelayanArray_2277.length; i++) {
            nelayanArray_2277[i].tampilDataNelayan_2277();
            System.out.println("------------------------------------");
            System.out.println();
        }

        // tampilkan data Dokter
        for (int i = 0; i < dokter_2277.length; i++) {
            dokter_2277[i].tampilDataDokter_2277();
            System.out.println("------------------------------------");
            System.out.println();
        }

        sc.close();
    }

}
