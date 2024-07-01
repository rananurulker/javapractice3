package exercise03;

public class methodOlusturmaYoutube {
    public static void main(String[] args) {
        /*
        Input olarak verilen isim ve soyismi ilk harfleri buyuk
        diger harfleri kucuk olarak degistirin
        programn sonraki boumlerinde kullanilamk uzere metod olusturun
       .
         */
        String isim= "CANAN";
        String soyisim="DEMIR";
        String isimSoyisim=isimDuzenle(isim, soyisim);
        System.out.println("Ismin ilk girilen hali: "+isim+ " "+ soyisim);
        System.out.println("Ismin duzenlenmis hali: "+ isimSoyisim);
        }

    private static String isimDuzenle(String isim, String soyisim) {
        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase();
        String soyIsimDuzenlenmis=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();


        return isimDuzenlenmis+ " "+soyIsimDuzenlenmis;
    }
}


