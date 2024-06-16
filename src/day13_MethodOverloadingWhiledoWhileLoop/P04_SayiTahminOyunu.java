package day13_MethodOverloadingWhiledoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class P04_SayiTahminOyunu {
    public static void main(String[] args) {

        /*
       1-Sisteme tahmin edilecek bir sayi tanimlayin.
       2- Kullanicidan bir sayi isteyin.
       3-Sayi tanimlanan sayidan fazla ise azal, cok soyledin desin, az ise az soyledin arttir desin.
       4-Dogru bilirse, tebrik edip kodun calismasini durdursun.
         */
        int a=128;
        Random random=new Random();
        int sayi= random.nextInt(100);//0-100 arasi olur.
        //int sayi= random.nextInt(10,100);//10-100 arasi olur.
        Scanner scan=new Scanner(System.in);
        System.out.println("Aklimdan 100'den kucuk bir sayi var. Bul ve entera bas!");

        boolean dogruMu=false;

        while(!dogruMu){
            int tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("Cok soyledin azalt!");
            } else if (tahmin<sayi) {
                System.out.println("Az soyledin, arttir!");
            }else {
                System.out.println("Tebrikler. Dogru bildiniz!Aklimdaki sayi: "+sayi);
                dogruMu=true;
            }

        }
    }
}
