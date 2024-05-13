package day09_StringManipulation;



public class P04_Nullpointer {
    public static void main(String[] args) {

        //non-primitive data turlerini atama yapmadan olusturabiliriz.
        //fakat kullanirken bize deger atanmamis olabilir uyarisi verir.
        //atama yapmadan kullanamayiz.

        String metin;
        //System.out.println(metin);

        String metin2="";
        System.out.println(metin2);

        //"" dahi olsa atansa hata vermeden calisir.
        //hangi variable da deger atanmistir desem bana metin 2 icin atandi der.

        String metin3=null;//bu keyword kullanilarak hafiza kullaniminin onune gecer.

        //ici bos olan bir string olusturdum
        System.out.println(metin3);

        //metin2 ile metin3 arasindaki fark nedir?
        //Java metin2'ye deger atandigini ama metin3 e deger atanmadigini anlar.

        System.out.println(metin2.length());
        //System.out.println(metin3.length());//Null pointer exception

        System.out.println(metin2.isEmpty());//true
        System.out.println(metin2.isBlank());//true
       // System.out.println(metin3.isBlank());//nullpoint
       // System.out.println(metin3.isEmpty());//nullpoint



    }
}
