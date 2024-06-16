package exercise02;

import java.util.Scanner;

public class DataCasting3 {
    public static void main(String[] args) {
    /*
    Soru 3- Kullanicidan bir sayi alin,
    kullanici kac degerini girerse girsin,
    o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.
     */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi= scanner.nextInt();

        System.out.println((byte)sayi);
    }
}
