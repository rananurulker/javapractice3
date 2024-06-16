package exercise01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MO_Soru5 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.
         */
        Scanner scanner= new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tam sayi giriniz: ");
        int sayi= scanner.nextInt();
        System.out.println(pozitifTamBolen(sayi));
    }
    public static int pozitifTamBolen(int sayi){
        int PTB=0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
            PTB++;
            }

        }return PTB;
    }
}
