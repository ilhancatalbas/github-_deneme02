package ders12_forLoops;

public class ilh09_calismaAsalSayi {

    public static void main(String[] args) {

        // kullanicinin verdigi sayiyi asal mi degil mi bulunuz

        int sayi=53;
        int bayrak=0;

        for (int i = 2; i <sayi-1; i++) {

            if (sayi%i==0){
                bayrak++;

            }




        }System.out.println(bayrak);
        if (bayrak==0){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }



    }
}
