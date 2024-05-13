package day09_StringManipulation;

public class P03_isEmptyisBlank {
    public static void main(String[] args) {
        String str1="";
        String str2=" ";
        String str3="        ";
        String str4="    .     ";

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str4.length());

        //isempty() methodu string ifadenin icinde herhangi bir sey var mi yok mu ona bakar.
        //eger hicbir sey yoksa (lenght==0) ise true verir.
        //bosluk dahil herhangi bir karakter varsa false verir.

        System.out.println(str1.isEmpty()); //true
        System.out.println(str2.isEmpty());//false
        System.out.println(str3.isEmpty());//false
        System.out.println(str4.isEmpty());//false

        //isbalnk methodu icindeki bosluk karakteri haric bir sey var mi diye bakar
        System.out.println(str1.isBlank()); //true
        System.out.println(str2.isBlank());//true
        System.out.println(str3.isBlank());//true
        System.out.println(str4.isBlank());//false; bosluk disinda karakter varsa false verir
    }
}
