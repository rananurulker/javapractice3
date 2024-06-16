package exercise01;

import java.util.Scanner;

public class datacasting_ {
    public static void main(String[] args) {
        //int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 tam sayi giriniz: ");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        int sayi3=scanner.nextInt();


        System.out.println("Girilen sayilarin ortalmasi: " +(double)(sayi1+sayi2+sayi3)/3 );
    }
}
