package exercise01;

import java.util.Scanner;

public class Exercise02indexofSorusu {
    public static void main(String[] args) {

        /*
        kullanicidan bir String ve aranacak metin alin. Stringin aranan
        metin icerip icermedigini indexof methodu kullanarak yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String cumle = scan.nextLine();

        System.out.print("lutfen cumlede aramak istediginiz metni giriniz: ");
        String metin = scan.nextLine();
        System.out.println(cumle.contains(metin));
        System.out.println(cumle.indexOf(metin));

        if (cumle.indexOf(metin) >= 0) {
            System.out.println("aradiginiz " + metin + " kelimesi cumle icinde vardir.");
        } else {
            System.out.println("aradiginiz " + metin + " kelimesi cumle icinde yoktur.");
        }

        //cumlenin ikinci yarisinda var mi?

        if (cumle.indexOf(metin, (cumle.length() / 2)) >= 0) {
            System.out.println("aradiginiz " + metin + " kelimesi cumlenin ikinci yarisinda vardir.");
        } else {
            System.out.println("aradiginiz " + metin + " kelimesi cumlenin ikinci yarisinda yoktur.");

        }

        //ikinci kez kullanilmis mi bakacagiz

        String str= "Ali topu at, at ALi at";
        int ilkIndex=str.indexOf("at");
        String metin2="at";

        System.out.println(str.indexOf(metin2,(ilkIndex+1)));


    }
}

