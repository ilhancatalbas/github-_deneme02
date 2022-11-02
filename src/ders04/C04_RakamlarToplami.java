package ders04;

public class C04_RakamlarToplami {

    public static void main(String[] args) {

        // kullanicidan bir sayi alin
        // bu sayinin rakamlar toplamini bulunuz

        int sayi=1453;                  // biz sayinin rakmalar toplamini bulmak istiyorsak
                                        //2 tane variable'a ihtiyacimiz var
        int birlerBasamagi=0;
        int rakamlarToplami=0;
                                        // rakamlar toplamini bulmak icin ayni islemi basamak sayisi kadar yapacagiz

        //YAPACAGIMIZ ISLEMLER
        // 1- Birler basamgini al
        // 2- Birler basamagini rakamlar toplamina ekle
        // 3- birler basamagindan kurtul.                    // bu islemi basamak sayisi kadar yap

        birlerBasamagi=sayi%10;                              // ilk islemimiz birler basamagini bulmak; sayiyi modulus 10 yapicaz
        rakamlarToplami= rakamlarToplami+birlerBasamagi;     // sonra birler basamagini rakamlar toplmaina ekledik
        sayi=sayi/10;                                        // birler basamgindan kurtulacagiz

        birlerBasamagi=sayi%10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami= rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        System.out.println("Verilen sayinin rakamlar toplami : " + rakamlarToplami);















    }
}
