package Day12_MethodOlusturma;

public class P08_methodOverloading {
    public static void main(String[] args) {
        carpim(2,3,5);
        carpim(2,5);
        carpim(5,2,3);
    }
    public static void carpim(double sayi1, double sayi2){
        System.out.println(sayi1*sayi2);
    }public static void carpim(double sayi1, double sayi2, double sayi3){
        System.out.println(sayi1*sayi2+sayi3);
    }

}
