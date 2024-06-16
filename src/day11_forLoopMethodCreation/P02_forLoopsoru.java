package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P02_forLoopsoru {
    public static void main(String[] args) {

        /*
        kullanicidan bir string isteyin ve tersten yazdirin.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle= scan.nextLine();
        String tersCumle="";

        for (int i = cumle.length(); i >= 1; i--) {
            tersCumle+=cumle.substring(i-1,i);


        }
        System.out.println(tersCumle);
    }
}
