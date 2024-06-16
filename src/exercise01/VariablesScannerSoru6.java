package exercise01;

import java.util.Scanner;

public class VariablesScannerSoru6 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.
         */
        Scanner scan=new Scanner(System.in);

        System.out.print("Cemberin yaricapini giriniz: ");
        double yariCap= scan.nextDouble();

        double cevre=2*3.14*yariCap;
        double alan=3.14*(yariCap*yariCap);
        System.out.println();
        System.out.println("Cemberin cevresi: "+cevre);
        System.out.println("Cemberin alani: "+alan);

    }
}
