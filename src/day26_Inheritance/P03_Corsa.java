package day26_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class P03_Corsa extends P02_Opel{

    P03_Corsa (){
        super();
        System.out.println("Corsa constructor calisti");
    }
    /*
    javada olusturulan bir objeye ilk deger atamasinin yapilabilmesi icin constructor calisitirilmasi zorunludur

    java kendini parentlari olan bir classlardaki objelerin ozellilerine
     */
    String model="Corsa";
    String motor="vvt";
    String renk="kirmizi";

    public static void main(String[] args) {
        P03_Corsa corsa1=new P03_Corsa();

        System.out.println(corsa1.model);//Corsa
        System.out.println(corsa1.motor);//vvt
        System.out.println(corsa1.renk);//kirmizi

        System.out.println(corsa1.marka);//opel
        System.out.println(corsa1.renk);//kirmizi

        List<Integer> liste=new ArrayList<>();

        //String str=new StringBuilder ("Murat");
        Integer sayi=10;
        //Double dblsayi=(Integer) sayi;
        //String str2=sayi;

        Object obj=sayi;
        String str="Java";
        obj=str;
        Object obj2=30;
        Integer sayi2=(Integer) obj2;

        //parenttaki data child classina atanabilir fakat childdaki bir datayi parenttaki variable a cast etmeliyiz

        //biz constructor calistirmadan parent variable a nasil ulasiyoruz?
        //javada child classlarda bir obje olusturuldugunda pareb classlardaki constructorlarin
        // otomatik olarak claistirilmasi icin bir mekanizma olusturmusur.
        //java her class icin default constructor olusturdugu gibi
        //extends keyword kullanan classlar icin her bi constructorin ilk satirina suer constructoe

    }

}
