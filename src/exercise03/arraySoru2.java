package exercise03;

import java.util.Arrays;

public class arraySoru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen bir array’deki
        pozitif tamsayilari toplayip
        sonucu bize donduren bir method yaziniz.
         */

        int [] array={1989,1990,2016,2021};
        int[] sum=plusEachElements(array);
        System.out.println(Arrays.toString(sum));

    }

    public static int[] plusEachElements(int[]array){
        int sum=0;
        for (int num : array) {
            if (num>0){
                sum+=num;
            }

        }

        return new int[]{sum};
    }
}
