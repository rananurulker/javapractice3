package exercise01;

import java.util.Scanner;

public class VariablesScannerSoru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        dikdortgenin alanini yazdirin.
         */
        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen alani hesaplanacak dikdortgenin uzun kenar uzunlugunu giriniz: ");
        int uzunkenar= scan.nextInt();

        System.out.print("Lutfen alani hesaplanacak dikdortgenin kisa kenar uzunlugunu giriniz: ");
        int kisakenar= scan.nextInt();

        int alan=uzunkenar*kisakenar;

        System.out.println("Alan= " + alan);

    }
}
