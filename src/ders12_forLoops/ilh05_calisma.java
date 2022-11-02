package ders12_forLoops;

import java.util.Scanner;

public class ilh05_calisma {

    public static void main(String[] args) {

        //soru6h-  13 den baslayip 100e kadar sayilari 7 ser 7 ser arttirip yanyana yazdirin

        for (int i = 13; i <100 ; i+=7) {

            System.out.print(i+" ");
        }

        System.out.println();

        //soru7h-  1den 10 na kadar sinirlar dahil olan sayilarin karelerini yazdirin
        // yanyana aralarinda bosluk olsun

        for (int i = 1; i <=10 ; i++) {

            System.out.print(i*i+" ");
        }

        System.out.println("---------------------------");

        //soru8h- kullanicinin verdigi sayinin faktoryelini bulunuz. kullanici 10 versin


        int sayi=5;

        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel=faktoryel*i;
        }

        System.out.print(faktoryel+" ");

        System.out.println("-------------");

        // 1 den 100e (sinirlar dahil) kadar olan sayilari toplayin

        int toplam=0;

        for (int i = 1; i < 100; i++) {

            toplam+=i;
        }
        System.out.print(toplam+" ");

        System.out.println("-----------------");

        //soru4- 15 ile 25 arasindaki sayilari toplayip yayyana yazdirin

        int toplamS4= 0;

        for (int i = 15; i <=25 ; i++) {

            toplamS4+=i;
        }
        System.out.println(toplamS4+" ");

        System.out.println();
        System.out.println("-------------");


        //soru7b- 7den 9 a kadar olan sayilarin kuplerini yazdirin

        int kupSayi=0;

        for (int i = 7; i <=9 ; i++) {

            kupSayi+=i*i*i;
        }
        System.out.println(kupSayi+" ");

        System.out.println();
        System.out.println("----------");

        //tekar soru8h- kullanicinin verdigi sayinin faktoryelini bulunuz. kullanici 10 versin

        int sayiFktryl=10;
        int fktryl=1;

        for (int i = sayiFktryl; i >=1 ; i--) {

            fktryl=fktryl*i;
        }

        System.out.print(fktryl);







    }
}
