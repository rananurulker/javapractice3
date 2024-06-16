package day18_Consturctor;

public class P03_codeInstructor {

    String name="Atanmadi";
    String address="Girilmedi";
    int age;

    P03_codeInstructor(){
        age=40;
    }
    P03_codeInstructor(int age){
        age=30;
        address="Uskudar";
    }
    P03_codeInstructor(String name, String address){
        this.name=name;
        this.address="Besiktas";
    }

    public static void main(String[] args) {

        P03_codeInstructor obj2=new P03_codeInstructor("Ahmet","Beykoz");
        System.out.println(obj2.age+","+obj2.name+","+obj2.address);

       // P03_codeInstructor obj1=new P03_codeInstructor();
       // System.out.println(obj1.age+","+obj1.name+","+obj1.address);

       // P03_codeInstructor obj2=new P03_codeInstructor(44);
        //System.out.println(obj2.age+","+obj2.name+","+obj2.address);
    }
}
