package ders12_forLoops;

public class ilh17_stringiTersdenYazdir {

    public static void main(String[] args) {


        // verilen stringi terden yazdir

        String ilhan="ilim isteyene unutma";

        for (int i = ilhan.length()-1; i >=0 ; i--) {

            System.out.print(ilhan.charAt(i));
        }


    }
}
