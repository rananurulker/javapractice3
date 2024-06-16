package exercise02;

import java.util.Scanner;

public class Modulus5hanelisoru {
    public static void main(String[] args) {
          /*
        Soru 1- Kullanicidan 5 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

Ipucu 1: Sayi % 10 => Bize son basamagi verir 1469 % 10 = 9
Ipucu 2: Int Sayi /10 => Bize son basamak haric sayiyi verir
int sayi=1469; sayi = sayi / 10 => sayi’ya 146 degerini atar
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen 5 haneli bir tam sayi giriniz: ");
        int besHaneliSayi= scanner.nextInt();
        int toplam=0;

        while(besHaneliSayi<10000 || besHaneliSayi>99999){
            System.out.print("Yanlis giris yaptiniz, lutfen 5 haneli bir sayi giriniz: ");
            besHaneliSayi= scanner.nextInt();
        }
        for (int i = 0; i <5 ; i++) {
            toplam+=besHaneliSayi%10;
            besHaneliSayi/=10;


        }System.out.println("Girilen sayinin rakamlari toplami= "+ toplam);
    }
}
