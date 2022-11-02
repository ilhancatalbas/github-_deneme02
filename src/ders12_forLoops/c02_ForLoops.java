package ders12_forLoops;

public class c02_ForLoops {

    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {

            System.out.print( i + " ");          // printteki ln sildik yanyana yazsin diye
                                                 // cift tirnak bosluk sayilar arasi bosluk biraksin diye
        }


        System.out.println();   // burdaki sout: ustteki ornekle alttaki ornek ayni satirda olmasin diye yaptik
                                // bos bir sout yazdik

        // 2 basamakli sayilardan 7 ile bolunebilenleri yan yana yazdirin

        for (int i = 10; i < 100; i++) {

            if (i%7==0){
                System.out.print(i+" ");
            }

        }

        System.out.println();    // ornekler arasibosluk olsun diye


        // 13'den baslayip. 100'e kadar 7'ser 7'ser artirip yazdiralim

        for (int i = 13; i <= 100; i+=7) {         // i++  birer birer arttir. i+=7   7 ser arttirir

            System.out.print(i + " ");
        }

        System.out.println();      // ornekleri ayirmak icin  yan yana yazmasin diye


        // 1'den 10 kadar (sinirlar dahil) sayilari karelerini yazdiralim
        // sayinin karakoku kendisi ile carpimidir. yazdirirken i*i diyeceksin

        for (int i = 1; i <=10; i++) {

            System.out.print(i*i + " ");

        }



    }

}
