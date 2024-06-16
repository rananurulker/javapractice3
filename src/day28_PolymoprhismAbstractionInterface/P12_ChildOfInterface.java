package day28_PolymoprhismAbstractionInterface;

public class P12_ChildOfInterface implements P11_Iinterface {
    @Override
    public void method1() {}

    @Override
    public void method2() {}

    @Override
    public void method3() {}

    @Override
    public void method4() { }

    @Override
    public int method() { return 0;}

    public static void main(String[] args) {
        System.out.println(SAYI);
        //sayi 20

        //hepsi buyuk harf ise FINAL dir. degisiklik yapilamaz

        System.out.println(Math.PI);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }
}
