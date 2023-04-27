package com.wifqiazmi.PBO.Pertemuan2;

public class Breaks {
    public static void main(String[] args) {
        int p = 0;
        while (p <= 100) {
            System.out.println("Looping... (" + p + ")");
            p+=10;

            if (p == 50){
                System.out.println("Udah Bro makasih");
                break;
            }
        }
    }
}
