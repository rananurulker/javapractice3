package exercise02;

import java.util.Scanner;

public class IfElseSoru6 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin ..
       Yil daha calisman gerekir” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen cinsiyetinizi giriniz (K)/(E) seklinde giriniz: ");
        char cinsiyet=scan.nextLine().toUpperCase().charAt(0);

        System.out.print("Lutfen yasinizi giriniz: ");
        int yas= scan.nextInt();



        int kadinYasDahaVar = 60-yas;
        int erkekYasDahaVar= 65-yas;

        if ((cinsiyet=='K')&& yas>=60){
            System.out.println("Emekli olabilirsiniz.");


        }if ((cinsiyet=='K')&& yas<= 60)
            System.out.println("Emekli olmabilmeniz icin "+ kadinYasDahaVar+ " yil daha calismalisiniz");

        if ((cinsiyet=='E')&& yas>=65){
            System.out.println("Emekli olabilirsiniz. ");

        }if  ((cinsiyet=='E')&& yas<= 65){
            System.out.println("Emekli olabilmeniz icin "+erkekYasDahaVar+ " yil daha calismalisiniz.");
        }

    }
}
