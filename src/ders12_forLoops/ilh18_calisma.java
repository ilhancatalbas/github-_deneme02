package ders12_forLoops;

public class ilh18_calisma {

    public static void main(String[] args) {

        // 78 asalmi degilmi

        int ebl=20;
        int bayrak=0;

        for (int i = 2; i <=ebl-1 ; i++) {

            if (ebl%i==0){
                bayrak++;
            }


        }
        System.out.println("boln sayi adeti : " +bayrak);


        if (bayrak==0){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal degil");
        }


    }
}
