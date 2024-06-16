package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip,
        //bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.

        //6!= 6 * 5 * 4 * 3 * 2 * 1 =720


        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen 20den kucuk bir sayi giriniz: " );
        int girilenSayi= scan.nextInt();

        int sonuc=1;

        for (int i = girilenSayi; i >=1 ; i--) {
            sonuc *= i;
        }
      String str="";
            for (int j = girilenSayi; j >=1 ; j--) {
            str=str+j+" * ";
            }
            str=str.substring(0,str.length()-2);
        System.out.println(girilenSayi+" != "+str+" = "+sonuc);

    }
}
