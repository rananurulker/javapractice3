package day13_MethodOverloadingWhiledoWhileLoop;

import com.sun.security.jgss.GSSUtil;

public class P02_Whileoop {
    public static void main(String[] args) {
        //baslangic ve bitis degerleri belli olan ve artis miktari sabit olan dongulerde
        //forLoop kullanilir.

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");

        }

        System.out.println();
        System.out.println("------------Ayni islemi While Loop ile yapalim--------------");

        int i=1;
        while (i<=10){
            System.out.println(i+ " ");
            i++;
        }
    }
}
