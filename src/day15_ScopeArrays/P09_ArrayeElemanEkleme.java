package day15_ScopeArrays;

import java.util.Arrays;

public class P09_ArrayeElemanEkleme {
    public static void main(String[] args) {
        // Verilen bir array'e
// istenen bir elemani ekleyip bize donduren bir method yazin,
// eski array'e yeni degeri atayin.

        int [] arr={2,5,9,12,53};
        System.out.println("arr:" +Arrays.toString(arr));
        int [] mrr={5,9,12,53};
        System.out.println("mrr:" +Arrays.toString(mrr));

        arr=mrr;
        System.out.println("Array'e manuel olarak eleman ekledik");
        arr=arrayElemanEkleme(arr,26);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] arrayElemanEkleme(int [] eskiarr, int eklenecekeleman){
        int [] yeniARR=new int [eskiarr.length+1];

        for (int i = 0; i < eskiarr.length; i++) {
            yeniARR[i]=eskiarr[i];
        }yeniARR[yeniARR.length-1]=eklenecekeleman;
        return yeniARR;
    }
}
