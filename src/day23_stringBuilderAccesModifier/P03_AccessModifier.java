package day23_stringBuilderAccesModifier;

public class P03_AccessModifier {
    int defsayi=10;//access modifier olarak default atadi
    //default int sayi2=10; default gorunur olarak atanmaz

    private int privSayi=20;
    protected int ProSayi=30;
    public int publicSayi=40;

    public static void main(String[]args){
        P03_AccessModifier obj=new P03_AccessModifier();
        System.out.println(obj.privSayi);
        obj.privSayi=25;
        obj.methodPriv();


       //default access modifiera icinde bulundugu class ve package dan ulasilabilir.

        System.out.println(obj.defsayi);
        obj.defsayi=15;
        obj.methodDefault();

        System.out.println(obj.ProSayi);
        obj.ProSayi=35;
        obj.proMethod();
    }

    protected void proMethod() {
        System.out.println("Protected method calisti");
    }

     void methodDefault() {
        System.out.println("Default method calisti");
    }


    //Private access modifiera sadece icinde bulundugu classtan ulasilabilir.

    private void methodPriv() {
        System.out.println("Private method calisti.");
    }
}
