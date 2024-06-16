package exercise02;

import java.util.Scanner;

public class DataCasting2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
         */

        Scanner scanner=new Scanner(System.in);

       // System.out.print("Lutfen bir harf giriniz: ");
       // char girilenHarf=scanner.next().charAt(0);
//
       // System.out.println("Girilen harf: "+ girilenHarf);
//
       // System.out.println((char)(girilenHarf+1));
       // System.out.println((char)(girilenHarf+2));
       // System.out.println((char)(girilenHarf+3));


        System.out.print("Lutfen bir harf giriniz: ");
        char girdiginizHarf=scanner.next().charAt(0);

        System.out.println("Ahanda girdiginiz harf: "+girdiginizHarf);
        System.out.println((char)(girdiginizHarf+1) );
        System.out.println((char)(girdiginizHarf+2) );
        System.out.println((char)(girdiginizHarf+3) );


    }
}
