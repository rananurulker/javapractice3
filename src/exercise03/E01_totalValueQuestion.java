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

      // Scanner scanner=new Scanner(System.in);
      // System.out.print("Lutfen bir sayi giriniz: ");
      // int sayi= scanner.nextInt();

      // int toplam=0;
      //
      // while(sayi!=0){
      //     toplam+=sayi%10;

      //     sayi/=10;
      // }
      // System.out.println("Toplam "+toplam);

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int number= scan.nextInt();

        int toplam=0;
        while(number!=0){

            toplam+=number%10;
            number/=10;

        }
        System.out.println("Rakamlarin toplami: " +toplam);

    }
}
