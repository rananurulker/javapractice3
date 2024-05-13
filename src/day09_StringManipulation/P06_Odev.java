package day09_StringManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P06_Odev {
    public static void main(String[] args) {

        /*
Kullanicidan bir String ve aranacak metin alin.
Aranan metnin String icerisinde kullanimini kontrol ederek
asagidaki cumlelerden uygun olanini yazdirin.
    - String aranan metni icermiyor
    - Aranan metin String'de sadece 1 kere kullanilmis.
    - Aranan metin String'de sadece 1’den fazla kullanilmis

 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Haydi bir cumle yaz bakalim:");
        String cumlecik= scan.nextLine();
        System.out.print("Simdi de bu cumle icinden bir kelime yaz bakalim: ");
        String kelimecik= scan.next();

        if ((cumlecik.indexOf(kelimecik))>=0){
            System.out.println("Aranan kan bulundu!");
        } else{
            System.out.println("String aranan metni icermiyor.");
        }

        int ilkindex=cumlecik.indexOf(kelimecik);
        int sonindex=cumlecik.lastIndexOf(kelimecik);

        if (ilkindex==sonindex){
            System.out.println("Aranan metin cumle icinde sadece bir kez kullanilmistir. ");
        }else{
            System.out.println("Aranan metin cumle icinde birden fazla kullanilmistir. ");
        }
        System.out.println("gddgd");
        }

    }
