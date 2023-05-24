package com.wifqiazmi.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukan bilangan   : ");
            int bilangan1 = input.nextInt();;

            System.out.print("Masukan Pembaginya : ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil +" (dibulatkan)");
        }
        // Multiple exception

      //  catch (ArithmeticException | InputMismatchException e) {
      // System.out.println(" Eror cuy. Tidak dapat diproses : ");
        // }

        //multiple catch
        catch (ArithmeticException e) {
            System.out.println("Eror lagi cuy. Tidak bisa diproses");
        }

        catch (InputMismatchException e) {
            System.out.println("Masukan angka saja ya :");
        }
        System.out.println("Proses sudah selesai cuy : ");
    }

}
