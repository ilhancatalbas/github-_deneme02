package ders12_forLoops;

public class ilh01_calisma {

    public static void main(String[] args) {

        int sayi = 50;

        for (int i = 1; i <=sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("ujbej \n");

            } else if (i%3==0) {
                System.out.print("uj ");

            } else if (i%5==0) {
                System.out.print("bej ");

            }else {
                System.out.print(i+" ");
            }

        }



    }
}
