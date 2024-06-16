package exercise02;

import java.util.Scanner;

public class DataCasting1 {
    public static void main(String[] args) {
        /*
        Soru 1- Int olarak verilen 3 degerin ortalamasini
        double olarak yazdiran bir kod yazin
         */

        Scanner scanner=new Scanner(System.in);

        System.out.print("Lutfen birinci sayiyi giriniz: ");
        int sayi1= scanner.nextInt();

        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        int sayi2= scanner.nextInt();

        System.out.print("Lutfen ucuncu sayiyi giriniz: ");
        int sayi3= scanner.nextInt();

        double sonuc=(sayi1+sayi2+sayi3)/3;
        System.out.println("Sonuc: "+sonuc);
    }
}
