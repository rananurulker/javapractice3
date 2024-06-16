package exercise02;

import java.util.Scanner;

public class IfELseSoru1 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        degilse “Eskenar degil” yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir ucgenin 1. kenarina giriniz: ");
        int kenar1= scanner.nextInt();
        System.out.print("Lutfen bir ucgenin 2. kenarina giriniz: ");
        int kenar2=scanner.nextInt();
        System.out.print("Lutfen bir ucgenin 3. kenarina giriniz: ");
        int kenar3= scanner.nextInt();

        if (kenar1==kenar2 && kenar3==kenar2) {
            System.out.println("Bu bir eskenar ucgendir.");
        }else System.out.println("Bu bir eskenar ucgen degildir.");
        }
    }

