package ders14_MethodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    // main method icerisinde kullanicidan iki sayi alin.
    // bu iki sayiyi parametre olarak kabul edip, carpimlarini main method'a donduren bir method olusturun

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki sayi girin");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println(carpimMethodu(3.4, 5.0));    // 17.0    bi direk calistirak

        double carpimSonucu = carpimMethodu(6,2);      // 12.0    bu calistirmicak ama islemi yapacak




    }                    // olusturacagimiz method, main method'un disinda olur



    public static double carpimMethodu(double sayi1, double sayi2){
        System.out.println("carpim methodu calisti");
        return sayi1*sayi2;

    }

}
