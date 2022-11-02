package ders12_forLoops;

public class C03_Faktoryel {

    public static void main(String[] args) {

        // faktoryel sayinin 1 kadar carpimidir
        // mesela 5! = 5*4*3*2*1 = 120 dir


        // kullanicinin verdigi sayinin faktoryelini bulalim

        int sayi = 10;       // kullanici 10 sayisini verdi

        int faktoryel = 1;  // bize faktoryelin sonucu lazim. baslangicta variable olusturmak lazim
                            // neden 1 dedik carpmada etkisi olmasin diye. etksisiz eleman.  CARPMADA 1  TOPLAMA OLSAYDI 0

        for (int i = sayi; i > 1; i--) {      // i=sayi dedik   sayidan baslasin. nereye kadar gidecek bire kadar gidecek
                                             // 10 kucuktur 1 olmaz buyuzden i>1 yaptik
                                             // i++ degil azaltarak gidecegiz  i-- olacak

            faktoryel=faktoryel*i;    //olacak

            System.out.println(faktoryel);


            // 1'den 100'e (sinirlar dahil) kadar olan sayilari toplayin
            
            int toplam = 0;

            for (int t = 1; t <=100 ; t++) {

                toplam=toplam+t;

            }
            System.out.print(toplam);


        }

    }

}
