package day33_Maps;

import java.util.Map;

public class P03_MapMethods {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=mapDepo.mapOlustur();
        System.out.println(ogrenciMap);

        /*
        {101=Mustafa-İsmail-11-A-SAY,
        102=Murat-Yiğit-11-K-EA,
        103=Serpil-Cem-11-A-SÖZ,
        104=Neslihan-Koç-11-A-SAY,
        105=Levent-Seflek-11-K-EA,
        106=Can-Yılmaz-11-A-SAY,
        107=Berk-Yiğit-10-C-SÖZ,
        108=Rana-Ülker-12-A-EA,
        109=İsmail-Kaya-Mezun-B-EA}

         */

        ogrenciMap.put(110,"Sena-Yigit-9-A-SAY");
        ogrenciMap.put(102,"Murat-Babayiğit-11-K-SAY");
        System.out.println(ogrenciMap);

        //replace, valuedaki degerleri toplu ya da bireysel olarak degistirir.
        //fakat yeni degerleri gonderirken degismeyenler de degisenle birlikte tek bir string olarak gonderilir
        ogrenciMap.replace(107,"Berk-Yiğit-10-C-SÖZ","Berk-Babayiğit-10-C-EA");
        System.out.println(ogrenciMap);

        ogrenciMap.get(103);

        //getordefault key ile cagirilan bilgi varsa yazdirir yoksa girilen mesaji yazdirir.
        System.out.println(ogrenciMap.getOrDefault(120, "Boyle bir numaraya sahip ogrenci yoktur"));

        System.out.println(ogrenciMap.putIfAbsent(120, "Sibel-Babayiğit-10-K-SAY"));//null
        System.out.println(ogrenciMap.putIfAbsent(102, "Murat-Yiğit-11-K-SAY"));//Murat-Babayiğit-11-K-SAY

    }
}
