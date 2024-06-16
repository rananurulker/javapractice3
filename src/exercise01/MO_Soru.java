package exercise01;

import java.util.Scanner;

public class MO_Soru {
    public static void main(String[] args) {


        System.out.println(isAsal(20));

    }
    public static boolean isAsal(int sayi){
        boolean sonuc= false;

        for (int i = 2; i <=sayi ; i++) {
            if( i==sayi){
                sonuc= true;
            } else if (sayi%i==0) {
                sonuc=false;
                break;

            }

        }return sonuc;
        }

}
