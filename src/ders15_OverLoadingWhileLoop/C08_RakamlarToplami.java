package ders15_OverLoadingWhileLoop;

public class C08_RakamlarToplami {

    public static void main(String[] args) {

        // soru2= While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayi=1453;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi!=0){

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }
        System.out.println(rakamlarToplami);
    }
}
