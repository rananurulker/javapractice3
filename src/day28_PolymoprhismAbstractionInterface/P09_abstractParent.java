package day28_PolymoprhismAbstractionInterface;

import javax.imageio.stream.ImageInputStream;

public abstract class P09_abstractParent extends P06_AbstractClassGP {

    //abstract classlarin abstract child classlari
    //abstract methodlari override etmek zorunda degildir.
    //eger kod yazan isterse override edebilir.

    public abstract void method1();

    public void method2() {
        System.out.println("abstarct method 2");


    }

    public abstract void method3();

    public abstract void method6();

    public void method7() {
        System.out.println("abstract parent method 7");
        {
            System.out.println("Concrete child method2");
        }
    }
}
