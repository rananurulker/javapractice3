package exercise01;

import java.util.Scanner;

public class MO_Soru2Tekrar {
    /*
        Soru 1- Kullanicidan input olarak verilen bir String,
        baslangic ve bitis indexlerine gore baslangic index'i dahil,
        bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.


        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
         */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime= scan.nextLine();
        System.out.print("Lutfen baslangic indexi giriniz: ");
        int basla= scan.nextInt();
        System.out.print("Lutfen bitis indexi giriniz: ");
        int bitis= scan.nextInt();
        aradakiharfigetir(kelime,basla,bitis);
    }

    public static void aradakiharfigetir(String kelime,int basla, int bitis){
        if (basla>bitis){
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz.");
        } else if (basla>kelime.length() || bitis>kelime.length() ) {
            System.out.println("verilen rakam kelime uzunlugundan buyuk olamaz");
        }else System.out.println(kelime.substring(basla,bitis));
    }

        }


