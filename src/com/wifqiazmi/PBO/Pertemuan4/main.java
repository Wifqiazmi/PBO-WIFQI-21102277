package com.wifqiazmi.PBO.Pertemuan4;

public class main {
    public static void main(String[] args) {
        Manager managerkami = new Manager();
        pegawai pegawaikami = new pegawai();
 
        managerkami.nip = 21102277;
        managerkami.nama = "wifqiazmi";

        pegawaikami.nip = 21102098;
        pegawaikami.nama = "Asep bin slamet";

        managerkami.showinfo();
        managerkami.extraInfo();
        managerkami.bonus(120000);
        managerkami.bonus();

        pegawaikami.showinfo();
        pegawaikami.extraInfo();
    }
}
