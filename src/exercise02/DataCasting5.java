package exercise02;

import java.util.Scanner;

public class DataCasting5 {
    public static void main(String[] args) {
/*
Soru 5- Kullanicidan bir double, bir tamsayi alin,
double sayiyi ikinci sayiya bolun
ve bolum isleminin sonucununun tamsayi kismini yazdirin.

 */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen ondalikli bir sayi giriniz: ");
        double sayi1=scanner.nextDouble();

        System.out.print("Lutfen bir tam sayi giriniz: ");
        int sayi2=scanner.nextInt();

        int sonuc=((int)sayi1/sayi2);
        System.out.println("Sonuc: "+sonuc);
    }
}
