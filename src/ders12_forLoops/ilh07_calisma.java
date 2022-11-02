package ders12_forLoops;

import java.util.Scanner;

public class ilh07_calisma {
    public static void main(String[] args) {

        //soru10h - kullanicinin verdigi sayinin rakamlar toplamini bulun
        // (2048) dinamik bir kod olsun sayi basmagi belli degil

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi= scan.nextInt();
        String sayiIntToString=""+sayi;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        for (int i = sayi; i >=4 ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println("rakamlar toplami scannerla : " + rakamlarToplami);












    }
}
