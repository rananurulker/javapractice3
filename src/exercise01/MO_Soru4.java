package exercise01;

import java.util.Scanner;

public class MO_Soru4 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        Girilen sayinin asal sayi olup olmadigini kontrol edip,
        sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen pozitif bir tam sayi giriniz:");
        int sayi = scan.nextInt();
        asalSayiBul(sayi);
    }

    public static void asalSayiBul(int sayi) {
        for (int i = 2; i <= sayi; i++) {
            if (i == sayi) {
                System.out.println("bu bir asal sayidir.");
            } else if (sayi % i == 0){
                System.out.println("verilen sayi bir asal sayi degildir. ");
            break;
        }
    }
}
}
