package day26_Inheritance;

public class P06_ChildClass extends P05_ParentClass {
    P06_ChildClass(){
        System.out.println("C parametresiz cons calisti");
    }

    P06_ChildClass(String s){
        System.out.println("C string parametreli cons calisti");
    }

    P06_ChildClass(int i){
        System.out.println("C integer parametreli cons calisti");
    }

    public static void main(String[] args) {
        P06_ChildClass obj=new P06_ChildClass(5);
    }
}
