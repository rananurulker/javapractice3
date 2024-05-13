package day09_StringManipulation;

public class P01_IndexofLastIndexOf {
    public static void main(String[] args) {

        String str="Ali topu at; at ali at";

        System.out.println(str.contains("Ali"));
        System.out.println(str.startsWith("ali"));
        System.out.println(str.endsWith("at"));
        System.out.println("13. harf: "+str.charAt(13));
        System.out.println("-------------------------");

        //indexof methodu herhangi bir ifade icinde gecen bir harf, ya da harflerin
        // veyahut da bir kelimenin ilk indexini verir.

        System.out.println(str.length());
        System.out.println(str.indexOf("Ali")); //0
        System.out.println(str.indexOf("ali")); //16
        System.out.println(str.indexOf("a")); //9
        System.out.println(str.indexOf("top")); //4
        System.out.println(str.indexOf("levent")); //-1
        System.out.println(str.indexOf('i'));//2
        System.out.println(str.indexOf(105)); //2 ascii tablsounda i nin karsiligi
        System.out.println(str.indexOf("at"));
        System.out.println(str.indexOf("at",13));//

        //lastindexof methodu aranan harf, karakter veya kelimeyi son indexten baslangica dogru
        //faka bullunca bastan index sayar
        str="Ali topu at; at ali at";
        System.out.println(str.indexOf("at"));//9
        System.out.println(str.lastIndexOf("at")); //20

        System.out.println(str.lastIndexOf("at",14)); //14uncu indexten geriye dogru bak.
        System.out.println(str.lastIndexOf("ali,",10)); //10.indexten geriye dogru bak.



    }
}
