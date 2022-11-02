package ders15_OverLoadingWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        // kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip
        // kullanicinin yeni sifre girmesini isteyin
        // gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        // gecerli sifre yazilinca "sifreniz basariyla kaydedildi" yazin
        // 8 karakterli degilse 8 karakterli yazmasini isteyiniz

        // sartlar:
        // sifrenin ilk karakteri kucuk harf olmali
        // sifrenin son karakteri sayi olmali

        Scanner scan = new Scanner(System.in);
        String sifre="";
        boolean sifreGecerliMi=false;
        int bayrak =0;

        while (sifreGecerliMi!=true){

            System.out.println("lutfen bir sifre giriniz");
            sifre= scan.nextLine();

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
                System.out.println("ilk harf kucuk harf olmali");
                bayrak++;
            }

            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("son karakter rakam olmali");
                bayrak++;
            }

            if (sifre.length()<8){
                System.out.println("en az 8 karakter olmali");
                bayrak++;
            }

            if (bayrak==0){
                sifreGecerliMi=true;
                System.out.println("basariyla kaydedildi");
            }
        }
    }
}
