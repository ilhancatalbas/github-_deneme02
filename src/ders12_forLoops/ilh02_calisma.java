package ders12_forLoops;

public class ilh02_calisma {

    public static void main(String[] args) {

        // kullanicidan bir string alin ve bunu tersten yazdirin

        String str = "Bu sefer olacak InsaAllah";

        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.charAt(i));

        }


    }
}
