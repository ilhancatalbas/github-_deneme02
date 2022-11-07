package ders30_encapsulation;

public class AEncapsuleClass {

    private String hastaneIsmi = "Yildiz Hastanesi";
    //hastane ismigorulebilsin ama degistirilemesin

    private int hastaUcreti;
    // hasta ucretleride giris yapilabilsin ama
    // ucreti sigortan alinacagi icin
    // personel hasta ucretlerini gormesin

    String hemsireIsmi;
    String hemsireAdresi;
    // bu instance variable lara herkes ulasabilsin
    // bu durumda public yapmak akla gelen ilk cozum olacaktir


}
