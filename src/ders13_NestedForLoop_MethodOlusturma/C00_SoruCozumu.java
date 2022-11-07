package ders13_NestedForLoop_MethodOlusturma;

public class C00_SoruCozumu {

    public static void main(String[] args) {


        // bir string al ve tersten yazdir

        String str= "olsaaa nee, olmasaaa neee";
        String tersten = "";

        for (int i=str.length()-1; i>=0; i--){

            tersten+=str.substring(i,i+1);
        }

        System.out.print(tersten);


    }
}
