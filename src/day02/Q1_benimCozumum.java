package day02;

import java.util.Scanner;

public class Q1_benimCozumum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir gunde kac bardak cay iciyorsunuz");

        double cay= scan.nextDouble();
        double bardakSeker = scan.nextDouble();

        if (cay>0){
            System.out.println("herbardak icin kac kup seker kullaniyorsunuz");

        } else if (cay<=0) {
            System.out.println("Aferin, boyle devam et :)");

           // (bardakSeker)*365*40

        }


    }
}
