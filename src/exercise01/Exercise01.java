package exercise01;

public class Exercise01 {
    public static void main(String[] args) {

        String str= "Rana ders calis, calis rana calis.";

        System.out.println(str.contains("Rana"));
        System.out.println(str.startsWith("Rana"));
        System.out.println(str.endsWith("calis."));


        //index of

        System.out.println(str.indexOf('r'));
        System.out.println(str.indexOf("Rana"));
        System.out.println(str.indexOf("z"));
        System.out.println(str.length());
        System.out.println(str.indexOf("calis",13));

        //lastindex of
        str= "Rana ders calis, calis rana calis.";
        System.out.println(str.indexOf("calis"));
        System.out.println(str.lastIndexOf("calis"));
        System.out.println(str.lastIndexOf("calis",10));



    }
}
