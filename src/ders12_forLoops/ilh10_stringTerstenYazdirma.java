package ders12_forLoops;

public class ilh10_stringTerstenYazdirma {

    //soru15h -kullanicidan bir string isteyin ve bu stringi ters den yazdirin
    public static void main(String[] args) {

        String str= "Bu sefer olsun be";

        for (int i = str.length()-1; i >=0; i--) {

            System.out.print(str.charAt(i));



        }



    }
}
