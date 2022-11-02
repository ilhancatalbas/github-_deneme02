package ders12_forLoops;

public class ilh15_StringTersYazdirma {

    public static void main(String[] args) {

        // ters yazdir

        String input= "Erbil'de java calis";

        String tersInput="";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersInput+=input.substring(i,i+1);

        }

        System.out.println(tersInput);



    }
}
