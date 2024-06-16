package day20StaticBlocksMutableImmutable;

public class P03_passByValue {

    //verilen bir sayinin karesini alip, sayiyi bize donduren bir method yazdir.



    public static void main(String[] args) {
        int sayi=10;
        System.out.println(karesiniAl(sayi));//100
        System.out.println("Method call sonrasi sayinin degeri: "+sayi);//10


        //eger methodda yapilan degisimin kalici olmasi istenirse
        //atama yapilmalidir.

        sayi=karesiniAl(sayi);
        System.out.println("Atama yapildiktan sonra sayinin degeri: "+sayi);//100
        System.out.println(karesiniAl(sayi));//10000


    }

    private static int karesiniAl(int sayi) {
      sayi=sayi*sayi;

        return sayi;
    }
}
