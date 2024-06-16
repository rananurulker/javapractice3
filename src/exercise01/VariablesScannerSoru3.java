package exercise01;

import java.util.Scanner;

public class VariablesScannerSoru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
                Isminiz : John
                Soyisminiz : Doe
                Yasiniz : 44
                Kaydiniz basariyla tamamlanmistir.
         */
        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen isminizi giriniz: ");
        String isim= scan.nextLine();

        System.out.print("Lutfen soyisminizi giriniz: ");
        String soyisim= scan.nextLine();

        System.out.print("Lutfen yasinizi giriniz: ");
        int yas= scan.nextInt();


        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()));
        System.out.println(soyisim.substring(0,1).toUpperCase()+soyisim.substring(1,soyisim.length()));
        System.out.println("Yasiniz: "+yas);
        System.out.print("Kaydiniz basariyla tamamlanmistir. ");
    }
}
