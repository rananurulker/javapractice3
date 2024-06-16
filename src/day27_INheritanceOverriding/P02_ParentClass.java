package day27_INheritanceOverriding;

public class P02_ParentClass extends P01_GrandParentClass {
    P02_ParentClass() {
        System.out.println("P parametresiz cons calisti");
    }

    P02_ParentClass(String s) {
        this();
        System.out.println("P string parametreli cons calisti");
    }

    P02_ParentClass(int i) {
        super("Esma");
        System.out.println("P integer parametreli cons calisti");
    }
}