package ders12_forLoops;

public class ilh03_calisma {
    public static void main(String[] args) {

        // kullanicidan bir string alin ve bunu tersten kaydedin

        String str= "bari bu sefer olsa insaAllah";
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {

            tersStr = tersStr + str.substring(i,i+1);

        }

        System.out.println(tersStr);

    }
}
