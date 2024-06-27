package day32_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_OgrenciMap {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=mapDepo.mapOlustur();

        System.out.println(ogrenciMap.get(106));
        System.out.println(ogrenciMap.values());

        //Numarasi girilen ogrencinin Alan bilgisini yazdirma
        System.out.println(mapDepo.getBolum(ogrenciMap, 105));

        //kullanici numarayi ve istedigi bilgiyi parametre olarak girip  istedigi bilgileri getirsin

        System.out.println(mapDepo.getData(ogrenciMap,105,"AD"));
        System.out.println("*******************************************");



    }
}
