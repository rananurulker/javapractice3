package day27_INheritanceOverriding;

public class P01_GrandParentClass {

    P01_GrandParentClass() {
        System.out.println("GP Parametresiz");
    }
    P01_GrandParentClass(String s){
        this(12);
        System.out.println("GP string parametreli");
    }

    P01_GrandParentClass(int i){
        System.out.println("Gp int parametreli");

    }

}

