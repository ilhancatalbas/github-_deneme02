package day02;

import java.util.Scanner;

public class Q2_ScannerIfStatements {
    public static void main(String[] args) {

        // girilip dedigi icin scanner olusturulacak

        //bir dersten alinan vize. final ve devam puanlarinin girilip
        // ortalama hesaplandiktan sonra dersten gecilip gecilmedigini
        // consola yazdiran bir program yazdirin
        // 1-  70 ustu gecer
        // 2-  60-70 arasi sartli gecis
        // 3-  digeri kalir


        Scanner scan = new Scanner(System.in);

        double vizebs, finalNotu, devam;

        System.out.println("Vize notunuzu giriniz:");
        vizebs = scan.nextDouble();


        System.out.println("Final notunuzu giriniz");
        finalNotu = scan.nextDouble();


        System.out.println("Devam notunuzu giriniz");
        devam = scan.nextDouble();

        double ort = (vizebs*0.1) + (finalNotu*0.8) + (devam*0.1);

        if (ort>100 || ort<0){
            System.out.println("Yanlis Giris Yaptiniz");
        } else if (ort>=70) {
            System.out.println("Tebrikler");
        } else if (ort>60 && ort<70) {                 // burda java ort<70 yazmana gerek yok dedi.
            System.out.println("Sarli Gectiniz");      // zaten otomotik ustte elendi dedi
        }else {
            System.out.println("kaldiniz");
        }

        // sout u if le ayni satira yazarsan suslu paranteze gerek yok

    }
}
