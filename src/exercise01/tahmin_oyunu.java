package exercise01;

import java.util.Scanner;

public class tahmin_oyunu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("tahmin oyununa hosgeldiniz... 1 ile 9 arasinda tuttugum rakami bil: ");
        int rakam= scan.nextInt();

        switch (rakam){

            case 1:
                System.out.println("yanlis oldu");
                break;
            case 2:
                System.out.println("yanlis rakam tuttun");
                break;
            case 3:
                System.out.println("yanlis rakam tuttun");
                break;
            case 4:
                System.out.println("dogru bildin");
                break;
            case 5:
                System.out.println("yanlis rakam tuttun");
                break;
            case 6:
                System.out.println("yanlis rakam tuttun");
                break;
            case 7:
                System.out.println("yanlis rakam tuttun");
                break;
            case 8:
                System.out.println("yanlis rakam tuttun");
                break;
            case 9:
                System.out.println("yanlis rakam tuttun");
                break;
            default:
                System.out.println("Lutfen bir rakam giriniz...");


        }
    }
}
