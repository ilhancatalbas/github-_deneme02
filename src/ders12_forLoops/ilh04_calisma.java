package ders12_forLoops;

public class ilh04_calisma {
    public static void main(String[] args) {

        //soru 1- 24 den 32 ye (dahil) kadar olan sayilari yazdir yanyana

        for (int i = 24; i <=32 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println();



        //soru2-  2 basamakli sayilardan 7 ile bolunebilenleri yanyana yazdirin yanyana


        for (int i = 10; i <100; i++) {

            if (i%7==0){

                System.out.print(i+ " ");
            }
        }

        System.out.println();

        //soru3-  3 basamkli sayilardan 150 ye kadar olanlari (150 dahil) 3 ile bolunenleri yazdirin yanyana

        for (int i = 100; i <150; i++) {

            if (i%3==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        //soru4- 15 ile 25 (sayilar dahil) arasindaki sayilari toplayip sonucu yazdirin

        int toplam=0;

        for (int i = 15; i <25 ; i++) {

            toplam+=i;

            System.out.print(toplam+"");
        }

        System.out.println();

        //soru5- 20 ile 45 arasindaki 4 e bolunen sayilari toplayip yanayana yazdirin

        for (int i = 20; i <45 ; i++) {

            if (i%4==0){
                System.out.print(i+" ");
            }

        }



    }
}
