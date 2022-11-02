package ders12_forLoops;

public class ilh13_StringTersYazdirma {

    public static void main(String[] args) {


        String input= "belki olur";

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));

        }
    }
}
