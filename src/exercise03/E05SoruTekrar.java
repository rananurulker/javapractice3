package exercise03;

import java.util.Scanner;

public class E05SoruTekrar {
    public static void main(String[] args) {
             /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen elmas uzunlugu ici bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        //ust yarim elmas uzunlugu icin
        //satir
        for (int i = 1; i <= sayi; i++) {
            //sutun
            for (int j = i; j < sayi; j++) {
                System.out.print(" ");

            }
            //yildizlar
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        //alt kisim azalrak gider
        for (int i = sayi; i >= 1; i--) {
            //sutun
            for (int j = sayi; j > i; j--) {
                System.out.print(" ");

            }
            //yildizlar
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

