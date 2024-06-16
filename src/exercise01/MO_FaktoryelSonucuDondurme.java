package exercise01;

public class MO_FaktoryelSonucuDondurme {
    public static void main(String[] args) {
/*
verilen pozitif  bir tamsayinin
faktoriyel degerini donduren bir method olusturun.
//input 5; output;120
 */




    }

    public static int faktoryelHesapla(int sayi){
        int faktoryel=1;
        for (int i = sayi; i <=1 ; i--) {
            faktoryel *=i;

        }
        return faktoryel;

    }
}
