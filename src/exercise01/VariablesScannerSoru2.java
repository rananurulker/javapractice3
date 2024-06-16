package exercise01;

import java.util.Scanner;

public class VariablesScannerSoru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir double, bir de int sayi alip
        bunlarin toplamini ve carpimini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir tam sayi giriniz: ");
        int sayi= scan.nextInt();
        System.out.print("lutfen ondalikli bir sayi giriniz: ");
        double sayi1=scan.nextDouble();

        double toplam=sayi+sayi1;
        System.out.print("Toplam= " + toplam);
        System.out.println();
        double carpim=sayi*sayi1;
        System.out.println("Carpim= " + carpim);
    }
}
