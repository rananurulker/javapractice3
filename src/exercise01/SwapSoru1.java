package exercise01;

import java.util.Scanner;

public class SwapSoru1 {
    public static void main(String[] args) {
        /*
        Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
         */
        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen birinci sayi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        int sayi2= scan.nextInt();

        sayi1=sayi1+sayi2;//5+6=11
        sayi2=sayi1-sayi2;// 11-6=5
        sayi1=sayi1-sayi2;// 11-5=6

        System.out.println("sayi1= "+ sayi1);
        System.out.println("sayi2= "+ sayi2);
    }
}
