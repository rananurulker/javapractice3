package day28_PolymoprhismAbstractionInterface;

public interface P11_Iinterface {

    //full abstraction saglamak amaciyla kullanilir.
    //bu nedenle tum methodlar public ve abstracttir
    //interface icinde
    //tum variabllelar final static publictir
   // tum methodlar ise public ve abstracttir


    public abstract void method1();

    public void method2();
    abstract void method3();

    void method4();
    int SAYI=20;
    //int yas;Interface icinde tum variablelar final oldugu icin atama yapmadan olusturulamaz

    int method();
}
