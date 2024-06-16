package exercise02;

import java.sql.Array;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //bir array [] parantezlerden olusur. Muhakkak kac tane elemani oldugnu tanimlamaliyiz.
        //asagidaki birinci kullanim dogrudur. ancak ikinci kullanimi intelli j sari ile boyamaz.
        int sayi1[]={2,0,1,6};
        int [] sayi2={2,0,2,1};

        //Arrayleri yazdirmak icin Array classindan to string methodu kullanilir.
        // yoksa java bize referansini yazdirir.

        System.out.println(sayi1);//[I@1d251891
        System.out.println(Arrays.toString(sayi2));//[2, 0, 2, 1]

        //Arrays ile sort yapip siralama
        // oncelikle Arrays.sort ile siralanir daha sonra toString metodu ile siralanan Array yazdirilir.
        //Bunun icin kucukten buyuge bir siralama yapilir, buyukten kucuge yapmak icin loop gerkeldiri.

        Arrays.sort(sayi1);
        System.out.println(Arrays.toString(sayi1));

        Arrays.sort(sayi2);
        System.out.println(Arrays.toString(sayi2));

       //bir stringi arraye cevirmek icin to split kullanilir

        String str="Hopa sina sina nay sina nay nay, sina nay yarim sina nay nay";
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        //[Hopa, sina, sina, nay, sina, nay, nay,, sina, nay, yarim, sina, nay, nay]

        String str2=" Huzur seni cok seviyorum";
        String[] kelimeler2=str2.split("u");
        System.out.println(Arrays.toString(kelimeler2));
        //[ H, z, r seni cok seviyor, m]

        //isaretci olarak verdigimiz harfi ya d akelimeyi silerek ayirir.


        //buyukten kucuge siralamak icin ne yapilir

        int [] sayi5={34,56,12,1,23,56,78};
        Arrays.sort(sayi5);
        System.out.println(Arrays.toString(sayi5));

        for (int i = sayi5.length-1; i >=0 ; i--) {
            System.out.print(sayi5[i]+" ");
        }
    }
}
