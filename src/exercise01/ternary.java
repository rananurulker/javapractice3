package exercise01;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
//Kullanicidan bir sayi al
//0 dan büyükse ve esitse 10 dan kucuk olup olmadigini kontrol et
//10 dan kücükse ekrana "rakam" yazdir, degilse "pozitif sayi" yazdir
//sayi 0 dan kücük ise "nagatif sayi" yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi= scan.nextInt();

        System.out.println(sayi < 0 ? "negatif sayi" :sayi<=9 ? "rakam" : "pozitif sayi ");
   /*
   Kullanicidan iki sayi alin ve buyuk olani yazdirin.
    */

        System.out.print("Lufen iki tam sayi girip enter tusuna basiniz: ");
        double sayi2=scan.nextDouble();
        double sayi3=scan.nextDouble();

        System.out.println(sayi2>sayi3 ? sayi3:sayi2);
    }

}
