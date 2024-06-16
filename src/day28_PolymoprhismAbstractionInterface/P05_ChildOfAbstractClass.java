package day28_PolymoprhismAbstractionInterface;

import java.util.ArrayList;
import java.util.List;

public class P05_ChildOfAbstractClass extends P04_AbstractClass{

    @Override
    protected void method1() {
        System.out.println("Merhaba");
        }
        P04_AbstractClass obj=new P05_ChildOfAbstractClass(){};

    List<Integer> sayilar=new ArrayList<>();
    }

