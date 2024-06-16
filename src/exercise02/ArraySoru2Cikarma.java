package exercise02;

import java.util.Arrays;

public class ArraySoru2Cikarma {
    public static void main(String[] args) {
        //verilen bir arrayin her elemanindan 5 eksilten bir method olustur

        int [] arraycik={66,77,99,111,555,};
        System.out.println(Arrays.toString(arrayMethod(arraycik)));

    }
    public static int[] arrayMethod(int [] arraycik){
        for (int i = 0; i <arraycik.length ; i++) {
            arraycik[i]-=5;


        }
        return arraycik;
    }
}
