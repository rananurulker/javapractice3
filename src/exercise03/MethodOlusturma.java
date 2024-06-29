
package exercise03;

public class MethodOlusturma {
    public static void main(String[] args) {

        /*
        verilen sayinin asal sayi olup olmadigini kontrol edip,
        sonuc olarak sayi veya asal sayi degil yazdiran bir method olusturun.
         */
        asalSayiMiSonucYazdir(15);
    }

    public static void asalSayiMiSonucYazdir(int sayi){

        for (int i = 2; i <=sayi ; i++) {

            if (i==sayi) {
                System.out.println("verilen sayi asal sayidir. ");
            } else if (sayi%i==0){
                System.out.println("Verilen sayi asal sayi degildir. ");
                break;

            }
        }

    }
}
