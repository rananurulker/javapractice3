package day14_doWhileLoopClassVariable;

public class P06_LocalVariable {
    public static void main(String[] args) {
//local variablelar method veya kod blogu icinde olusturulurlar.
        //sadece olusturulduklari kod blogu icinde kullanilabilirler.
        //kod blogu disinda kullanilamazlar.
        //bir method icinde olusturlmussa sadece o method icinde kullanilir. disinda kullanilmazlar.
        //local variabllar deger atamadan olusturulabilir ancak deger atamadan kullanilamazlar.

        String str="Suslu paranteze dikkat";
        System.out.println(str);

        for (int i = 0; i < 10; i++) {
            boolean bl=true;
            System.out.println(i);
            System.out.println(bl);
            System.out.println(str);
            str="Merhaba";

        }
        System.out.println(str);
        String s;
        int a;
        char k;
        //System.out.println(s);
        //a++;


    }
    public void method1(){
       // System.out.println(str);
        int sayi=30;
        System.out.println("sayi= "+sayi);
        
    }

}
