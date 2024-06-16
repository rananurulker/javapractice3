package exercise02;

import java.util.Arrays;

public class ArraySoru2Tekrar {
    public static void main(String[] args) {


    /*
        Soru 1- Verilen bir int array’in
        tum elemanlarini 2 artirip bize donduren bir method olusturun.
        Eski array’i yeni haliyle kaydedin.
         */

    int [] yeniArray={77,90,76,65,23,45,67,8};
        System.out.println(Arrays.toString(methodOlustur(yeniArray)));

}
public static int[] methodOlustur(int[]yeniArray){
    for (int i = 0; i <yeniArray.length ; i++) {
        yeniArray[i]+=2;

    }
    return yeniArray;
}
}
