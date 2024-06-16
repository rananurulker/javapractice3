package day26_Inheritance;

public class P05_ParentClass extends P04_GrandParentClass {
    P05_ParentClass() {
        System.out.println("P parametresiz cons calisti");
    }

    P05_ParentClass(String s) {
        System.out.println("P string parametreli cons calisti");
    }

    P05_ParentClass(int i) {
        System.out.println("P integer parametreli cons calisti");
    }
}