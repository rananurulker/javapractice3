package exercise03;

public class methodOlusturmaVoid {
    public static void main(String[] args) {
        /*
        Input olarak verilen satis fiyati, musteri karti var mi?

       uyeligi kac yillik bilgilerini degerlendirin.

       uye degilse yuzde 5 indirim
       uye ise ama uyeligi 5 yildan az ise yuzde 10 indirim
       uyeligi var ve 5 yildan cok ise yuzde 15 indirim
       asil fiyati, indirim miktari ve indirimli fiyati yazdiran bir method olusturun.
         */
        boolean uyeMi=true;
        int uyelikYili=3;
        double satisFiyati=250;

        indirimliFiyatHesapla(uyeMi, uyelikYili,satisFiyati);

    }
    public static void indirimliFiyatHesapla(boolean uyeMI, int uyelikYili, double satisFiyati){
        if (uyeMI){
            if (uyelikYili<5){
                System.out.println("Urun fiyati: "+satisFiyati);
                System.out.println("Indirim miktari"+ satisFiyati*0.1);
                System.out.println("indirimli fiyat"+ (satisFiyati-satisFiyati*0.1));
            }else {
                System.out.println("Urun fiyati: "+satisFiyati);
                System.out.println("Indirim miktari"+ satisFiyati*0.15);
                System.out.println("indirimli fiyat"+ (satisFiyati-satisFiyati*0.15));
            }

        }else

            System.out.println("Urun fiyati: "+satisFiyati);
        System.out.println("Indirim miktari"+ satisFiyati*0.05);
        System.out.println("indirimli fiyat"+ (satisFiyati-satisFiyati*0.05));


    }
}
