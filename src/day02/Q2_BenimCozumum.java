package day02;

import java.util.Scanner;

public class Q2_BenimCozumum {
    public static void main(String[] args) {

        // girilip dedigi icin scanner olusturulacak

        //bir dersten alinan vize. final ve devam puanlarinin girilip
        // ortalama hesaplandiktan sonra dersten gecilip gecilmedigini
        // consola yazdiran bir program yazdirin
        //70 ustu gecer
        //60-70 arasi sartli gecis
        //digeri kalir


        Scanner scan = new Scanner(System.in);

        System.out.println("Vize notunuzu giriniz");
        int vnot = scan.nextInt();

        System.out.println("Final notunuzu giriniz");
        int fnot= scan.nextInt();

        System.out.println("Devam notunuzu giriniz");
        int dnot = scan.nextInt();

        double tumnot= (vnot*0.1)+(fnot*0.8)+(dnot*0.1);

        if (tumnot>=70){
            System.out.println("Gectiniz");

        } else if (tumnot<70 && tumnot>=60) {
            System.out.println("Sartli gecis");

        }else {
            System.out.println("Kaldiniz");

        }




    }
}
