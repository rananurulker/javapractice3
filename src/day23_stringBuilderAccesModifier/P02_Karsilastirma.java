package day23_stringBuilderAccesModifier;

public class P02_Karsilastirma {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        //iki string esitligine bkalim

        // sb1==str bu RTE verir
        System.out.println(sb1.equals(str)); //cte vermez ama false dondurur.
        System.out.println(sb1.toString().equals(str));//true

        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.compareTo(sb2));

        StringBuilder sb3=new StringBuilder("Murat");
        StringBuilder sb4=new StringBuilder("Mustafa");
        StringBuilder sb5=new StringBuilder("Tahsin");
        StringBuilder sb6=new StringBuilder("Can");
        System.out.println(sb3.compareTo(sb4));//-1
        System.out.println('r'-'s');
        System.out.println(sb3.compareTo(sb5));//-7
        System.out.println('M'-'T');
        System.out.println(sb3.compareTo(sb6));//10

    }
}
