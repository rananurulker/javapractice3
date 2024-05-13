package day09_StringManipulation;

import java.util.Scanner;

public class P02_indexOfSorusu {
    public static void main(String[] args) {

        /*
Kullanicidan bir String ve aranacak metin alin.
String'in aranan metni icerip icermedigini
indexOf( ) method'u kullanarak yazdirin.

 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Please write a sentence: ");
        String cumle=scan.nextLine();

        System.out.print("Please write a word that you are looking on the sentence:");
        String word= scan.nextLine();

        //System.out.println(cumle.contains(word));//true
//
        //System.out.println(cumle.indexOf(word)); //-1 donerse o metin yoktur. 0 ve daha baska bir pozitif
        //deger donerse o metin vardir.
        if (cumle.indexOf(word)>=0){
            System.out.println("Aradiginiz "+ word+" kelimesi cumle icinde vardir.");
        }else {
            System.out.println("Aradiginiz " + word + " kelimesi cumle icinde yoktur.");
        }

        //cumlenin ikinci yarisinda var mi?
        if (cumle.indexOf(word,(cumle.length()/2))>=0){
            System.out.println("Aradiginiz "+ word+" kelimesi cumlenin ikinci yarisinda vardir.");
        }else {
            System.out.println("Aradiginiz " + word + " kelimesi cumlenin ikinci yarisinda yoktur.");
        }

        //cumlenin ilk yarisinda var mi?
        if (cumle.lastIndexOf(word,(cumle.length()/2))>=0){
            System.out.println("Aradiginiz "+ word+" kelimesi cumlenin ilk yarisinda vardir.");
        }else {
            System.out.println("Aradiginiz " + word + " kelimesi cumlenin ilk yarisinda yoktur.");
        }
        //ikinci kez kullanilmis mi nasil bulunur

        String str="Ali topu at, at ali at.";
        int ilkindex=str.indexOf("at");
        System.out.println("Ilk index: "+ilkindex);

        System.out.println(str.indexOf("at",(ilkindex+1))); //13 ilk indexten sonrasi


        }
    }
