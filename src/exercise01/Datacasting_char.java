package exercise01;

import java.util.Scanner;

public class Datacasting_char {
    public static void main(String[] args) {
        //kullanicidan bir harf alin ve
        // alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz: ");
        char girilenKarakter=scan.next().charAt(0);

        System.out.println("Girdiginiz karakterden bir sonraki karakter: "+(char)(girilenKarakter+1));
        System.out.println("Girdiginiz karakterden iki sonraki karakter: "+(char)(girilenKarakter+2));
        System.out.println("Girdiginiz karakterden uc sonraki karakter: "+(char)(girilenKarakter+3));


        }

    }

