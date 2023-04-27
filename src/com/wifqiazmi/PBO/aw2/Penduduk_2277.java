package com.wifqiazmi.PBO.aw2;

import java.util.Scanner;
public class Penduduk_2277 {
    protected String nik_2277;
    protected String nama_2277;
    protected int umur_2277;
    protected String alamat_2277;

    public Penduduk_2277() {
        // konstruktor default
    }

    public Penduduk_2277(String nik_2277, String nama_2277, int umur_2277, String alamat_2277) {
        this.nik_2277 = nik_2277;
        this.nama_2277 = nama_2277;
        this.umur_2277 = umur_2277;
        this.alamat_2277 = alamat_2277;
    }

    public void inputPenduduk_2277() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIK  : ");
        nik_2277 = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        nama_2277 = sc.nextLine();
        System.out.print("Masukkan Umur : ");
        umur_2277 = sc.nextInt();
        sc.nextLine(); // membersihkan inputan newline
        System.out.print("Masukkan Alamat : ");
        alamat_2277 = sc.nextLine();
    }


    public void tampilDataPenduduk_2277() {
        System.out.println("NIK              : " + nik_2277);
        System.out.println("Nama             : " + nama_2277);
        System.out.println("Umur             : " + umur_2277);
        System.out.println("Alamat           : " + alamat_2277);
    }
}




