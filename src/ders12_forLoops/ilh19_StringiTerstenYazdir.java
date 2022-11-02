package ders12_forLoops;

public class ilh19_StringiTerstenYazdir {

    public static void main(String[] args) {

        // tersden yazdir stringi

        String ebl="hadi bakalim";

        for (int i = ebl.length()-1; i >=0 ; i--) {

            System.out.print(ebl.charAt(i));

        }
    }
}
