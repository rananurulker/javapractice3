package exercise01;

import java.util.Scanner;

public class ForLoopKronometre {
    public static void main(String[] args) {

        //bir kronometre yapin
        //Kullanicidan aldigimiz pozitif sayidan 1e kadar tum sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir tam sayi giriniz: ");

        int sayi= scan.nextInt();
        for (int i = sayi; i >= 1; i--) {
            System.out.print(i+ " ");

        }
    }
}
