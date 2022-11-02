package ders15_OverLoadingWhileLoop;

public class C07_WhileLoop {

    public static void main(String[] args) {

        // kullanican bir sayi ve hesaplamak istedigi ustunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun

        int sayi=2;
        int us=4;

        usHesapla(sayi,us);

    }

    public static void usHesapla (int sayi, int us){

        int sonuc=1;

        while (us>0){

            sonuc*=sayi;

            us--;
        }

        System.out.println(sonuc);
    }
}
