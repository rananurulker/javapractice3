package day15_ScopeArrays;

import java.util.Arrays;

public class P04_ArrayCreation {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        String [] str={"a","b","c"};
        String [] kisi={"Ali"};

        /*
        olustururken
        Data Turu [] array ismi={uygun secilmis datalar}
         */

        System.out.println(arr);//[I@27f674d
        System.out.println(str);//[Ljava.lang.String;@1d251891

        //toString methodu ile yazdirabiliriz. arrays direkt yazdirilamaz

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(str));//[a, b, c]

        System.out.println(arr[3]);//4

        arr[3]=128;
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 128, 5]

        int [] yeniARR=new int [5];//bos bir Array(default olan 0lardan olusur)
        //yeniARR={1,2,3,4,5}; calismaz
        int [] yeniARR2={4,6,78,9,13};
        System.out.println(Arrays.toString(yeniARR2));
        int [] yeniARR4={4,6,78,13};

        yeniARR2=yeniARR4;
        System.out.println(Arrays.toString(yeniARR2));
        System.out.println(arr.length);
        System.out.println(yeniARR4.length);

    }
}
