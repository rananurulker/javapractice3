package day17_arrayListsforEachLoopConstucter;

import org.w3c.dom.ls.LSOutput;

public class P09_Runner {
    public static void main(String[] args) {
         /*

         P08_Okul       ogr1      =            new       P08_Okul();
         Class Ismi    obje    aassignment  keyword     Constructor
         Data türü     ismi       sign

         */

        /*
        Biz bir classtan obje olusturdugumuzda o
        objenin olusturuldugu classtaki tum variable ve methodlarin bir kopyasini da olusturmus oluruz.

        Dolayisiyla sadece variable ve methodlara ulasmakla kalmaz. o classta atanmis degerlere de sahip olur.

        javada bir obje olusturdugumuzda objenin olusturuldugu classtaki constructor calisir.

        Constructor calisinca olusturulan objeye, ilk degerlerini atiyor. (initialize)

        Bir class olusturulunca herhangi bir constructor gormuyoruz.

        fakat bir deger atamasi yapabilmek icin constructor calistirilmasi zorunludur.
        java bunu bildigi icin her class olusturdugumuzda bir default constructoru gizli olarak olusturur.
        biz eger kendimiz bir parametresiz constructor olusturursak default siliniyor.
         */


        P08_Okul ogr1=new P08_Okul();
        ogr1.ogretmenAd="Murat";
        ogr1.ogretmenBrans="Fizik";
        System.out.println(ogr1.ogretmenAd);
        System.out.println(ogr1.ogretmenBrans);
        System.out.println(ogr1.ogretmenYas);
        System.out.println(ogr1.ogretmenSicilNo);

        P08_Okul ogr2=new P08_Okul();
        ogr2.ogretmenAd="Levent";
        ogr2.ogretmenBrans="Core Java";

        P08_Okul pers1=new P08_Okul();
        pers1.personelAd="Huzur";

    }
}
