package ders12_forLoops;

public class ilh12_asalSayiTekrar {

    public static void main(String[] args) {

        //soru12h - kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun.
        // sayi 103 olsun   tc2.20 civari

        int sayi=15;
        int bayrak=0;

        for (int i = 2; i <sayi-1; i++) {

            if (sayi%i==0){
                bayrak++;
            }

        }

        System.out.println(bayrak);

        if (bayrak==0){
            System.out.println("asal degil");

        }else {
            System.out.println("asal sayi");
        }

    }
}
