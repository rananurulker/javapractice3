package day22_DateTimeVarargs_stringBuilder;

public class P07_varargsDikkatEdilecekler {
    public static void main(String[] args) {
        /*
        Varargs olayinda dikkat edilecek en onemli sey;

        -Varargs (int ... )parametresi en sonda olmalidir.
        -Buna bagli olarak da iki veya daha fazla varargs parametre olarak girilemez.

         */

        // argument olarak verilen tamsayilardan
       // ilki haric geriye kalanlari toplayip
       // bulunan toplam degeri ile ilk sayinin carpimini
       // yazdiran bir method olusturun

        islem(1,3,4,2,6,9,12,56,45);



    }public static void islem(int...sayilar){
        //varargsda son elemani varargs parametresinden sonra giremeyiz.
        int toplam=0;
        int LastElement=sayilar[sayilar.length-1];

        for (int i = 0; i <=sayilar.length-2 ; i++) {
            toplam+=sayilar[i];

        }
        System.out.println("Sonuc: "+(LastElement*toplam));
    }
}
