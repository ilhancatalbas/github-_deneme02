package ders12_forLoops;

public class ilh11_stringTersCevirSubstring {

    public static void main(String[] args) {

        // kullanicidan bir string al ters cevir kaydet

        String input = "bu seferde olmayacak biliyorum";
        String tersInput = "";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersInput+=input.substring(i,i+1);
        }

        System.out.println(tersInput);


    }
}
