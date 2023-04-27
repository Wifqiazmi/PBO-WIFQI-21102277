package com.wifqiazmi.PBO.Pertemuan2;

import java.util.Scanner;
public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan : ");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.println(bilangan + " adalah bilangan positif.");
        } else if (bilangan < 0) {
            System.out.println(bilangan + " adalah bilangan negatif.");
        } else {
            System.out.println(bilangan + " adalah bilangan nol.");
        }
    }
}

