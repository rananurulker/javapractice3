package day22_DateTimeVarargs_stringBuilder;

public class P06_Varargs {
    public static void main(String[] args) {
        //argument olarak verilen tamsayilardan
        //ilki haric geriye kalanlari toplayip
        //bulunan toplam degeri ile ilk sayinin carpimini
        //yazdiran bir method olusturun.

        istenenIslem(2,3,5,96,15,7,1);
        istenenIslem(12,15,3,2,4,8,9,136,25,367);

    }
    private static void istenenIslem(int ilkSayi,int...digerSayilar){
        int toplam=0;
        for (int v:digerSayilar){
            toplam+=v;

        }
        System.out.println("Sonuc: "+(ilkSayi*toplam));
    }
}
