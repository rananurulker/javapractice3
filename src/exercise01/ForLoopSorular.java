package exercise01;

import java.util.Scanner;

public class ForLoopSorular {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
       // System.out.println("");

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        System.out.print("Lutfen baslangic icin bir pozitif tam sayi giriniz: ");
        int sayi2= scan.nextInt();

        System.out.println("Lutfen bitis icin pozitif bir tam sayi giriniz:  ");
        int sayi3=scan.nextInt();
        int toplam=0;
        for (int i = sayi2; i <=sayi3 ; i++) {

            toplam+=i;
            System.out.println(toplam);

        }if (sayi2>sayi3){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz.");
        }

    }
}
