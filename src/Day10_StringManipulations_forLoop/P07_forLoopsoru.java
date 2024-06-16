package Day10_StringManipulations_forLoop;

import java.util.Scanner;

public class P07_forLoopsoru {
    public static void main(String[] args) {
        /*
 Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
 sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
 Bitis degeri baslangic degerinden kucukse,
 uyari yazdirip islemi sonlandirin

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz: ");
        int basDeg= scan.nextInt();
        System.out.println("Bitis degerini giriniz: ");
        int bitDeg= scan.nextInt();

        int toplam=0;
        if (bitDeg<basDeg){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz!!!");
        }else {
            for (int i = basDeg; i <bitDeg ; i++) {
                toplam+=i;

            }
            System.out.println(toplam);
        }

    }
}
