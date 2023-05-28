package com.wifqiazmi.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unguided {

    public static int BagiBilangan(int bilangan1, int bilangan2) {
        return bilangan1 / bilangan2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan pertama : ");
            int bilangan1 = scanner.nextInt();

            System.out.print("Masukkan bilangan kedua : ");
            int bilangan2 = scanner.nextInt();

            int hasil = BagiBilangan(bilangan1, bilangan2);
            System.out.println("Hasil pembagian: " + hasil);
        } catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan ❌ (Input tidak valid. Harap masukkan bilangan bulat)");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan ❌ (Pembagian dengan nol tidak diperbolehkan)");
        } finally {
            scanner.close();
        }
    }
}
