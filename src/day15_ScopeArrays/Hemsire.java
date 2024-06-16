package day15_ScopeArrays;

public class Hemsire {
    public static void main(String[] args) {
        System.out.println("1-"+Hastane.hastaneIsmi);
        System.out.println("======== Personel Isim Listesi========");
        Hastane personel01= new Hastane();
        personel01.personelIsmi="Murat Babayigit";
        personel01.personelGorev="Hemsire";
        personel01.personelAge=44;

    }
}
