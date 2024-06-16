package exercise01;

import java.util.Scanner;

public class VariablesScannerSoru5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        girilen bilgiler : J Doe, 44
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen adinizi giriniz: ");
        String ad= scan.nextLine();
        System.out.print("Lutfen soyadinizi giriniz: ");
        String soyad= scan.nextLine();

        System.out.print("Lutfen yasinizi giriniz: ");
        int yas= scan.nextInt();

        System.out.println("Girilen Bilgiler: "+ad.substring(0,1).toUpperCase()+" "
                           + soyad.substring(0,1).toUpperCase()+soyad.substring(1,soyad.length())+", "+ yas);

    }
}
