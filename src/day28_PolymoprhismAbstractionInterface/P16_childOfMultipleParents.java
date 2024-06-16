package day28_PolymorphismAbstractionInterface;

import day28_PolymoprhismAbstractionInterface.P13_Parent;
import day28_PolymoprhismAbstractionInterface.P14_InterfaParent;
import day28_PolymoprhismAbstractionInterface.P15_InterfaceParent2;

public class P16_childOfMultipleParents
        extends P13_Parent
        implements P14_InterfaParent, P15_InterfaceParent2 {
    @Override
    public void method2() {
        //InterfaceParent mutlaka method2() olmalı
        //InterfaceParent2 mutlaka method2() olmalı


    }

    @Override
    public int method3() {
    return 71;
    }

    public static void main(String[] args) {
        P16_childOfMultipleParents obj=new P16_childOfMultipleParents();
        obj.method1();
        obj.method2();
        obj.method3();

        
    }
}