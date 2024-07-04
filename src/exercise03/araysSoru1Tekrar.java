package exercise03;

public class araysSoru1Tekrar {
    public static void main(String[] args) {
         /*
        Soru 1- Verilen bir int array’in
        tum elemanlarini 2 artirip
        bize donduren bir method olusturun.
        Eski array’i yeni haliyle kaydedin.
         */

        int[] array={5,7,9,11};
        array=increaseElementsByTwo(array);

        for (int each : array) {
            System.out.print(each+ " ");

        }
    }
    public static int [] increaseElementsByTwo (int[]array){
        for (int i = 0; i <array.length ; i++) {

            array[i]+=2;

        }

        return array;
    }


}
