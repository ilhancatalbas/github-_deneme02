package day05;

import java.util.Scanner;

public class Q1_BolmeOperatoruKullanmadanBolme {

    static int bolum=0;

    //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    //kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz : ");
        int bolunen=scan.nextInt();

        System.out.println("Lutfen bolen istediginiz sayiyi giriniz : ");
        int bolen=scan.nextInt();

        //bolum

        bol(bolunen,bolen);

    }

    public static void bol(int bolunen, int bolen) {

        while (bolunen>=bolen){
            bolunen-=bolen;
            bolum++;

        }

        //return bolum;


    }
}
