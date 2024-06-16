package exercise01;

public class MOISmiIStenenFormattaYazdirma {
    public static void main(String[] args) {
    isimDuzenleYazdir("Rana","Ulker","5656787890907856");
    }

    String isim="Rana";
    String soyisim="Ulker";
    String kkNo="5656787890907856";
    /*
    Verilen bir isim, soyisim ve KK numarasini asagida verilen formatta yazdiran bir method olusturun.
    input; Ali, Kayali, 1234567890123456
    output; A** K**** **** **** **** 3456
     */

    public static void isimDuzenleYazdir(String isim, String soyisim,String kkNo){
        String duzenlenmisHali=isim.toUpperCase().charAt(0)+
                                isim.substring(1).replaceAll("\\w","*")+
                                " "+
                                soyisim.toUpperCase().charAt(0)+
                                soyisim.substring(1).replaceAll("\\w","*")+
                                " **** **** **** " +
                                kkNo.substring(kkNo.length()-4);
        System.out.println(duzenlenmisHali);
    }

}
