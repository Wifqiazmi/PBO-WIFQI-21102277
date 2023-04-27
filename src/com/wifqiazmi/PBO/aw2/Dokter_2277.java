package com.wifqiazmi.PBO.aw2;

import java.util.Scanner;

public class Dokter_2277 extends Penduduk_2277 {
    private int jmlPasien_2277;
    private int jmlObat_2277;
    public Dokter_2277() {
        // konstruktor default
    }

    public Dokter_2277(String nik_2277, String nama_2277, int umur_2277, String alamat_2277, int jmlPasien_2277, int jmlObat_2277) {
        super(nik_2277, nama_2277, umur_2277, alamat_2277);
        this.jmlPasien_2277 = jmlPasien_2277;
        this.jmlObat_2277 = jmlObat_2277;
    }

    public void inputDokter_2277() {
        Scanner sc = new Scanner(System.in);
        super.inputPenduduk_2277();
        System.out.print("Masukkan Jumlah Pasien : ");
        jmlPasien_2277 = sc.nextInt();
        System.out.print("Masukkan Jumlah Obat : ");
        jmlObat_2277 = sc.nextInt();
        System.out.println();
    }

    public double totalPendapatanDokter_2277() {
        double pendapatan = (jmlPasien_2277 * 50000) + (jmlObat_2277 * 10000);
        return pendapatan;
    }

    public void tampilDataDokter_2277() {
        System.out.println("=========== DATA DOKTER ===========");
        super.tampilDataPenduduk_2277();
        System.out.println("Jml Pasien       : " + jmlPasien_2277);
        System.out.println("Jml Obat         : " + jmlObat_2277);
        System.out.println("Total Pendapatan : Rp. " + totalPendapatanDokter_2277());
    }
}
