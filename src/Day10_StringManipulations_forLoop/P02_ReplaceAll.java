package Day10_StringManipulations_forLoop;

public class P02_ReplaceAll {
    public static void main(String[] args) {
        String str="J2a3v3a G4uzel67d34i9876r";
        str=str.replace("4","");

        //str=str.replace("4","") sadece 4 leri degistirir.

        //tum rakamlari degistirme silme icin replaceall methodu kullanilir.

        str=str.replaceAll("\\d","");
        System.out.println(str);

        /*
        \\d rakamlarla eslesir.(digit)
        \\D rakam olmayan her seyle eslesir.
         \\s space karakterleri ile eslesir.
         \\S bosluk olmayan her sey ile eslesir.
         \\w harf, rakam, _(alt cizgi) olan karakterleri ifade eder.
         \\W harf, rakam, _(alt cizgi) olmayan karakterleri ifade eder.

         */

        str="Java         ogrenmek cok guzel         ";

        System.out.println(str.replaceAll("\\s",""));//Javaogrenmekcok guzel
        // butun bosluklari silerek yazdirir
        System.out.println(str.replaceAll("\\s+",""));//Javaogrenmekcokguzel
        System.out.println(str.replaceAll("\\s+"," ")); //Java ogrenmek cok guzel

        System.out.println();
        System.out.println("---------");
        String str2="Java candir ";
        System.out.println(str2.repeat(5));//atama yapmadan str2 yi girilen deger kadar degistirir.
        str2=str2.repeat(5); //atama yaparak kalici olarak str2 yi degistirir.

        str2= "       Java      Candir      ";
        System.out.println(str2.trim()); //bas ve sondaki bosluklari siler.

    }
}
