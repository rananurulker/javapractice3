package day19_ConstructorCall_StaticKeyWords;


import day18_Consturctor.P01_Car;

public class P01_ConstructorCall {

    P01_ConstructorCall(){
        //this("Murat");//constructor da bir sey cagiracaksm cagiracagim seyi this ile basina yazmaliyim.
       // this("Levent",40);
        this(8);
        System.out.println("Parametresiz constructor calisti.");

        //P01_ConstructorCall("Murat"); //method call expected
        //Parametre icindeki isim yazimi sadece methodlar icin kabul edilir.
        //constructor call icin
        //this keywordu yardimiyla call yapilir.
    }

    P01_ConstructorCall(String isim){
        System.out.println("Isim parametreli construtor calisti.");
    }

    P01_ConstructorCall(int sayi){
        System.out.println("sayi parametreli constructor calisti.");
    }

    P01_ConstructorCall(String isim,int sayi){
        System.out.println("isim ve sayi parametreli constructor calisti.");
    }
    public static void main(String[] args) {
        System.out.println("main method calisti.");
        method1();
        P01_ConstructorCall obj=new P01_ConstructorCall();

    }

    public static void method1(){
        method2();
        System.out.println("method 1 calisti.");

    }

    public static void method2(){
        System.out.println("method 2 calisti.");
    }

}

