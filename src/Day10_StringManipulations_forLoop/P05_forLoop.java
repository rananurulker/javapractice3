package Day10_StringManipulations_forLoop;

public class P05_forLoop {
    public static void main(String[] args) {
        //1den baslayip 10a kadar olan sayilari tek tek yazdir.

        for (int i = 1; i < 10 ; i++) {
            System.out.print(i+ " ");

        }
        System.out.println();
        for (int i = 0; i >-10 ; i--) {
            System.out.print("("+i+")"+" ");
        }
        System.out.println();

        //iki basamakli cift sayilari yazdirin.

        for (int i = 10; i <100 ; i+=2) {
            System.out.print(i+" ");

        }
        System.out.println();

        //3 basamakli sayilardan 17ye bolunenleri yazdirin.

        for (int i =100; i <500 ; i++) {
            if (i%17==0){
                System.out.print(i+" ");
            }

        }
    }
}
