package day20StaticBlocksMutableImmutable;

public class P02_StaticOlmayanBlock {

    /*
    Obje olusturmadan once bazi ayarlarin yapilmasi gerekiyorsa ya da bazi variablelara database'den
    //deger atanmasi gerekiyorsa
    bu islemler statik olmayan bloklar yardimiyla yapilir.
    obje olusturulmadan one statik olmayan bloklar calisir.
     */

    P02_StaticOlmayanBlock(){
        System.out.println("Parametresiz constructor calisti");
        method2();
    }
    static
    {
        System.out.println("Statik block calisti");
    }
    public static void main(String[] args) {
        System.out.println("Main method calisti");
        method1();
        P02_StaticOlmayanBlock obj=new P02_StaticOlmayanBlock();
    }{
        System.out.println("Statik olmayan block2 calisti");
    }

    public static void method1(){
        System.out.println("Method 1 calisti.");

    }
    public static void method2(){
        System.out.println("Method2 calisti");
    }
    }

