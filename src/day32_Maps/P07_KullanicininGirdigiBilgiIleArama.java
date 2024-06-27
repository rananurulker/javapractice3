package day32_Maps;

import java.util.Map;
import java.util.Scanner;

public class P07_KullanicininGirdigiBilgiIleArama {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap=mapDepo.mapOlustur();

        Scanner scan=new Scanner(System.in);
        System.out.print("Ogrenci numarasi: ");
        int number= scan.nextInt();
        System.out.println("Aranan bilgi [AD-SOYAD-SINIF-SUBE-ALAN]: ");
        String bilgi= scan.next();
        System.out.println(mapDepo.getData(ogrenciMap, number, bilgi));
    }
}
