package com.wifqiazmi.PBO.Pertemuan2;

import java.util.Scanner;

public class InputOtput {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String nama = input.nextLine();
        System.out.println("Selamat pagi " + nama + "!");
    }
}

