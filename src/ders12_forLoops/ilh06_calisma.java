package ders12_forLoops;

public class ilh06_calisma {
    public static void main(String[] args) {
        
        //soru10h - kullanicinin verdigi sayinin rakamlar toplamini bulun 
        // (1453) dinamik bir kod olsun sayi basmagi belli degil
        
        int sayi = 1453;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        // for loopsuz

        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        sayi=sayi/10;

        System.out.println("rakamlar toplami : "+ rakamlarToplami);

        // for loop'lu yapilisi

        int sayi1= 1453;
        String strsayi1=""+sayi1;

        int birlerBas=0;
        int rakamlarTop=0;                       // GENEL NOT: Sayi1 int oldugu icin length yapamiyoruz
                                                 // bu yuzden int String'e cevirmemiz lazim
                                                 // bunuda hiclikle yapicaz ""

        for (int i = sayi1; i >=strsayi1.length(); i++) {     //artik dinamik bir kod oldu

            birlerBas=sayi1%10;
            rakamlarTop+=birlerBas;
            sayi1=sayi1/10;
        }
        System.out.println("rakamlar toplami(for loop) : " + rakamlarTop);



        
        
        
    }
}
