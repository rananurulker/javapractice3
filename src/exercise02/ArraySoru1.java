package exercise02;

import java.util.Arrays;

public class ArraySoru1 {
    public static void main(String[] args) {
        //verilen bir array icindeki elemanlari toplayip toplami yazdirin.

        int [] newarr={23,56,7,89};
        int toplam=0;
        for (int i = 0; i <newarr.length ; i++) {
            toplam+=newarr[i];


        }
        System.out.println("Arrayin rakalmlari toplami:" +toplam);


    //arraydaki tum elemanlari 5 azalt

        for (int i = 0; i <newarr.length ; i++) {
            newarr[i]-=5;

        }
        System.out.println(Arrays.toString(newarr));

        //arraydeki tum elemanlari 5 artir.

        for (int i = 0; i <newarr.length ; i++) {
            newarr[i]+=5;

        }
        System.out.println(Arrays.toString(newarr));


        //15ten buyuk olanlari 10 azalt
        //15ten kucuk olanlari 2 attir.

        for (int i = 0; i < newarr.length; i++) {
            if (i>15){
                newarr[i]-=10;
            }
            else {
                newarr[i]+=2;
            }


        }System.out.println(Arrays.toString(newarr));

    }
}
