package day28_PolymoprhismAbstractionInterface;

public class P10_childOfAbstractParent extends P09_abstractParent{

    //abstract bir silsileden gelen ilk concrete class
    //parent abstract classta concrete edilmemis
    //tum abstract methodlari override etmek zorunda birakir.
    @Override
    public void method1() {
        System.out.println("Concrete child method1");

    }

    @Override
    public void method2() { System.out.println("Concrete child method2");

    }

    @Override
    public void method3() {
        System.out.println("Concrete child method3");

    }

    @Override
    public void method6() { System.out.println("Concrete child method6");

    }

    public static void main(String[] args) {
        P10_childOfAbstractParent obj=new P10_childOfAbstractParent();
        obj.method1();
        obj.method2();
        obj.method4();
        obj.method6();
        obj.method7();
    }
}
