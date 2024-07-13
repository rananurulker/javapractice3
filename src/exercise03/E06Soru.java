package exercise03;

import java.util.Scanner;

public class E06Soru {
    public static void main(String[] args) {
        /*6----
    Kullanıcıdan bir harf girmesini isteyiniz.
    Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın.
    Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin.
    (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u
    Test Data:
    a
    Beklenen Çıktı:
    a harfi sesli harfdir.
    Test Data:
    d
    Beklenen Çıktı:
    d harfi sesiz harftir.
    Test Data:
    we  yada %
    Beklenen Çıktı:
    Yanlis karakter girdiniz!
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz: ");
        String harf = scanner.next();
        if (harf.length() > 1 || !Character.isLetter(harf.charAt(0))) {
            System.out.println("lutfen dogru karakter girisi yapiniz");
        } else {
            char ch = harf.charAt(0);

            if (harf.equals("a") || harf.equals("e") || harf.equals("i") || harf.equals("o") || harf.equals("u")) {
                System.out.println("girilen harf sesli bir harftir");
            } else {
                System.out.println("girilen harf sessiz bir harftir");
            }

        }
    }
}
