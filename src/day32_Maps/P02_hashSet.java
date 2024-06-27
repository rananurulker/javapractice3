package day32_Maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P02_hashSet {
    public static void main(String[] args) {

        Set<Integer> sayilar=new HashSet<>();

        sayilar.add(10);
        sayilar.add(12);
        sayilar.add(25);
        sayilar.add(10);
        sayilar.add(30);
        sayilar.add(12);
        System.out.println(sayilar);//[20, 10, 12, 30]

        //set icindeki cift sayilari toplasin
        int toplam=0;
        for (Integer each:sayilar){
            if (each%2==0){
                toplam+=each;
            }
        }
        System.out.println(toplam);

        //set icindeki tek sayilari silin

     //   for (Integer each: sayilar){
     //       if (each%2!=0){
     //           sayilar.remove(each);
     //       }
     //   }

        Iterator itr=sayilar.iterator();
        while (itr.hasNext()){
            if ((Integer) itr.next()%2!=0);
        }
        System.out.println(sayilar);


        //set elemanlarinin her birini iki artir

        /*
        set index yapisini desteklemedigi icin for loop kullanamayiz.
        for each loop kullanirsak degisiklik kaydedilmez
        Iterator kullanirsak degisiklik yapilmaz

        dolayisiyla bu islemi yapabilmek icin yeni bir set olusturup
        sayilar setinin elemanlarinin iki fazlasini yeni sete ekleyecegiz
         */

        Set<Integer> temp=new HashSet<>();

        for (Integer each:sayilar){
            temp.add(each+2);
        }
       //System.out.println(temp);
        sayilar=temp;
        System.out.println(sayilar);

    }
}
