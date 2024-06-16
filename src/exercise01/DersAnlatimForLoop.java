package exercise01;

import java.util.Scanner;

public class DersAnlatimForLoop {
    public static void main(String[] args) {
        //1den 100e kadar olan sayilari yazdirin.

        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+ " "); //1 2 3 4

        }
        System.out.println();

        // 2 basamakli sayilardan 7 ile bolunenleri yazdirin.

        for (int i = 10; i <=99 ; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");

            }
        }

        System.out.println();



        //2 basamakli pozitif tamsayilarin toplamini yazdirin.

       int toplam=0;
        for (int i = 10; i <100 ; i++) {
            toplam+=i;

        }
        System.out.println("Iki basamakli pozitif tam sayilarin toplami: "+ toplam);

        System.out.println();


        //bir Kronometre yap, kullanicidan aldigimiz pozitif sayidan 1 e kadar sayilari yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen bir pozitif tam sayi giriniz: ");
        int sayi= scan.nextInt();

        for (int i = sayi; i >=1 ; i--) {

            System.out.print(i+" ");


        }
    }
}
