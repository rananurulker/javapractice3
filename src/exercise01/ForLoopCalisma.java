package exercise01;

public class ForLoopCalisma {
    public static void main(String[] args) {

        //1den 100e (dahil)kadar olan sayilari yazdirin.

        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+ " ");

        }
        System.out.println("");

        //25ten baslayip 2ser 2ser artirarak, 100 haric, 100e kadar sayilari yazdirin.
        for (int i = 25; i <100 ; i += 2) {
            System.out.print(i+ " ");

        }

        System.out.println("");

        //2 basamakli pozitif sayilardan 6 ile bolunenleri yazdirin.

        for (int i = 10; i <=99 ; i++) {
            if (i % 6==0){
                System.out.print(i+ " ");
            }

        }

        System.out.println("");

        //2 basamakli pozitif tamsayilarin toplamini yazdir.


        int toplam=0;
        for (int i = 10; i <100 ; i++) {
            toplam+=i;
        } System.out.print("2 basamakli pozitif tamsayilarin toplami: "+ toplam);





    }
}
