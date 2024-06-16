package Day10_StringManipulations_forLoop;

import java.util.Scanner;

public class P06_forLoop {
    public static void main(String[] args) {
        /*
        kullanicidan pozitif bir sayi alin
        1den girilen sayiya kadar girilen sayi dahil,
        7 ile bolunebilen sayilari yazdirin.
         */
        Scanner scan=new Scanner(System.in);

        System.out.print("Pozitif bir tam sayi giriniz: ");
        int sayi= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
    }
}
