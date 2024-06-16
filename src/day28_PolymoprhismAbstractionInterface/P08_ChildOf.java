package day28_PolymoprhismAbstractionInterface;

public class P08_ChildOf extends P07_ChildOfAbstractClassGP{
    public static void main (String[]args){
        P08_ChildOf obj=new P08_ChildOf();
        obj.method1();//concrete method 1 calisti
        obj.method2();//concrete method 2 calisti
        obj.method3();//concrete method 3 calisti
        obj.method4();//abstractGP method 4 calisti
        obj.method5();//concrete method 5 calisti
    }

}
