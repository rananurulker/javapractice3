package day24AccessModifierEncapsulation;

import org.w3c.dom.ls.LSOutput;

public class P04_RaporErisim {



    public static void main(String[] args) {
        P03_RaporClass obj=new P03_RaporClass();

        //satisTutari ve ToplamSatisTutari private oldugu icin
        //normal yollarda bu variablellara ulasilamaz.

        //Burada devreye encapsulation giriyor
        //encapsulation data hiding adi da verilir.

        System.out.println(obj.getSatisTutari());
        obj.setSatisTutari(200);
        obj.setSatisTutari(4000);
        obj.setSatisTutari(600);
        obj.setSatisTutari(500);
        obj.setSatisTutari(800);
    }

}
