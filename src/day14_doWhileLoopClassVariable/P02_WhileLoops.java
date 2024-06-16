package day14_doWhileLoopClassVariable;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class P02_WhileLoops {
    public static void main(String[] args) {
        /*
Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
Kullaniciya bitirmek istediginde Q'a basmasini soyleyin
Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
ve bunlarin toplaminin kac oldugunu yazdirin
Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
bu negatif sayiyi sayi adedine ve toplama eklemeyin
 */
        Scanner scan= new Scanner(System.in);
        String karakter="";
        int toplam=0;
        int sayi=0;
        int flag=0;//bir islemin kac kere gerceklestigini saymak icin genelde flag kullanilir.

        while(!(karakter.equals("Q")|| karakter.equals("q"))){
            System.out.println("Toplamak icin bir sayi giriniz\nCikis yapmak icin Q tusuna basiniz\nSayi: ");

            if (scan.hasNextInt()){//kullanicinin integer girip girmedigini kontrol ediyor.
                sayi=scan.nextInt();//her dongude yeni bir sayi aliyor.
                if(sayi<0){
                System.out.println("Negatif sayi kullanamazsiniz!");
            }else {
                toplam+=sayi;
                flag++;
            }
        } else if (scan.hasNextLine()) {
                karakter=scan.nextLine();
            }

            }System.out.println("Girdiniginiz "+flag+" adet pozitif tam sayinin toplami"+sayi);
        }
}
