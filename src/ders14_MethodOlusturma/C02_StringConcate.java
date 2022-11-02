package ders14_MethodOlusturma;

import java.util.Scanner;

public class C02_StringConcate {

    // verilen iki Stringi paramaetre olarak kabul edip
    // bu iki Stringi aralarinda bir bosluk olan tek bir String olarak
    // main method'a donduren bir method olusturun

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);

        String str1 = "Java";
        String str2 = "Candir";

        System.out.println(birlestirMethodu(str1, str2));


        // BIR KAC SATIR EKSIKKK   DIKKATTT

    }

    public static String birlestirMethodu (String str1, String str2){

        return str1 + " " + str2;

    }
}
