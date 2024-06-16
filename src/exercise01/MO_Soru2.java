package exercise01;

import java.util.Scanner;

public class MO_Soru2 {
    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan input olarak verilen bir String,
        baslangic ve bitis indexlerine gore baslangic index'i dahil,
        bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.


        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime = scan.nextLine();
        System.out.print("baslangic indexini girin: ");
        int baslangic= scan.nextInt();
        System.out.print("bitis indexini girin: ");
        int bitis= scan.nextInt();
        aradakiHarfiVer(kelime, baslangic, bitis);
    }

    public static void aradakiHarfiVer(String kelime, int baslangic, int bitis){
        if (baslangic>bitis) {
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz");
        }
        else if (baslangic>kelime.length() || bitis>kelime.length()) {
            System.out.println("baslangic ve bitis degerleri kelime uzunlugundan buyuk olamaz");
        }
        else {
        System.out.println(kelime.substring(baslangic, bitis));
        }
    }
}
