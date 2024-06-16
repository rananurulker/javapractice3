package Day12_MethodOlusturma;

public class P07_Faktoriyel {

        /*
        Verilen bir pozitif tam sayının faktöriyel değerini hesaplayıp
        yazdıran bir method oluşturun
        input 5 output = 5! = 120
         */
        public static void main(String[] args) {
            faktoriyelDegeriYazdir(3);
        }
        public static void faktoriyelDegeriYazdir(int sayi) {
            int sonuc=1;
            for (int i = sayi; i >=1; i--) {
                sonuc*=i;
            }
            System.out.println(sonuc);
        }
    }

