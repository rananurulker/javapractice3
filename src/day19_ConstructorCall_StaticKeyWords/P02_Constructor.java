package day19_ConstructorCall_StaticKeyWords;

public class P02_Constructor {
    String isim = "Ahmet";

    public static void main(String[] args) {
        P02_Constructor obj1 = new P02_Constructor();

        System.out.println(obj1.isim);//Ahmet
        obj1.isim = "Hamza";

        System.out.println((obj1.isim));//Hamza

        obj1.method2();//Statik olmayan method calisti
        obj1.method1();//Static method calisti

        method1(); //static method calisti

        System.out.println("=======yukaridaki constructor esitliginin sag tarafini kullanalim=======");

        System.out.println(new P02_Constructor().isim);// Ahmet
    }

    public static void method1() {
        System.out.println("Static method calisti.");
    }

    public void method2() {
        System.out.println("Static olmayan method calisti.");


        System.out.println("=======yukaridaki constructor esitliginin sol tarafini kullanarak=======");

        P02_Constructor obj2=null;
        obj2.method1();
        
    }

}
