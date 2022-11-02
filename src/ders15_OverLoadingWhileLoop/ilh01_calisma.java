package ders15_OverLoadingWhileLoop;

import java.util.Scanner;

public class ilh01_calisma {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere tamsayilar alin
        // kullanici 0'a basarsa sayi alma islemini bitirin
        // kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);

        int girSayi=9;
        int tplm=0;
        int sayac=0;

        while (girSayi!=0){
            System.out.println("sayi gir, bitirmek icin 0'a bas");
            girSayi= scan.nextInt();
            if (girSayi!=0){
                sayac++;
                tplm+=girSayi;
            }
        }
        System.out.println(sayac+ " adet girilen sayinin toplami : " + tplm);
    }


}
