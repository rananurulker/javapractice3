package day22_DateTimeVarargs_stringBuilder;

public class P04_Varargs {

    public static void main(String[] args) {
        //varargs variety of arguments
        /*
        yeni bir method olusturulurken gonderecegimiz argument sayisi degisken ise
        farkli methodlar olusturmak yerine parametreye varargs atanir


        varargs array al yapisini kullanir.
        girilen tum argumentleri bir array icine koyar.
         */




        toplama(3,2);//5
        toplama(3,2,6);//11
        toplama(3,2,6,9,5);//25
        toplama(1,2,3,4,24,8,6,1);//49

        carpma(12,5,36);


    }
    public static void carpma(int... yeniSayilar){
        int carpim=1;
        for (int each:yeniSayilar){
            carpim*=each;
        }
        System.out.println("carpim: "+carpim);
    }


    public static void toplama(int... sayilar){
        //sayilar bir array ve icinde parametre olarak girilen argumentler var
        //arrayin tum elemanlarini toplamak istersek
        int toplam=0;
        for (int each:sayilar){
            toplam+=each;

        }
        System.out.println(toplam);
    }
   //     System.out.println("Toplam"+(a+b));
//
   // }
   // public static void toplama(int a, int b,int c){
   //     System.out.println("Toplam"+(a+b+c));
   // }
   // public static void toplama(int a, int b,int c, int d, int e){
   //     System.out.println("Toplam"+(a+b+c+d+e));

   // }
}
