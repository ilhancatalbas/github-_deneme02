package ders13_NestedForLoop_MethodOlusturma;

public class C04_NastedForLoop {

    public static void main(String[] args) {

        // asagidaki sekli yazdiran bir kod hazirlayin

        //          * * * * * *
        //          * * * * * *
        //          * * * * * *
        //          * * * * * *

        for (int i = 1; i <=4 ; i++) {            // dis loop bu

            for (int j = 1; j <= 6; j++) {        // ic loop bu

                System.out.print("* ");

            }

            System.out.println("");     //  bu sout un gorevi ic loop bitince alt satira gec

        }




    }
}
