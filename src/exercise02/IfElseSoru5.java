package exercise02;

import java.util.Scanner;

public class IfElseSoru5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        yoksa girilen karakteri girildigi gibi yazdirin
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz: ");
        char girilenHarf=scanner.next().charAt(0);

        Character Harf=((Character)(girilenHarf));

        if (girilenHarf >= 'a'&& girilenHarf<='z'){
            System.out.println(Character.toUpperCase(Harf));
        }else {
            System.out.println(Harf);
        }
    }
}
