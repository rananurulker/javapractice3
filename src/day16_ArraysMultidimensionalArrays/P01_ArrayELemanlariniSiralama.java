package day16_ArraysMultidimensionalArrays;

import day15_ScopeArrays.P08_ElemanSayisiniBulma;

import java.util.Arrays;

public class P01_ArrayELemanlariniSiralama {
    public static void main(String[] args) {

        int[] intArr={1,12,3,8,25,136,41,9,17};

        String [] strArr={"Naim","Zeynep","Hudai","Mira","Levent","Cuneyd", "Meryem"};

        //bize verilen bir arrayin elemanlarini siralamak icin sort methodu kullanilir/
        System.out.println("IntArr ilk hali: "+Arrays.toString(intArr));
        Arrays.sort(intArr);
        //sort methodu naturel bir siralama yapar. digit karakterleri kucukten buyuge dogru siralama yapar.
        System.out.println("IntArr sirali hali: "+Arrays.toString(intArr));
        System.out.println("-------------------------------------------");
        System.out.println("strArr ilk hali: "+Arrays.toString(strArr));
        //metin iceren arraylerde ascii karakterlerine karsilik gelen siralamada yapar
        Arrays.sort(strArr);
        System.out.println("strArr sirali hali: "+Arrays.toString(strArr));

        P08_ElemanSayisiniBulma.elemanSayisiniYazdir(intArr,136);
        //Aradiginiz eleman olan 136 verilen arrayde 1 adet vardir...
        P08_ElemanSayisiniBulma.elemanSayisiniYazdir(intArr,325);
        //Aranan Eleman Verilen Arrayde bulunmamaktadir.
        System.out.println(Arrays.binarySearch(intArr,136));//8.index
        System.out.println(Arrays.binarySearch(intArr,45));//-9

        int[] arr1={1,12,3,8,25,136,41,9,17};
        int[] arr2={1,12,3,8,25,136,41,9,17};
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
