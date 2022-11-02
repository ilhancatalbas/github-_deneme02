package ders12_forLoops;

import java.util.Scanner;

public class ilh14_asalSayi {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin ve asalmi degil kontro edin asalsa kac tane asal var onuda soyleyin

        Scanner console = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi= console.nextInt();
        int bayrak=0;

        for (int i = 2; i <sayi-1 ; i++) {

            if (sayi%i==0){
                bayrak++;

            }
        }
        System.out.println("sayida : "+ bayrak + " tane bolen sayi var");

        if (bayrak==0){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi degil");
        }
    }
}
