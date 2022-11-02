package ders12_forLoops;

public class ilh22_faktoryelHesapla {

    public static void main(String[] args) {


        // 5 in faktoryelini hesapla

        int sayi=5;
        int faktoryel=1;

        for (int i = 5; i <=1 ; i--) {

            faktoryel+=faktoryel*i;

        }

        System.out.print(faktoryel);
    }
}
