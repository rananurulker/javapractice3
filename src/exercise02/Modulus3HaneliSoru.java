package exercise02;

import java.util.Scanner;

public class Modulus3HaneliSoru {
    public static void main(String[] args) {

          /*
        Soru 1- Kullanicidan 3 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

Ipucu 1: Sayi % 10 => Bize son basamagi verir 1469 % 10 = 9
Ipucu 2: Int Sayi /10 => Bize son basamak haric sayiyi verir
int sayi=1469; sayi = sayi / 10 => sayi’ya 146 degerini atar
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli bir tam sayi giriniz: ");
        int girilenSayi= scanner.nextInt();
        int toplam=0;

        while(girilenSayi<100 || girilenSayi>999){
            System.out.print("Girilen sayi 3 basamakli bir sayi olmalidir. Lutfen tekrar giris yapiniz: ");
            girilenSayi=scanner.nextInt();
        }

        for (int i = 0; i <3 ; i++) {
            toplam+=girilenSayi%10;
            girilenSayi/=10;
        }
        System.out.println("tum rakamlarin toplami= "+toplam);
    }
}
