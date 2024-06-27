package day33_Maps;

import java.util.HashMap;
import java.util.Map;

public class P05_nestedMaps {
    public static void main(String[] args) {
        /*

        ogrenciMap.put(101,"Mustafa-İsmail-11-A-SAY");
        ogrenciMap.put(102,"Murat-Yiğit-11-K-EA");
        ogrenciMap.put(103,"Serpil-Cem-11-A-SÖZ");
        ogrenciMap.put(104,"Neslihan-Koç-11-A-SAY");
        ogrenciMap.put(109,"İsmail-Kaya-Mezun-B-EA");

        burada map icine veri eklerken tek bir satirda
        key, value ikilisi ile veri ekleyebiliyoruz

        birden fazla veriyi eklemek gerekirse burada nestedMap kullanilabilir

        ogrenci={
                 101={ogrenci bilgileri},
                 102={ogrenci bilgileri},
                 103="Serpil-Cem-11-A-SÖZ",
        }
         */

        Map <String, String> ogrenciMap= new HashMap<>();
        Map <String, String> ogrenci1=new HashMap<>();
        ogrenci1.put("isim","Murat");
        ogrenci1.put("soyisim","Koc");
        ogrenci1.put("sinif","9");
        ogrenci1.put("sube","B");
        ogrenci1.put("alan","Say");

        Map <String, String> ogrenci2=new HashMap<>();
        ogrenci1.put("isim","Ali");
        ogrenci1.put("soyisim","Koc");
        ogrenci1.put("sinif","12");
        ogrenci1.put("sube","B");
        ogrenci1.put("alan","Say");

        Map <String, String> ogrenci3=new HashMap<>();
        ogrenci1.put("isim","Dursun");
        ogrenci1.put("soyisim","Koc");
        ogrenci1.put("sinif","10");
        ogrenci1.put("sube","B");
        ogrenci1.put("alan","EA");


    }
}
