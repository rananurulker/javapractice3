package exercise01;

public class MOFaktoriyelHesaplama {
    public static void main(String[] args) {
    /*
    verilen pozitif bir tam sayinin faktoriyel degerini yazdiran bir method olusturun.
    input5 output(5*4*3*2*1)
     */
        faktoryelDegeriYazdir(6);
    }

    public static void faktoryelDegeriYazdir(int sayi){
        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *=i;

        }
        System.out.println(sayi+ "! = "+ faktoryel);
    }

}
