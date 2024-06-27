package day30_Exceptions;

import javax.security.sasl.SaslClient;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P01_Exceptions {
    public static void main(String[] args) {
         /*
        kullanicidan iki adet tam sayi alip bu tam sayilarin
        bolumunun sonucunu yazdirin.
         */

        int sayi1=0;
        int sayi2=0;
        boolean problemVarMi=true;


        while(problemVarMi) {

            try {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Bolme isleminde kullanlacak iki tam sayi giriniz: ");
                System.out.print("Birinci tam sayi: ");
                sayi1 = scanner.nextInt();
                System.out.print("Ikinci tam sayi: ");
                sayi2 = scanner.nextInt();
                problemVarMi = false;
            } catch (InputMismatchException e) {
                System.out.println("Tam sayi dedik abicim");

            }
        }


        //kullanici 0 girebilir ya da ondalikli sayi girebilir. burada java hata firlatir

        if (sayi2==0){
            System.out.println("Ikinci sayi 0 olamaz.");
        }
        else
            System.out.println("birinci sayinin ikinci sayiya bolumu: "+ sayi1/sayi2);




    }
}
