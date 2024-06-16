package day29_InterfaceException;

import org.w3c.dom.ls.LSOutput;

public class P04_Exception {
    public static void main(String[] args) {


    /*
    Java compile ederken variablelarin degerlerini gormez,
    sadece data turlerini bilir.
    yazdigimiz kodlari sytax ve data turune gore kontrol eder.
    uygun olmayan durumlarda CTE verir.

    Fakat bazi durumlarda compile time error degil compile time exception verir.
     */

    String str="Java Candir";
        System.out.println(str.substring(5));
       // str.substring(18);

        try {
            str=null;
            System.out.println(str);
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Bos bir string tanimli oldugu icin uzunluk degeri bildirilemez. \nLutfen atama yaptiginiz satiri kontol ediniz");
        }

    }
}

