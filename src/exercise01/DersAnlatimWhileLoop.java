package exercise01;

import java.util.Scanner;

public class DersAnlatimWhileLoop {
    public static void main(String[] args) {
        //1den 10a kadar olan sayilari sinirlar dahil while dongusu kullanrak yazalim

        int sayi=1;

        while (sayi<=10){
            System.out.print(sayi+ " ");
            sayi++;
        }


        //Kullanicidan toplanmak uzere tam sayilar isteyin sayilarin toplami 500
        // veya daha fazla olursa sayi istemeyi durdurup toplami yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi1=0;
        int toplam=0;
        while(toplam<500){

            System.out.print("Toplamak icin sayi giriniz: ");
            sayi1= scan.nextInt();
            toplam+=sayi1;

        }
        System.out.println("Girdiginiz sayilarin toplami: "+toplam);
    }
}
