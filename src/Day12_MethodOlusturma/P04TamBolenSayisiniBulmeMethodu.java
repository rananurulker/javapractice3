package Day12_MethodOlusturma;

import java.util.Scanner;

public class P04TamBolenSayisiniBulmeMethodu {

//kullanicidan alinan sayinin pozitif tam bolenlerinin sayisini bulan method olusturun.
    //input:20 1,2,4,5,10,20 olmak uzere boleni vardir.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi= scan.nextInt();
        tamBolenSayisiYazdir(sayi);

    }
    public static void tamBolenSayisiYazdir(int sayi){
        int sayac=0;
        String bolenler="";
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                bolenler+=i+",";
                sayac++;
            }

        }
        bolenler=bolenler.substring(0,bolenler.length()-1);
        System.out.println("Verilen "+sayi+ " sayinin "+sayac+ " tane pozitif tam boleni vardir.");
        System.out.println("Verilen "+sayi+ " sayinin "+bolenler+ "olmak uzere "+sayac+ "tane tam pozitif boleni vardir.");
    }
}
