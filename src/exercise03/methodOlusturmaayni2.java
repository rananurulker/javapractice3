package exercise03;

public class methodOlusturmaayni2 {
    public static void main(String[] args) {


    /*
        verilen sayinin asal sayi olup olmadigini kontrol edip,
        sonuc olarak sayi veya asal sayi degil yazdiran bir method olusturun.
         */
        asalSayiMidir(17);
    }

    public static void asalSayiMidir(int sayi){
        for (int i = 2; i <=sayi ; i++) {
            if (i==sayi){
                System.out.println("verilen sayi asal sayidir.");

        }else if (sayi%i==0){
                System.out.println("verilen sayi asal sayi degil");
                break;
            }
        }
    }

}
