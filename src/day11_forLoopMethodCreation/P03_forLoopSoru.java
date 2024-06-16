package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P03_forLoopSoru {
    public static void main(String[] args) {
        /*
        /  Kullanicidan bir String isteyin
       //  ve String'in Palindrome olup olmadigini yazdirin
      //  palindrome : tersden yazilisi ayni olan, or : madam
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen palindrom olup olmadigini kontroledeceginiz metni yaziniz: ");
        String metin= scan.nextLine();
        String tersmetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersmetin+=metin.charAt(i);

        }
        if (metin.equalsIgnoreCase(tersmetin)){
            System.out.println("Girdiginiz metin bir palindromdur.");
        }else {
            System.out.println("Girdiginiz metin bir palindrom degildir.");
        }
    }
}
