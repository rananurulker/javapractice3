package day20StaticBlocksMutableImmutable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P04_PassbyValueCokluElement {
    /*
    verilen bir integer arrayin her bir elemaninin 2 artirip arrayin
    yeni halini yazdiran bir method olusturun.
     */

    public static void main(String[]args){
        int [] arr={3,5,7,};

        elemanlariArtir(arr);

        System.out.println("Method call sonrasi array:" + Arrays.toString(arr));

        arrayUzat(arr);
        System.out.println("Arrayin son hali"+ Arrays.toString(arr));
    }

    //arrayin uzunlugundan 1 elelman fazla olan yeni bir array olusturalim bu arrayin tum elemanlari 5 olsun.
    //sonra bu arrayi yolladigimiz arraye atayalim.
    //arrayin son halini yazdiran bir method olusturalim.

    private static void arrayUzat(int []arr){
        int [] yeniArr=new int[arr.length+1];

        for (int i = 0; i <yeniArr.length ; i++) {
            yeniArr[i]=5;

        }arr=yeniArr;
        System.out.println("Arrayin son hali"+Arrays.toString(arr));
    }

    public static void elemanlariArtir(int []arb){
        for (int i = 0; i <arb.length ; i++) {
            arb[i]+=2;

        }
        System.out.println(Arrays.toString(arb));
    }

}
