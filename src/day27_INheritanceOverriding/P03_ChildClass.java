package day27_INheritanceOverriding;

public class P03_ChildClass extends P02_ParentClass {
    P03_ChildClass(){
        super("Murat");
        System.out.println("C parametresiz cons calisti");
    }

    P03_ChildClass(String s){
        super (5);
        System.out.println("C string parametreli cons calisti");
    }

    P03_ChildClass(int i){
        System.out.println("C integer parametreli cons calisti");
    }

    public static void main(String[] args) {

        P03_ChildClass obj3=new P03_ChildClass("Sena");
       // P03_ChildClass obj2=new P03_ChildClass();
       // P03_ChildClass obj=new P03_ChildClass(5);

        //extends keyword varsa her constructoin
        //ilk satirindamutlaka bir cons olmalidir.

        //gorunur bir cos yksa java default olarak parametresiz bir super cons koyar

        //kodu yazan kisi this ile super constlarindan sadece bir cons yazabilir.
        //cunku sadece bir adet cons call olabilir.
        //herhangi bir cons varsa java super koymaz


    }
}
