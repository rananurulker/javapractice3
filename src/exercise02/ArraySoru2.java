package exercise02;

import java.util.Arrays;

public class ArraySoru2 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in
        tum elemanlarini 2 artirip bize donduren bir method olusturun.
        Eski array’i yeni haliyle kaydedin.
         */
        int [] arr={35,5,67,99,9};

        System.out.println(Arrays.toString(arrayOlustur(arr)));

    }public static int[] arrayOlustur(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=2;
        }
        return arr;







    }

}
