package ders15_OverLoadingWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere bir sayi alin
        // sayilarin toplami 500'e esit olur veya gecerse
        // girilen sayi adeti
        // girilen sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        double girilenSayi= 0;
        double toplam=0;
        int sayac=0;

        while (toplam<500){              // bu 500 den kucuk oldugu mudetce devam edicek. 500'e esit olur veya gecerse demis

            System.out.println("sayi gir");
            girilenSayi= scan.nextDouble();

            toplam+=girilenSayi;
            sayac++;
        }

        System.out.println("girilen " + sayac + "toplami: " + toplam);





    }
}


