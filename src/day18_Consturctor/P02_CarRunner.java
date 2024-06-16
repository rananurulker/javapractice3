package day18_Consturctor;

public class P02_CarRunner {
    public static void main(String[] args) {
        P01_Car car1=new P01_Car();

        System.out.println(car1.marka);
        System.out.println(car1.fiyat);
        System.out.println(car1.model);
        System.out.println(car1.yil);
        System.out.println("*******************");

        car1.marka="Renault";
        car1.model="Megane 4";
        car1.yil=2017;
        car1.fiyat=30000;

        System.out.println(car1.marka);
        System.out.println(car1.fiyat);
        System.out.println(car1.model);
        System.out.println(car1.yil);
        System.out.println(car1.toString());
        System.out.println("*******************");

        P01_Car car2=new P01_Car();
        System.out.println(car2);
        car2.marka="Hyundai";
        car2.model="ix35";
        car2.yil=2018;
        car2.fiyat=8000;
        System.out.println(car2);

        System.out.println("*******************");
        P01_Car car3=new P01_Car("Nissan", "Qasqai");
        P01_Car car4=new P01_Car("Opel","Corsa",2018);
        System.out.println(car3);
        System.out.println("*******************");
        System.out.println(car4);



    }
}
