package day14_doWhileLoopClassVariable;

public class P07_ClassVariables {
    /*
    Class variable'lar adindan anlasilacagi uzere class scope icinde ama tum diger kod bloklarinin
    disinda olusturulur.

    Class levelda olusturulan variablelar en ustte olusturulmak zorunda degildir fakat genel kabul
    ve gorunurluk acisindan ustte tanimlanmasi uygun gorulur.

    class levelda olusturulan variable kullanim amacina uygun olacak sekilde static keyword ile tanimlanabilirler.
    lokal variablelar static olarak isaretlenemezler.
    static olarak isaretlenmeyen variablelara instance variable diyoruz.

    Class variable ister static olarak isaretlensin, isterse isaretlenmesin scopelari tum classtir.
    Class variablelar ister static olsun ister olmasin deger atamadan deklare edilebilir ve kullanilabilir.
    Eger herhangi bir class variable deger atamadan olusturulursa kullanilacagi zaman Java ona default deger atar.
    Javanin belirledigi default degerler
    char==> hiclik (' ')
    sayisal primitiveler ==> 0
    boolean ==> false
    non-primitiveler==>null
     */

    String str1="Java";//instance bir class variable
     static int sayi1=10;
     static char a;
    static int b;
    static double c;
    static String d;
    static boolean e;

    public static void main(String[] args) {
        // static int sayi2=120;
        System.out.println(sayi1);//sayi1 static oldugu icin her yerden ulasabiliriz.

        //System.out.println(str1);//str1 instance oldugu icin method secici olur.
        //main method static oldugu icin kendisinden (static)olmayani kabul etmez.
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);
    }
    public void method1(){
        System.out.println("a = "+a);//abcde static oldugu icin her yerden direkt ulasilir.
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);

        System.out.println(str1);//instanca variablelar method secicidir. Method static degilse onun icinde de calisir.
        // Class levelde tanimlanan instance variablelar static olmayan methodlarda kullanilabilir.
    }

    public static void method2(){
        System.out.println("a = "+a);//abcde static oldugu icin her yerden direkt ulasilir.
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);

       // String str1="tava";
       // System.out.println(str1);

    }

}

