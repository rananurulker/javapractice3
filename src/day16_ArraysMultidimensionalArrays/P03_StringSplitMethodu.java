package day16_ArraysMultidimensionalArrays;

import java.util.Arrays;

public class P03_StringSplitMethodu {
    public static void main(String[] args) {
        String str="Ey edip adanada pide ye, ye Edip ye";

        //str.split(",");//islem ile virgul baz alniarak str bolur ve her bir elemani ayirarak bir arraye donusturur.
        System.out.println(Arrays.toString(str.split(",")));
        System.out.println(Arrays.toString(str.split(" ")));
        str=str.replaceAll(" ","");
        str=str.replace(",","");
        System.out.println(Arrays.toString(str.split("")));
    }
}
