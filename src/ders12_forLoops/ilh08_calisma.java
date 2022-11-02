package ders12_forLoops;

public class ilh08_calisma {

    public static void main(String[] args) {

        //soru12h- kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun. sayi 103 olsun

        int sayi=53;
        int bayrak=0;

        for (int i = 2; i <sayi-1 ; i++) {


            if (sayi%i==0){
                bayrak++;
                break;

            }

        }
        System.out.println(bayrak);

        if (bayrak==0){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }


    }
}
