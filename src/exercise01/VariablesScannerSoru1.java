package exercise01;

import java.util.Scanner;

public class VariablesScannerSoru1 {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan uc farkli data turunde deger alip,
        // girilen degerleri aciklamalariyla yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Luten bir tam sayi giriniz: ");
        int sayi= scan.nextInt();
        System.out.print("Lutfen ondalikli bir sayi giriniz: ");
        double sayi1= scan.nextDouble();
        System.out.print("Lutfen float tipinde bir sayi giriniz: ");
        float sayi2= scan.nextFloat();

        System.out.println();

        System.out.println("Girdiginiz sayi "+ sayi+ "bir integer sayidir.");
        System.out.println("Girdiginiz sayi "+ sayi1+ "bir double sayidir.");
        System.out.println("Girdiginiz sayi "+ sayi2+ "bir double sayidir.");

    }
}
