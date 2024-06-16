package exercise02;


import java.util.Scanner;

public class ModulusSorusuTekrar {
    public static void main(String[] args) {
         /*
        Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

Ipucu 1: Sayi % 10 => Bize son basamagi verir 1469 % 10 = 9
Ipucu 2: Int Sayi /10 => Bize son basamak haric sayiyi verir
int sayi=1469; sayi = sayi / 10 => sayi’ya 46 degerini atar
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir tam sayi giriniz: ");
        int dortBasamakliSayi=scanner.nextInt();
        int toplam=0;

        while(dortBasamakliSayi<1000 || dortBasamakliSayi>9999){
            System.out.println("Lutfen 4 basamakli bir sayi giriniz: ");
            dortBasamakliSayi=scanner.nextInt();

        }
        for (int i = 0; i <4 ; i++) {
            toplam+=dortBasamakliSayi%10;
            dortBasamakliSayi/=10;



        }System.out.println("girilen sayi rakamlar toplami: "+toplam);
    }
}
