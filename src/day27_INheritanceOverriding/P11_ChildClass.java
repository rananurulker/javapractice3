package day27_INheritanceOverriding;

public class P11_ChildClass extends P10_ParentClass{

    /*
    Biz ayni classta ayni signaturea sahip method olusturulamaz.

    bir methodun override edilebilmesi icin methodun child classta olusturulmasi gerekir.

    ayni zamanda parent classtaki signature ile ayni olmasi gerekir.
     */
    public void method1(int a){

        //method isminin ayni olmasi, override icin yeterli degildir.
        //signaturelarin da birebir ayni olmasi gerekir.
    }

    @Override
    public void method1() {
        //override islemi olabilmesi icin access modifier, return type da ayni olmalidir. 
    }
}
