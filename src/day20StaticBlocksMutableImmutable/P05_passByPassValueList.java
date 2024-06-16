package day20StaticBlocksMutableImmutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class P05_passByPassValueList {
    /*
    Javada tek deger atanan int double string gibi data turlerini
    methoda yolladiginizda method islem yapip degisiklik olusturursa
    bu degisiklik methodda kalir.
    taa ki main methodda atama yapana kadar.

    atama yapilmadikca, main methoddaki orijinal variable degismez.

    PassByValue array gibi list gibi coklu eleman barindira yapilarda biraz farkli davraniz(araba ornegi gibi)

    methoda coklu elelman barindiran array ya da list yollarsak method icinde bir array
    ya da yeni bir list atanirsa o degisiklik sadece method icin gecerlidir.
    java o degisiklik main method icin kabul etmez.
    araba degisirse eski arabayi ister.

    ama method sadece gonderilen arrayin elemanlarini degistirir ve geri dndururse
    java bu degiskligi kabul eder. araba ayni gelsin de kim getirirse getirsin.
    
     */
    public static void main(String[] args) {


    List<Integer> sayilar=new ArrayList<>(Arrays.asList(3,5,9,12,35,64));
        System.out.println(sayilar);//[3, 5, 9, 12, 35, 64]

        /*
        arraye eleman olarak 100 ekleyip bize donduren bir method yaziniz.
         */
        elemanEkle(sayilar);

        //verilen listteki 2.indexte yer alan elemani silip bize donduren methodu yazin

        elemanSil(sayilar);
        yeniListOlustur(sayilar);
    }

    public static void yeniListOlustur(List<Integer> sayilar) {
        List<Integer> randomList=new ArrayList<>();
        Random random=new Random();

        for (int i = 0; i < sayilar.size() ; i++) {
            randomList.add(random.nextInt(100));


        }
        sayilar=randomList;
        System.out.println("Random liste eklendikten sonraki hali: ");
    }

    public static void elemanSil(List<Integer> sayilar) {
        sayilar.remove(2);
        System.out.println(sayilar);
    }

    public static void elemanEkle(List<Integer> sayilar) {
        sayilar.add(100);

        System.out.println("Yeni eleman eklenen hali ile array: "+sayilar);
    }

    //verilen listeye esit sayida eleman icerecek sekilde bir list olusturup
    //eski listeye yeni olusturulan listi atayip
    //ilk listin son halini bize yazdiran bir method olusturun.



}
