package com.wifqiazmi.PBO.Pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Looping... (" + i + ")");
        }
        System.out.println("Looping for selesai !");

        int j = 1;
        while (j <= 100) {
            System.out.println("Looping while.. (" + j + ")");
            j += 10;
        }
        System.out.println("Looping while selesai !");

        int k = 10;
        do {
            System.out.println("Looping do-while selesai !");
        } while (k < 10);
    }
}


