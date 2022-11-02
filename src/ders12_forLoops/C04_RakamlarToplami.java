package ders12_forLoops;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        // kullanicinin verdigi sayinin rakamlar toplamini bulunuz

        int sayi = 1453;

        int birlerBasamagi = 0;
        int rakamlarToplami =0;

        for (int i = 1; i <=4; i++) {     // bu forloop un basamak sayisi kadar donmesi lazim buyuzden i<=4
                                          // sayi 6 basamkli olsaydi  i<=6 olacakti

            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami + birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlarToplami);

    }
}
