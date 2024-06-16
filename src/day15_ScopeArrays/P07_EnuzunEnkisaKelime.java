package day15_ScopeArrays;

public class P07_EnuzunEnkisaKelime {
    public static void main(String[] args) {
        //Verilen bir String arraydaki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String [] isimler={"Rana","Huzur","Alperen","Yavuz","Senaaa","Keitijaaa"};
        enUzunEnKisaYazdir(isimler);
    }
    public static void enUzunEnKisaYazdir(String [] kelimeler){//methodun parametresini array olarak belirledik
        String enKisa=kelimeler[0];
        String enUzun=kelimeler[0];
        for (int i = 0; i <kelimeler.length ; i++) {
            if (kelimeler[i].length() >enUzun.length()){
                enUzun=kelimeler[i];
            }
            if (kelimeler[i].length()<enKisa.length()){
                enKisa=kelimeler[i];
                
            }
            
        }
        System.out.println("enKisa = " + enKisa);
        System.out.println("enUzun = " + enUzun);
    }
}
