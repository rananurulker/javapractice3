package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P05_nestedForLoop {
    public static void main(String[] args) {
        /*
        kullanicidan satir ve sutun sayisini alip
        * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *
        seklini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Satir sayisi giriniz: ");
        int satir=scan.nextInt();
        System.out.print("Sutun sayisi giriniz: ");
        int sutun=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j < sutun; j++) {
                System.out.print("* ");


            }
            System.out.println();

        }
    }
}
