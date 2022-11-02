package ders16_doWhileLoop;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        // 10,11,12 sayilarini toplayan bir while loop olusturalim

        int sayi=10;
        int toplam = 0;

        do {

            toplam = toplam+sayi;

            sayi++;

        }while (sayi<=12);

    }
}
