package Day12_MethodOlusturma;

import java.util.Scanner;

public class P06_ismiIstenenFormattaYazdirma {
    public static void main(String[] args) {



    /*
    Kullanicidan isim soyisim ve kredi karti numarasi alsin.
    asagida verilen sekilde yazdiran bir method olusturun.
    Input: Hamza, Yigit, 4242424242424242424
    Output:H**** Y****, **** **** **** **** 4242

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Adiniz: ");
        String isim = scan.nextLine();
        System.out.println("Soyadiniz: ");
        String soyisim = scan.nextLine();
        System.out.println("Kredi Karti numaraniz: ");
        String kKno = scan.nextLine();
        duzenleYazdir(isim, soyisim, kKno);

    }

        public static void duzenleYazdir(String isim, String soyisim, String kKno){
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w","*");
           //yumusak g gibi turkcede olan sesler icin  regex ile yerine *koyma islemi yapilabilir.
            isim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\W","*");//turkce veya baska dillerdeki ozel karakterler icin.

        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\w","*");
            soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\W","*");///turkce veya baska dillerdeki ozel karakterler icin.
        //\\w harf, rakam, _olan her seyi yildiz yapar.
            // \\W  harf, rakam, _ olmayan her seyi yildiz yapar. (baska dillerde olan harfler
            // varsa isimde bu kullanilabilir. )
        kKno=kKno.substring(kKno.length()-4);

            System.out.println(isim+ " "+soyisim+" "+ "**** **** **** "+kKno);

        }
}

