package ders12_forLoops;

public class ilh20_stringtersdenyazdirsubs {

    public static void main(String[] args) {

        String str = "bunuda yap";

        String tersden="";

        for (int i = str.length()-1; i >=0 ; i--) {

            tersden+=str.substring(i,i+1);

            // System.out.print(tersden=str.substring(i,i+1));    // bu calisti. ustteki ve alttaki soutu silebilirsin
        }

        System.out.println("ters hali:  " + tersden);




    }
}
