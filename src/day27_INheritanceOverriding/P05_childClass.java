package day27_INheritanceOverriding;

import day26_Inheritance.P05_ParentClass;

public class P05_childClass extends P04_parentClass {
    String isim="Child Isim";
    String telefon="Child telefon";
    String adres="Child adres";
    int yas=60;
    int kilo=154;


    public void method1(){
        System.out.println("Child method - 1");
    }

    public void method3(){
        System.out.println("Child method - 3");
    }
    public void method4(){
        String adres="Method adress";
        int yas=40;
        System.out.println(yas);//40  [kendi scopeu]
        System.out.println(this.yas);//60 class instance
        System.out.println(super.yas);//44 parent
        System.out.println(adres);
        System.out.println(this.adres);
        method1();
        this.method1();
        super.method1();
    }
    /*
    Javada herhangi bir scopeta bir variable ya da method kullanmak isterseniz
    java asagidaki sira ile variable methodu arar
    1-icinde olunan scope
    2- icinde olunan class
    3-extend edilen class
     */

    public static void main(String[] args) {
        P05_childClass obj=new P05_childClass();
        obj.method4();

    }

}

