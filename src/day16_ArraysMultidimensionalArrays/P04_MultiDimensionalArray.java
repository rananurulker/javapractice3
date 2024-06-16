package day16_ArraysMultidimensionalArrays;

import java.util.Arrays;

public class P04_MultiDimensionalArray {
    public static void main(String[] args) {

        int [][] arr={{1,2,3},{5,12},{15,23,69,100}};

        System.out.println(arr[1][0]);//5
        System.out.println(arr[2]);//bunu yazdirirken refenransini yazdirir
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.deepToString(arr));
    }
}
