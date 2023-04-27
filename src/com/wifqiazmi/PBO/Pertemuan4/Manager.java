package com.wifqiazmi.PBO.Pertemuan4;

public class Manager extends pegawai {
    public void bonus(int bonus){
        System.out.println("pegawai atas nama : "
                + nama + "(" + nip + ") mendapat bonus sebesar " + bonus);
    }

    public void showinfo() {
        System.out.println("Jabatan pegawai : Manager");
    }
    public void bonus(){
        System.out.println("Eror : harap masukan nominal bonus ! ");
    }

}
