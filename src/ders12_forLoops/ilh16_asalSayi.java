package ders12_forLoops;

public class ilh16_asalSayi {

    public static void main(String[] args) {

        // kullanicidan bir sayi al asal olup olmadigini ve asal degilse kac boleni oldugunu yazdir

        int emra = 5300;
        int bayrak=0;

        for (int i = 2; i <emra-1 ; i++) {

            if (emra%i==0){
                bayrak++;
            }
        }

        System.out.println("belen saysisi adet: " + bayrak);

        if (bayrak==0){
            System.out.println("asal sayidir");
        }else {
            System.out.println("asal degildir");
        }



    }
}
