package day14_doWhileLoopClassVariable;

import java.util.Scanner;

public class P01_WhileLoops {
    public static void main(String[] args) {


    /*
While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
 */

    Scanner scan= new Scanner (System.in);

        System.out.print("Lutfen Bir Sayi Giriniz: ");
        int sayi=scan.nextInt();
        int rakamlarToplam=0;
        while (sayi>0){
            rakamlarToplam+=sayi%10;// her bir dongude birler basamagindaki sayiyi rakamlarToplamina ekleyecek
            sayi/=10; //sayiyi 10'a bolerek bor sonraki basamagi birler basamagi haline getirecek.
        }
        System.out.println("Girilen sayinin rakamlar toplami: "+rakamlarToplam);
    }
}
