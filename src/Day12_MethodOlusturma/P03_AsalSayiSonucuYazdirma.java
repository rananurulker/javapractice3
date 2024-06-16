package Day12_MethodOlusturma;

import java.util.Scanner;

public class P03_AsalSayiSonucuYazdirma {

    public static void main(String[] args) {
        //Kullanicindan alinan sayinin asal sayi olup olmadigini kontrol edip
        // sonuc olarak girilen "sayi asal sayidir veyada 'girilen sayi asal sayi degildir.'
    // seklinmde yazan bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Kontrol edeceginiz sayiyi giriniz: ");
        int sayi=scan.nextInt();
        asalSayimiYazdir(sayi);
    }
    public static void asalSayimiYazdir(int sayi){
        for (int i = 2; i <=sayi ; i++) {
            if (i==sayi){
                System.out.println("Girilen sayi Asal Sayidir.");
            }else if (sayi%i==0){
                System.out.println("Girilen Sayi Asal Sayi degildir.");
             break;
            }

        }
    }
}
