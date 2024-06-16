package exercise01;

import java.util.Scanner;

public class Rakamlar_toplamini_bulma {
    public static void main(String[] args) {
        //Kullanicidan 3 basamakli bir sayi isteyip sayinin rakamlar toplamini bulun

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir tamsayi giriniz: ");
        int girilenSayi= scanner.nextInt();

        int sayi=girilenSayi;
        int birlerBasamagi=0;
        int rakamToplami=0;

        birlerBasamagi=sayi%10;
        rakamToplami=rakamToplami+birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamToplami=rakamToplami+birlerBasamagi;
        sayi=sayi/10;

        rakamToplami=rakamToplami+sayi;

        System.out.println("Girilen "+ girilenSayi+ "sayisinin rakammlar toplami: "+rakamToplami);

    }
}
