package day29_InterfaceException;

import day26_Inheritance.P02_Opel;

public class P02_ChildofImplementIstisna implements P01_InterfaceIstisna{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }
    /*
    implemenet ettigimiz P01_Inerfacee sonradan ekledigimiz methodlar
     bodye sahip oldugu icin override etme zorunlulugu yoktur.

     interface icinde bodysi olan istisnai methodlari olusturmak icin
     statik ve default keywordleri kullanilir.

     o methodlara erisim yontemindeki farkliliklara gore statik ya da default olacagina karar verilir.

     Static keyword ile olusturulan istisnai methodlara class ismi ile ulasilabilir.
     default keyword ile olusturulan istisnai methodlara default obje olusturularak ulasilabilir. 
     */

    public static void main(String[] args) {
        P01_InterfaceIstisna.method5();

        P02_ChildofImplementIstisna obj=new P02_ChildofImplementIstisna();
        obj.method4();
    }
}
