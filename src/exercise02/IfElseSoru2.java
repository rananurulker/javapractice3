package exercise02;

import java.util.Scanner;

public class IfElseSoru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan notunu alin
        50 veya daha buyukse ”Sinifi Gectin”,
        50’den kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen notunuzu giriniz: ");
        int not= scanner.nextInt();

        if (not>=50){
            System.out.println("Sinifi gectiniz!");
        }else System.out.println("Maalesef kaldiniz.");
        }

    }

