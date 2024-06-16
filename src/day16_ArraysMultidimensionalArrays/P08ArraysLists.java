package day16_ArraysMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class P08ArraysLists {
    public static void main(String[] args) {

    //Arraylerin yeni eleman eklemeye izin vermemsi nedeniyle esnek calismai kisitlar.
    //Bu nedenle array ile liste hazirlamak zordur.
    //Bu durumda Arraylerin alt yapisini kullanan Listler tercih edilir.
    //Listler eleman eklemeye ve boyut degistirmeye izin verirler.

    List<Integer> sayilar= new ArrayList<>(); //List bir interfacetir.
    // interfacelerden obje olusturulamaz bu sebeple list kullanilir.
        System.out.println(sayilar);
        sayilar.add(128);
        sayilar.add(886);
        sayilar.add(712);

        System.out.println(sayilar);

        sayilar.add(1,9716);
        System.out.println(sayilar);

        ArrayList<Integer>liste2=new ArrayList<Integer>();

        liste2.add(9901);
        liste2.add(9902);
        liste2.add(9903);
        liste2.add(9904);
        liste2.add(9905);
        liste2.add(9905);
        System.out.println(liste2);
        liste2.add(0,9900);

        sayilar.addAll(liste2);
        System.out.println(liste2);



}
}

