package exercise01;

import java.util.Scanner;

public class SwapSoru2 {
    public static void main(String[] args) {
        /*
        Soru 8 (Interview)- Kullanicidan iki sayi alip,
         ucuncu bir degisken kullanarak ikisinin degerlerini degistirin(swap).
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen islem yapilacak bir sayi giriniz: ");
        int sayi= scan.nextInt();
        System.out.print("Lutfen islem yapilacak ikinci sayi giriniz: ");
        int sayi1= scan.nextInt();

        int gecicisayi=sayi;
        sayi=sayi1;
        sayi1=gecicisayi;

        System.out.println("Sayilarin yerleri degistirildi!");
        System.out.println("Sayi bir: "+sayi);
        System.out.println("Sayi iki: "+sayi1);


    }
}
