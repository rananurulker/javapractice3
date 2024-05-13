package day09_StringManipulation;

public class P05_Replace {
    public static void main(String[] args) {

        String str="Java candir. Gerisi heyecandir. ";
        System.out.println(str);
        str=str.replace('a','A');
        System.out.println(str);

        str=str.replace("CAndir.","Kolaydir.");
        System.out.println(str);

        str="Java candir. Selenium heyecandir.";
        //sadece ilk a harfini A yapsin.

        System.out.println(str.replaceFirst("a","A"));




    }
}
