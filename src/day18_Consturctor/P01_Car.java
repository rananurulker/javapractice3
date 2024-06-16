package day18_Consturctor;

//Bir class olusturunca Java hemen default constructor olusturur.
//bunun sebebi bizim olusturacagimiz her objeye deger atayabilmek icin constructor calismasi sarttir.

//default constructor ozellikler
//gorunmezdir
//parametresizdir
//public
//bodysinde kod yoktur
//class ismi ile birebir ayni isimdedir

//eger bir objenin bazi ozelliklerini bastan tanimlamak istersek o ozellikleri
//constructora parametre olarak yuklememiz gerekir.

//bu yukleme constructor calistiginda direkt atama yapilmasini saglar.
//fakat dikkat edilmesi gereken en onemli seylerden birisi gorunur bir constructor oldugunda
//default constructor hakkin rahmetine kavusur.(ister parametreli, ister parametresiz olsun.)

//default constructor ile olusturulan objelerin calismaya devam etmesi icin class ismi ile
// birebir ayni parametresiz constructor olustururur.

public class P01_Car {

    String marka="Belirlenmedi";
    String model;
    int yil;
    int fiyat;


    P01_Car(String marka, String model, int yil,int fiyat){
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
    }


    P01_Car() {

    }

    //asagidaki gibi parametreli bir constructor olusturuldugunda default oldugu icin onun yaptigi isi
    //yapacak onunla ayni olan paramtresiz bir constructor olustururuz.
    // class ismi ile birbir ayni olmali.
    //kod icermeyen bir scope a sahip
    //bu default constructora benzer ama default degildir


    //parametre ismi instance variable ile ayni deguilse atama yapilabilir.
    //-marka=mrk      model=mdl


    //parametre ismi instance variable ile ayni ise scope nedeniyle Java ilk olarak class leveldeki
    // variablelara bakmaz, bu durumda da obje olusturunca deger atamasi yapamaz. variablein basina this. kullanilirsa
    // java scopea degil class levela bakiyor.


    P01_Car(String mrk, String mdl){
        marka=mrk;
        model=mdl;
    }

    P01_Car(String mrk, String mdl, int yl){
        marka=mrk;
        model=mdl;
        yil=yl;
    }


    //objenin yazdirmak istedigimiz ozelliklerini
    //toplu bir sekilde yazdirabilmek icin
    //toString methodu kullanilir/

    //sag tiklanir generate den toString secilir ve istenen method olusturulur
    @Override
    public String toString() {
        return "Arac bilgleri: " +"\n"+
        "Marka='" + marka + "\n" +
                ", Model='" + model + "\n" +
                ", yil=" + yil + "\n"+
                ", fiyat=" + fiyat ;
    }
}
