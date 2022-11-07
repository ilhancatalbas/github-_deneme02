package ders30_encapsulation;

public class C01_Encapsulation {

    public static void main(String[] args) {

        AEncapsuleClass pers1 = new AEncapsuleClass();

        // pers1.hastaneIsmi = "Java Hastanesi";      private oldugu icin gorulemez

        // pers1.hastaUcreti = 10000;                 private oldugu icin gorulemez

        pers1.hemsireAdresi="Ankara";
        pers1.hemsireIsmi="Yildiz Yildiz";
    }
}
