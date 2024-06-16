package exercise01;

public class MethodOlusturmaAsalSayiSOru {
    public static void main(String[] args) {

        //verilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak asal sayi veya asal sayi degil yazdiran bir method olusturun.

        asalSayiMiSonucYazdir(15);
    }


    //main methodun disinda baslar ama calistirmak istersek main methodun icinden cagirmak gereklidir

        public static void asalSayiMiSonucYazdir(int sayi){

            for (int i = 2; i <=sayi ; i++) {

                if (i==sayi){
                    System.out.println("Verilen sayi asal sayidir");
                } else if (sayi%i==0) {
                    System.out.println("Verilen "+sayi+" sayisi asal sayi degildir.");
                    break;

                }

            }

        }
}
