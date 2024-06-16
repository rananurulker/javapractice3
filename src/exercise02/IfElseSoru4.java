package exercise02;

import java.util.Scanner;

public class IfElseSoru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir karakter girmesini isteyin,
         girilen karakterin buyuk harf olup olmadigini yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz: ");
        char girilenHarf=scanner.next().charAt(0);



        if (girilenHarf >= 'A' &&  girilenHarf<='Z'){
            System.out.println("Girilen harf buyuk harftir.");
        }else {
            System.out.println("Girilen harf kucuk harftir.");
        }
    }
}
