package exercise01;

import java.util.Scanner;

public class MO_Soru3 {
    /*
    Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
    input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim= scan.nextLine();
        System.out.print("Lutfen soyisiminizi giriniz: ");
        String soyisim= scan.nextLine();
        isimolustur(isim, soyisim);
    }
    public static void isimolustur(String isim,String soyisim){

        String isimilkharf=isim.substring(0,1).toUpperCase();
        String isimGeriKalan=isim.substring(1, isim.length()).toLowerCase();
        String soyIsimIlk=soyisim.substring(0,1).toUpperCase();
        String soyIsimson=soyisim.substring(1,soyisim.length()).toLowerCase();

        System.out.println(isimilkharf+isimGeriKalan+" "+soyIsimIlk+soyIsimson);


        }

    }
