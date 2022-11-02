package ders13_NestedForLoop_MethodOlusturma;

public class ilh04_soru {

    public static void main(String[] args) {

      // asagidaki sejkli hazirla

 /*   1
      2 4
      3 6 9
      4 8 12 16
      5 10 15 20 25

  */

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(i*j+" ");

            }

            System.out.println("");

        }



    }
}
