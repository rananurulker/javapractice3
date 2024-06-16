package exercise01;

public class MO_IsmiDuzenleKaydet {
    public static void main(String[] args) {

        String duzenlenmisHali="";


    String isim="Rana";
    String soyisim="Ulker";
    String kkNo="5656787890907856";
    isimDuzenleKaydet(isim,soyisim,kkNo);
    //bu method calisir ama kaydetmedik ve yazdirmadigimiz icin sonucu gormeyiz.
        //ya kaydetmeli ya da yazdirmaliyiz.

        System.out.println(isimDuzenleKaydet(isim,soyisim,kkNo));

        duzenlenmisHali=isimDuzenleKaydet(isim, soyisim, kkNo);
        System.out.println(duzenlenmisHali);
        duzenlenmisHali=duzenlenmisHali.replace("*","#");
    }
    /*
    Verilen bir isim, soyisim ve KK numarasini asagida verilen formatta yazdiran bir method olusturun.
    input; Ali, Kayali, 1234567890123456
    output; A** K**** **** **** **** 3456
     */

    public static String isimDuzenleKaydet(String isim, String soyisim, String kkNo){

        String duzenlenmisHali=isim.toUpperCase().charAt(0)+
                isim.substring(1).replaceAll("\\w","*")+
                " "+
                soyisim.toUpperCase().charAt(0)+
                soyisim.substring(1).replaceAll("\\w","*")+
                " **** **** **** " +
                kkNo.substring(kkNo.length()-4);

        return duzenlenmisHali;
    }
}
