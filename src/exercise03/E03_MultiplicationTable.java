package exercise03;

import java.util.Scanner;

public class E03_MultiplicationTable {
    public static void main(String[] args) {
         /*3----
    Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen carpimi yapilacak bir sayi giriniz: ");
        int sayi= scanner.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int sonuc=sayi*i;
            System.out.println("Sonuc: "+ sayi + "x" + i + "=" + sonuc);

        }

        }

    }
