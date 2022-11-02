package day01;

public class Q2_Print {
    /* 76453 sayisinin her bir basamagini konsolda alt alta yazdirin

    input : 76453
    output:7
           6
           4
           5
           3
    */

    public static void main(String[] args) {

        int sayi= 34526;

        int birler= sayi%10;             // dersek sayinin birler basamagini buluruz. modulus (macilis)
        int onlar = (sayi/10)%10;        // dersek once sayiyi 10 boleriz. sonra modulusu alir sayiyi buluruz
        int yuzler= (sayi/100)%10;       // yuzler basamagini bulmak icin once 100 e boleriz sonra modulus
        int binler= (sayi/1000)%10;      // binler basamagini bulmak icin once 1000 ne bol sonra modulus
        int onbinler= (sayi/10000)%10;   // onbinler basamagini bulmak icin once 10bine bol sona modulus al

        System.out.println(onbinler + "\n" + binler + "\n" + yuzler + "\n" + onlar + "\n" + birler);




    }

}
