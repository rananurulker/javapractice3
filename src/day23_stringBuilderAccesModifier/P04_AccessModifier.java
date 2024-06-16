package day23_stringBuilderAccesModifier;

public class P04_AccessModifier {
    public static void main(String[] args) {
        P03_AccessModifier obj=new P03_AccessModifier();

        //System.out.println(obj.privSayi);

        //sadece kendi classinda acidigi icin private methoda baska classtan ulasamayiz

        System.out.println(obj.defsayi);

        //P03 ile ayni package de oldugu icin def sayiya ulasilabilir.

        System.out.println(obj.ProSayi);
        //ayni package de oldugu icin ulasabiliriz

    }
}
