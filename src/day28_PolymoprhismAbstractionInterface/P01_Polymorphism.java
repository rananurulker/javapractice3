package day28_PolymoprhismAbstractionInterface;

import day27_INheritanceOverriding.P07_Hayvanlar;
import day27_INheritanceOverriding.P08_kuslar;
import day27_INheritanceOverriding.P09_avciKus;

public class P01_Polymorphism {
    public static void main(String[] args) {

        String str="Java Candir";

        System.out.println(str.substring(3));//a Candir
        System.out.println(str.substring(3,6));// a C

        P09_avciKus kartal1=new P09_avciKus();
        System.out.println(kartal1.gaga);
        System.out.println(kartal1.pence);

        P08_kuslar kartal2=new P09_avciKus();
        System.out.println(kartal2.hareket);
    }
}
