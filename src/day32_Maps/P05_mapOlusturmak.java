package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class P05_mapOlusturmak {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=new HashMap<>();

        //Bir okul sisteminde kayit edilen ogreniclerin
        //no, isim, osyisim, sinif, sube, alan bilgileri yer alacak
        //key olarak no alinacak ve benzersiz sekilde atanacak
        //geriye kalan isim, osyisim, sinif, sube, alan bilgileri is tek bir value olacak sekilde String yapilacak
        //isim, osyisim, sinif, sube, alan bilgileri buradaki gibi sirali ve ayni ayracla ayrilmis olacak

        ogrenciMap.put(101,"Mustafa-Ismail-11-A-SAY");
        ogrenciMap.put(102,"Murat-Yigit-11-A-SAY");
        ogrenciMap.put(103,"Serpil-Cem-11-A-SOZ");
        ogrenciMap.put(104,"Neslihan-Koc-11-A-SAY");
        ogrenciMap.put(105,"Levent-Seflek-11-A-EA");
        ogrenciMap.put(106,"Can-Yilmaz-11-A-SAY");
        ogrenciMap.put(107,"Kocyigit-Berk-10-A-SOZ");

        //Map icindeki ogrencilerin numaralarini yazdiralim.

        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106, 107]


        //103 numarali ogrencinin bilgilerini yazdiralim

        System.out.println(ogrenciMap.get(103));//Serpil-Cem-11-A-SOZ

        //Databasede kayitli tum bilgileri getirsin

        System.out.println(ogrenciMap.values());
        //[Mustafa-Ismail-11-A-SAY, Murat-Yigit-11-A-SAY, Serpil-Cem-11-A-SOZ, Neslihan-Koc-11-A-SAY, Levent-Seflek-11-A-EA, Can-Yilmaz-11-A-SAY, Kocyigit-Berk-10-A-SOZ]

        //105 numarali ogrenci var mi?

        System.out.println(ogrenciMap.containsKey(105));//true

        //ismi Murat olan ogrenci var mi?
        System.out.println(ogrenciMap.containsValue("Murat"));//false cunku yukaridaki tum bilgiler tek bilgi olarak dusunulur
        System.out.println(ogrenciMap.containsValue("Murat-Yigit-11-A-SAY"));//true
    }
}
