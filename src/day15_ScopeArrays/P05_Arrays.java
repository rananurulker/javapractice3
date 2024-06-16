package day15_ScopeArrays;

import java.util.Arrays;

public class P05_Arrays {
    public static void main(String[] args) {
        int [] arr={15,23,65,98,17,35,46};
        int toplam=0;


        //verilen bir array icindeki elemanlari toplayip toplami yazdirin.

        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];


        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Toplam= "+toplam);

        //arcraydaki tum elemanlari 5 azalt
        for (int i = 0; i < arr.length; i++) {
            arr[i]-=5;

        }
        System.out.println(Arrays.toString(arr));//[10, 18, 60, 93, 12, 30, 41]

        //15ten buyuk olanlari 10 azalt
        //15ten kucuk olanlari 2 attir.

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>15){
                arr[i]-=10;
            }else {
                arr[i]+=2;
            }

        }
        System.out.println(Arrays.toString(arr));//[12, 8, 50, 83, 14, 20, 31]

    }
}
