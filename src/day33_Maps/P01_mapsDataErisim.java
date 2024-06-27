package day33_Maps;

import java.util.Map;

public class P01_mapsDataErisim {
    public static void main(String[] args) {



    Map<Integer, String> ogrenciMap=mapDepo.mapOlustur();


    //ogrenci numarasi girerek ogrencinin adini ve soyadini asagidaki formatta yazdirin
    //Mustafa Ismail

        System.out.println(mapDepo.numaraylaBilgiGetirme(ogrenciMap, 103));

        mapDepo.sinifListesiYazdir(ogrenciMap,12);


    }
}
