package com.wifqiazmi.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguided1 {
    public static void main(String[] args) {

        // username dan password yang sudah ditentukan
        String username = "wifqiazmi";
        String password = "awokwok";

        Scanner input = new Scanner(System.in);

        // meminta input username dan password dari user
        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        // memeriksa apakah input username dan password sudah diisi
        if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
            System.out.println("Silakan login dengan username dan password yang sah!");
        }
        // memeriksa apakah input username dan password sesuai dengan yang sudah ditentukan
        else if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil silakan masuk");
        } else {
            System.out.println("Username dan password Anda salah");
        }
    }
}

