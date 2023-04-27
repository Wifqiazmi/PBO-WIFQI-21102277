package com.wifqiazmi.PBO.aw2;

import java.util.Scanner;

public class Nelayan_2277 extends Penduduk_2277 {
    private int jmlBeratIkan_2277;
    private int jmlSolar_2277;

    public Nelayan_2277() {
        // konstruktor default
    }

    public Nelayan_2277(String nik_2277, String nama_2277, int umur_2277, String alamat_2277, int jmlBeratIkan_2277, int jmlSolar_2277) {
        super(nik_2277, nama_2277, umur_2277, alamat_2277);
        this.jmlBeratIkan_2277 = jmlBeratIkan_2277;
        this.jmlSolar_2277 = jmlSolar_2277;
    }

    public void inputNelayan_2277() {
        Scanner sc = new Scanner(System.in);
        super.inputPenduduk_2277();
        System.out.print("Masukan Jumlah Berat Ikan : ");
        jmlBeratIkan_2277 = sc.nextInt();
        System.out.print("Masukan Jumlah Pakai Solar : ");
        jmlSolar_2277 = sc.nextInt();
        System.out.println();
    }

    public double totalPendapatanNelayan_2277() {
        double pendapatan = (jmlBeratIkan_2277 * 8000) - (jmlSolar_2277 * 10000);
        return pendapatan;
    }

    public void tampilDataNelayan_2277() {
        System.out.println("=========== DATA NELAYAN ===========");
        super.tampilDataPenduduk_2277();
        System.out.println("Jml Berat Ikan   : " + jmlBeratIkan_2277 + "kg");
        System.out.println("Jml Pakai Solar  : " + jmlSolar_2277 + "Liter");
        System.out.println("Total Pendapatan : Rp. " + totalPendapatanNelayan_2277());
    }
}
