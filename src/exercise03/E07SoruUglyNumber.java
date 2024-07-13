package exercise03;

import java.util.Scanner;

public class E07SoruUglyNumber {
    public static void main(String[] args) {
            /*7-----
    Ugly Number:
    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
    Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
    İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
    Test Data:
    13
    Beklenen çıktı:
    ugly number  degildir
    Test Data:
    25
    Beklenen Çıktı:
    ugly number
    */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi= scanner.nextInt();
        if (sayi%2==0 || sayi%3==0 || sayi%5==0 || sayi==1){
            System.out.println("Sayi ugly numberdir. ");
        }else System.out.println("Sayi ugly number degildir.");
    }
}
