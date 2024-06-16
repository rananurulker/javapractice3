package exercise02;

import java.util.Scanner;

public class IfELseSOru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan yasini isteyin,
        65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz: ");
        int yas= scanner.nextInt();
        int aradakiFark=65-yas;

        if (yas>=65){
            System.out.println("Emekli olabilirsin");

        } else System.out.println("Henuz emekli olamazsiniz. Emekli olabilmek icin "+aradakiFark
                                  + " yil daha calismalisiniz!");
    }
}
