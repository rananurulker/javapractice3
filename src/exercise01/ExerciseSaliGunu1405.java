package exercise01;

import java.util.Scanner;

public class ExerciseSaliGunu1405 {
    public static void main(String[] args) {

        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // adinin ilk harfi buyuk digerleri kucuk,
       // soyadinin tamami büyük harfle yazacak sekilde ad ayrı soyad ayrı sekilde alt alta ekrana yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki kelimelik ad ve soyad giriniz: ");
        String adsoyad= scan.nextLine();

        //String ad=adsoyad.substring(0,adsoyad.indexOf(" "));
        //String soyad=adsoyad.substring(adsoyad.indexOf(" ")+1);
        //System.out.println(ad+" \n"+soyad);

       //String ad=adsoyad.substring(0,1).toUpperCase()+adsoyad.substring(1,adsoyad.indexOf(" ")).toLowerCase();
       //String soyad=adsoyad.substring(adsoyad.indexOf(" ")+1).toUpperCase();
       //System.out.println("Isim: "+ad+" \nSoyisim: "+soyad);










    }
}
