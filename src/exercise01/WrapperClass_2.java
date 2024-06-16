package exercise01;

import javax.sound.midi.Soundbank;

public class WrapperClass_2 {
    public static void main(String[] args) {

        //String olarak verilen iki tamsayiyi toplayin.

        String fiyatstr1= "23";
        String fiyatStr2= "45";

        System.out.println(fiyatstr1+fiyatStr2); //bunun cevabi 2345 tir. yanyana yazar

        //toplamayi yapabilmek icin once String fiyatlari integera cevirmeliyiz.

        System.out.println(Integer.parseInt(fiyatstr1)+Integer.parseInt(fiyatStr2));

        String fiyatstr3= "23.56";
        String fiyatStr4= "45.21";

        System.out.println(Double.parseDouble(fiyatstr3) + Double.parseDouble(fiyatStr4));

    }
}
