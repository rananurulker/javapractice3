package exercise02;

import java.util.Scanner;

public class DataCasting4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan iki double sayi alin,
        ilk sayiyi ikinci sayiya bolun
        ve bolum isleminin sonucununun tamsayi kismini yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen birinci ondalikli sayinizi giriniz: ");
        double sayi1=scanner.nextDouble();

        System.out.print("Lutfen ikinci ondalikli sayinizi giriniz: ");
        double sayi2=scanner.nextDouble();

        int sonuc=((int)(sayi1/sayi2));
        System.out.println("Sonuc: "+sonuc);



    }
}
