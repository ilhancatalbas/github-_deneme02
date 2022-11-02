package ders15_OverLoadingWhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere tamsayilar alin
        // kullanici 0'a basarsa sayi alma islemini bitirin
        // kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        int girilenSayi=5;      // verilen ilk deger 0 olmamali bu soru icin
                                // 0'i loop bitirmek icin kullanicagiz

        int sayac=0;            // kullanicinin girdigi sayisyi hesaplayacak
        int toplam=0;           // toplama dedigi icin herzamanki gibi toplam degerimizi yazdik


        while (girilenSayi!=0){
            System.out.println("toplamak icin tam sayi girin" +
                    "\n bitirmek icin 0'a basin");
            girilenSayi= scan.nextInt();                   // kullanicidan tekrar tekrar sayi almak icin while loop'un icine yazdik

            if (girilenSayi!=0){
                sayac++;
                toplam+=girilenSayi;
            }
        }

        System.out.println("Girilen " + sayac+"adet sayinin toplami : " +toplam);



    }
}
