package day28_PolymoprhismAbstractionInterface;

public class P03_ChildOfKuralciOlmayanParents extends P02_KuralciOlmayanParent{

    public static void main(String[] args) {

        /*
        Normal bir child parent iliskisinde
        Child Class, parent classtaki methodlardan
        -istedigini direkt parenttaki haliyle kullanir,
        -isedigini degistriip guncelleyip kullanir,
        -isterse de yeni bir method olusturabilir.
         */

        P03_ChildOfKuralciOlmayanParents obj=new P03_ChildOfKuralciOlmayanParents();
        obj.method1();
    }

}
