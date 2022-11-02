package ders12_forLoops;

public class C00_ModulusTekrar {

    public static void main(String[] args) {

        // kullanicinin girdigi 4 basamakli bir sayinin rakamlar toplamini veren bir kod yaziniz

        // 2 tane variable ihtiyacimiz var
        // birincisi birler basamagi
        // ikincisi rakamlar toplami

        int input = 1453;
        int birlerBasamagi = 0;          // 0 yazmasaydik sorun cikaracakti. sifira esitledik
        int rakamlarToplami = 0;         // bu tur durumlarda sonucu bozmayacak bir deger vermekte fayda var

        // asagidaki islemin aciklamasi
        // 1- birler basamagini al
        // 2- birlerbasamagini rakamlar toplamina ekle
        // 3- birler basamagindan kurtul
        // bu islemi basamak sayisi kadar yapmak lazim

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;                                      // 3 ten kurtulmak icin
                                                               // diger basamaga gecmek icin input/10 yaptik

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;

        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;

        System.out.println(rakamlarToplami);







    }
}
