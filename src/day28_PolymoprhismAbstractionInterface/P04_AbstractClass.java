package day28_PolymoprhismAbstractionInterface;

public abstract class P04_AbstractClass {
    /*
    Javada normal bir child parent iliskisinde genelde soz sahibi child class olur
    Java bu soz sahibi olma durumunu parent classa vermek icin abstract class kullanimini getirmistir.

    Bir class olusturuldugunda bu class parent edinmek isteyen
    child classlar parent tarafindan belirlenen bazi methodlari override etmek zorundadir.

    Abstract classlarin kullanimi mecburi degildir.
    Eger obje olusturmadan child classlardaki ortak ozelliklerini belirleyerek kullanmanizi saglar.

    Bir classin child classlarinin bazi methodlari
    override etmeye zorlamak icin classin abstract edilmesi gerekir.

    1-Class signatureda abstract keyword kullanilmalidir.
    2-Child classlarin bazi methodlari override etmek icin method signaturea abstract keyword eklenir.
    3-Abstract merhodlar bodysiz olur.

    abstract methodlarin bodysi olmadigindan
     */

    //child classlarin override etmesini istedigimiz methodun signaturauna abstract keyword ekledik.
    //bunun yerine abstract methodlara body kazandiran chil classlarin
    //constractarlari kullanilabilir.

    //child classlarin override etmesini istedigimiz methodun signatureuna abstract keyword ekledik
    protected abstract void method1();{}

    protected void method2(){System.out.println("Parent Method 2");}
    protected void method3(){System.out.println("Parent Method 3");}


}
