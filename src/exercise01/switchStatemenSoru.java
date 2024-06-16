package exercise01;

import java.util.Scanner;

public class switchStatemenSoru {
    public static void main(String[] args) {
        //// Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek
        // istedigini alin ve girilen harfin karsiligini yazdirin.
        // I : International
        // S : Software
        // T : Testing
        // Q : Qualifications
        // B: Board

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen ISTQB kelimesinde anlamini merak ettiginiz harfi yaziniz:  ");

        char harf=scan.next().charAt(0);

        switch (harf){
            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case's':
                System.out.println("Software");
                break;
            case'T':
            case't':
                System.out.println("Testing");
                break;
            case 'Q':
            case'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Girdiginiz harf ISTQB harfleri icinde bulunmamaktadir.");

        }
    }
}
