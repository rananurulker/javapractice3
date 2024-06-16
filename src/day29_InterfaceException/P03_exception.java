package day29_InterfaceException;

import java.util.Scanner;

public class P03_exception {
    public static void main(String[] args) {

        /*
        kullanicidan iki adet tam sayi alip bu tamsayilarin
        bolumunun sonucunu yazdirin.
         */
        Scanner scanner = new Scanner(System.in);
        int sayi1 = 0;
        int sayi2 = 0;
        boolean problemVarMi=true;

        while(problemVarMi) {//bu dongu problem var mi=false olana kadar devam eder.


            try {
                scanner = new Scanner(System.in);
                System.out.println("Lutfen iki tam sayi giriniz!");
                System.out.print("Birinci Tam sayi: ");
                sayi1 = scanner.nextInt();
                System.out.print("Ikinci Tam sayi: ");
                sayi2 = scanner.nextInt();
                problemVarMi=false;
            } catch (Exception e) {
                System.out.println("tam sayi dedik...\n Sen farkli girdin");
            }
        }
        if (sayi2 == 0) {
            System.out.println("Ikinci sayi 0 olamaz.");
        } else {
            System.out.println("Sonuc: " + (sayi1 / sayi2));

        }System.out.println("Kod hatali ise bu satir calismaz! ");
    }
}
