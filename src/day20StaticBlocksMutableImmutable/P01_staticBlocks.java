package day20StaticBlocksMutableImmutable;

public class P01_staticBlocks {

// statik bloklar class calismaya basladiginda tum kodlar calismadan once calisan yapilardir,
    //hatta main method calismadan once calisirlar.

    //eger class calismaya basladiginda bazi ayarlarin yapilmasi bazi variuablelar
    // deger atanmasi durumlarinda kulllanilir.

    P01_staticBlocks(){
        System.out.println("Parametresiz COnstructor calisti.");
    }static {
        System.out.println("Statik blok calisti");
    }
    P01_staticBlocks(String isim){
        System.out.println("Parametreli COnstructor calisti.");
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        method1();
        P01_staticBlocks obj1=new P01_staticBlocks();
    }
    public static void method1(){
        System.out.println("Method 1 calisti.");

    }

}
