package ders15_OverLoadingWhileLoop;

import java.util.Scanner;

public class ilh03_calisma {

    public static void main(String[] args) {

// kullanicidan toplanmak uzere bir sayi alin
        // sayilarin toplami 500'e esit olur veya gecerse
        // girilen sayi adeti
        // girilen sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);


        int girilenSayi=1;
        int sayac=0;
        int toplam=0;


        while (toplam<=500){
            System.out.println("sayi gir");
            girilenSayi= scan.nextInt();

            if (toplam<=500){
                toplam+=girilenSayi;
                sayac++;
            }else {
            }

        }

        System.out.println(sayac+ "adet girilen sayi toplami: " +toplam );



    }
}
