package com.wifqiazmi.PBO.Pertemuan3;
public class Main {
    public static void main(String[] args) {
/*
        //pembuatan class Non-Constructor
        SepedaMotor honda = new SepedaMotor();
        SepedaMotor yamaha = new SepedaMotor();
        SepedaMotor vespa = new SepedaMotor(); 
*/
        //pembuatan class Constructor Ber-Parameter
        SepedaMotor honda = new SepedaMotor("Honda", " Vario 160", 35000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "N Max", 40000000);
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa matic", 6000000);
/*
        //mengisi nilai atribut Non-Constructor

        honda.merk = "Honda";
        honda.tipe = "Vario 160";
        honda.harga = 35000000;

        yamaha.merk = "Yamaha";
        yamaha.tipe = "N Max";
        yamaha.harga = 40000000;

        vespa.merk = "Vespa";
        vespa.tipe = "Vespa matic";
        vespa.harga = 60000000;
*/
        //untuk menjalankan method
        honda.showinfo();
        yamaha.showinfo();
        vespa.showinfo();
/*
        //Uji coba Getter & Setter
        System.out.println();
        System.out.println("Motor merk "+ honda.getMerk()+ " dengan tipe(sebelum)"+honda.getTipe());
        honda.setTipe(" Scoopy");
        System.out.println("Motor merk "+ honda.getMerk()+ " dengan tipe(sesudah)"+honda.getTipe());
/*
 */
    }
}
