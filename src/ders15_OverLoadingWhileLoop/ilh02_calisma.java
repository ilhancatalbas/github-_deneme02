package ders15_OverLoadingWhileLoop;

import java.util.Scanner;

public class ilh02_calisma {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere tamsayilar alin
        // kullanici 0'a basarsa sayi alma islemini bitirin
        // kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi=7;
        int sayac=0;
        int toplam=0;

        while (girilenSayi!=0){
            System.out.println("lutfen bir sayi giriniz" +
                    "\nbitirmek icin 0'a basiniz");
            girilenSayi= scan.nextInt();

            if (girilenSayi!=0){
                sayac++;
                toplam+=girilenSayi;
            }
        }

        System.out.println(sayac + "adet sayinin toplami : " + toplam);
    }
}
