package exercise02;

import java.util.Arrays;

public class ArraySOru1Tekrar {
    public static void main(String[] args) {
        //verilen bir array icindeki elemanlari toplayip toplami yazdirin.

        int [] array={90,99,65,89,899};
        int toplam=0;

        for (int i = 0; i <array.length ; i++) {
            toplam+=array[i];

        }
        System.out.println("Array icindeki elemanlarin toplami: "+toplam);

        //arraydaki tum elemanlari 7 azalt

        for (int i = 0; i <array.length ; i++) {
            array[i]-=7;

        }
        System.out.println(Arrays.toString(array));

        //arraydeki tum elemanlari 7 artir.

        for (int i = 0; i <array.length ; i++) {
            array[i]+=7;

        }
        System.out.println(Arrays.toString(array));

        //15ten buyuk olanlari 10 azalt
        //15ten kucuk olanlari 2 attir.

        for (int i = 0; i <array.length ; i++) {
            if (i>15){
                array[i]-=10;
            }
            else {
                array[i]+=2;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
