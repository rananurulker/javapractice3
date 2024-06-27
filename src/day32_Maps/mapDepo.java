package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class mapDepo {
    public static Map<Integer, String> mapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Mustafa-Ismail-11-A-SAY");
        ogrenciMap.put(102, "Murat-Yigit-11-A-SAY");
        ogrenciMap.put(103, "Serpil-Cem-11-A-SOZ");
        ogrenciMap.put(104, "Neslihan-Koc-11-A-SAY");
        ogrenciMap.put(105, "Levent-Seflek-11-A-EA");
        ogrenciMap.put(106, "Can-Yilmaz-11-A-SAY");
        ogrenciMap.put(107, "Kocyigit-Berk-10-A-SOZ");
        ogrenciMap.put(108, "Rana-Ulker-12-A-EA");

        return ogrenciMap;


    }

    public static String getBolum(Map<Integer, String> ogrenciMap, int istenenNo) {
        String bilgi = ogrenciMap.get(istenenNo);
        String[] arr = bilgi.split("-");
        return arr[4];
    }

    public static String getData(Map<Integer, String> ogrenciMap, int istenenNo, String istenenBilgi) {
        //ogrenci Mapinde yer alan bilgileri istenen numaradaki olanlari
        //isim, soyisim, sinif, sube, alan seklinde getirsin

        String istenenOgrValue = ogrenciMap.get(istenenNo);
        String[] istenenOgrArr = istenenOgrValue.split("-");

        switch (istenenBilgi.toUpperCase()) {
            case "AD":
                return istenenOgrArr[0];
            case "SOYAD":
                return istenenOgrArr[1];
            case "SINIF":
                return istenenOgrArr[2];
            case "SUBE":
                return istenenOgrArr[3];
            case "ALAN":
                return istenenOgrArr[4];
            default:
                return "Aranan bilgi kayitlarda mevcut degildir. ";
        }
    }
   }
