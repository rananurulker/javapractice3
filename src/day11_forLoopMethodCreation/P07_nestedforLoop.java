package day11_forLoopMethodCreation;

import java.util.Scanner;

public class P07_nestedforLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir deger alıp onu desen boyutu yapıp baklava deseni oluşturun
        *
       ***
      *****
     *******
      *****
       ***
        *

     */
        Scanner scan=new Scanner(System.in);
        System.out.print("desen boyutu giriniz: ");
        int boyut= scan.nextInt();

        if (boyut%2==0){
            System.out.println("tek sayi girmelisiniz...");
return;
        }

        int orta=(boyut/2)+1; //baklavanin ortasini bulduk.


        //ust kismi yapiyoruz
        for (int i = 1; i <=orta; i++) {
            for (int j = 1; j <=(orta-i) ; j++) {
                System.out.print(" ");
            }

                for (int k = 1; k <=(2*i-1); k++) {

                    System.out.print("*");

                }System.out.println();
            }


                //Alt kisim

        for (int i = (orta-1); i >=1 ; i--) {
            for (int j = 1; j <= (orta-i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                System.out.print("*");

            }System.out.println();

        }



        }
        }

