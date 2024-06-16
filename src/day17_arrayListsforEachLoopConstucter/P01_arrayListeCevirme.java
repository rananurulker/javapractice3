package day17_arrayListsforEachLoopConstucter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01_arrayListeCevirme {
    public static void main(String[] args) {
        Integer []arr={3,4,5,6,2,1,8,7,9,12,45,68,96,75,23};

        //Array olarak verilen arryi, liste cevirmek istiyoruz.
        //Bu 3 yolla yapilabilir.

        //1-for loop ile
        List<Integer>listARR=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            listARR.add(arr[i]);

        }
        System.out.println(listARR);

        listARR.add(20);//[3, 4, 5, 6, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23]
        listARR.remove(3);//[3, 4, 5, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23, 20]

        System.out.println(listARR);


        //2-asList methodu ile
        //array elemanlarini bu method ile tek tek ekleterek

        List<Integer>listArr2=new ArrayList<>(Arrays.asList(3,4,5,6,2,1,8,7,9,12,45,68,96,75,23));

        System.out.println(listArr2);

        listArr2.add(20);//[3, 4, 5, 6, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23]
        listArr2.remove(3);//[3, 4, 5, 2, 1, 8, 7, 9, 12, 45, 68, 96, 75, 23, 20]
        System.out.println(listArr2);

        //3-direkt arryi as.List methodu ile listeye cevirmek
        //Ancak burada iki dezavantaj vardir.
        // bu sekilde yapilirsa .add ve .remove kullanilamaz. kullanilirsa RTE verir.
        //java array ile array listi ozdeslestirir ve birinde yapilan degisiklik digerini etkiler

        List<Integer>listArr3=Arrays.asList(arr);

        System.out.println(listArr3);

       //listArr3.add(20);//UnsupportedOperationException
       //listArr3.remove(3);//UnsupportedOperationException
       System.out.println(listArr3);

       arr[8]=1258;
        System.out.println("arr degisince onu kullanarak olusturulan list de degisir."+listArr3);



    }

}
