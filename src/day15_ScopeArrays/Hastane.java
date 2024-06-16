package day15_ScopeArrays;

public class Hastane {

    /*
java'da objlerin ortak olan tüm variable'larıstatik olarak oluşturulur
sadece bir obje için gerekli olan variable'lar ise instance oluşturulur

Biz bir obje oluşturduğumuzda Java o obje için tüm instance variable'ların bir kopyasını oluşturur
oluşturulan objeyle instance variablları ilişkilendiriyor
obje.InstancevariableIsmi şeklinde oluşan variable'lara ulaşabiliriz
 */

    static String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdres="Uskudar";
    static String hastaneBashekim="Levent Bey";

    String personelIsmi="Isim Atama Yapilmadi";
    String personelAdres="Adres Atama Yapilmadi";
    int personelAge;
    String personelGorev="Gorev atamasi yapilmadi";

    public static void main(String[] args) {
        //bir personel ekleyelim
        Hastane personel01=new Hastane();
        Hastane personel02=new Hastane();
        Hastane personel03=new Hastane();
        Hastane personel04=new Hastane();
        Hastane personel05 =new Hastane();

        //java tum instance variablelardan bir kopya personel 01 icin olusturdu.

       //System.out.println(personel01.personelIsmi);
       //System.out.println(personel01.personelAdres);
       //System.out.println(personel01.personelAge);
       //System.out.println(personel01.personelGorev);



       //personel01.personelIsmi="Rana Ulker";
       //personel01.personelAdres="Riga";
       //personel01.personelAge=34;
       //personel01.personelGorev="prof.dr.";

       //System.out.println("Atama Sonrasi");
       //System.out.println(personel01.personelIsmi);
       //System.out.println(personel01.personelAdres);
       //System.out.println(personel01.personelAge);
       //System.out.println(personel01.personelGorev);

       //
     //personel02.personelIsmi="Alperen Ulker";
     //personel02.personelAdres="Riga";
     //personel02.personelAge=35;
     //personel02.personelGorev="Kose minderi";

     //System.out.println(personel02.personelIsmi);
     //System.out.println(personel02.personelAdres);
     //System.out.println(personel02.personelAge);
     //System.out.println(personel02.personelGorev);


       //System.out.println();

    }

}
