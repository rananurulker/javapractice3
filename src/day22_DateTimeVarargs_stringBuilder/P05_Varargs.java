package day22_DateTimeVarargs_stringBuilder;

public class P05_Varargs {
    public static void main(String[] args) {

        //verilen sayilarin icerisindei cift sayilarin toplamini veren bir method yaziniz.

        tekSayilariTopla(12,25,24,38,46,19,108,23,34,128,101,103,1507);
    }

    public static void tekSayilariTopla(int...sayilar) {
       int toplam=0;
        for (int m:sayilar){
            if(!(m%2==0)){
                toplam+=m;

            }

        }
        System.out.println("tek sayilarin toplami: "+toplam);
    }

}
