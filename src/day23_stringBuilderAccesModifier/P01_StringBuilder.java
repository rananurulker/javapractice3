package day23_stringBuilderAccesModifier;

import javax.print.DocFlavor;

public class P01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder str=new StringBuilder("Have a nice day");
        System.out.println(str);
        str.append("!");

        System.out.println(str);

        StringBuilder str2=new StringBuilder(7);
        System.out.println(str2.append("have a nice day"));
        System.out.println(str2);
        str2.replace(7,9,"WiseQuarter");
        System.out.println(str2.delete(5,11));
        System.out.println(str2.insert(4,"guzeldir"));

        StringBuilder str3=new StringBuilder("Java Candir");
        System.out.println(str3);
        System.out.println(str3.substring(5));
        System.out.println(str3);

        System.out.println(str3.toString().toLowerCase());
        System.out.println(str3.reverse());

    }
}
