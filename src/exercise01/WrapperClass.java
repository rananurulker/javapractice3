package exercise01;

public class WrapperClass {
    public static void main(String[] args) {

        int sayi=20;

        String str= "Java Candir";

        System.out.println(str.toUpperCase());//JAVA CANDIR

        char chr1='a';

        //chr1 primitive char oldugundan hazir methodlari olmaz.

        Character chr2='b';

        System.out.println(chr2.charValue());//b

        System.out.println(Character.isLowerCase(chr1)); //true
        System.out.println(Character.isDigit(chr1));  //false


        System.out.println(Integer.MAX_VALUE);//
        System.out.println(Short.MIN_VALUE);//
    }
}
