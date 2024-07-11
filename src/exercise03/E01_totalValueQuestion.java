package exercise03;

import java.util.Scanner;

public class E01_totalValueQuestion {
    public static void main(String[] args) {
        /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.
    Test Data
    34
    Beklenen Cikti
    7
    */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int num=scanner.nextInt();

        int toplam=0;
        while(num != 0){
            toplam += num%10;
            num/=10;
        }

        System.out.println("Basamaklarin toplami: "+ toplam);


    }
}
