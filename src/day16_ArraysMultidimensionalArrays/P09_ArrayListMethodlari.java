package day16_ArraysMultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class P09_ArrayListMethodlari {

    public static void main(String[] args) {


        List<Integer>sayilar=new ArrayList<>();

        System.out.println(sayilar); //[]

        //bir listin eleman sayisini bulmak icin kullanilan method .size methodudur

        System.out.println(sayilar.size()); //0

        //bir listin dolu mu bos mu oldugunu .isEmpty methodu ile kontrol ederiz.

        System.out.println(sayilar.isEmpty()); //true

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(23);
        sayilar.add(108);
        sayilar.add(541);

        System.out.println(sayilar);
        System.out.println(sayilar.size());
        System.out.println(sayilar.isEmpty());

        //List icinde bir eleman var mi diye bakmak icin .contains() kullanilir.

        System.out.println(sayilar.contains(3));
        System.out.println(sayilar.contains(23));
        System.out.println(sayilar.contains(33));


        //List icindeki herhangi bir elemani kullanmak icin .get methodu kullanilabilir.
        System.out.println(sayilar.get(0));

        int kullanici3No= sayilar.get(2);
        System.out.println("kullanici3No = " + kullanici3No);

        //list elemanlarindan herhangi birini silmek isterseniz .remove methodu kullanilir,
        // onun ya index numarasini parantez icine girmeniz ya da once bir variable a wrapper class ile ekleyip
        // sonra o variable i silmelisiniz.

        Integer k1=23;
        sayilar.remove(k1);
        System.out.println(sayilar);

        List<String> kelimeler=new ArrayList<>();

        kelimeler.add("Sakla ");
        kelimeler.add("samani ");
        kelimeler.add("gelir ");
        kelimeler.add("zamani ");

        System.out.println(kelimeler);
        kelimeler.remove("samani ");
        System.out.println(kelimeler.remove(1));
        System.out.println(kelimeler);

        System.out.println("Kelimelerin boyutu = "+ kelimeler.size());
        System.out.println("Sayilarin Boyutu "+sayilar.size());
        kelimeler.clear();
        System.out.println(kelimeler.size());
        System.out.println(kelimeler);


        kelimeler.add("Murat");//index:0
        kelimeler.add("Levent");//index:1
        kelimeler.add("Fatma");//index:2
        kelimeler.add("Rana");//index:3
        kelimeler.add("Murat");//index:4
        kelimeler.add("Mustafa");//index:5


        // bir kelimenin hangi indexte oldugunu anlamak icin lastindexpf ve index of ile yapabiliriz.

        System.out.println(kelimeler.indexOf("Murat"));//0
        System.out.println(kelimeler.lastIndexOf("Murat"));//4
        System.out.println(kelimeler.indexOf("Rana"));//3
        System.out.println(kelimeler.lastIndexOf("Rana"));//3


        //listin bir bolumunu almak icin subList methodu ile yapilir

        System.out.println(kelimeler.subList(1,3)); //levent, fatma

    }
}


