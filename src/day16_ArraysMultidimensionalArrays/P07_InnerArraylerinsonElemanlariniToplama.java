package day16_ArraysMultidimensionalArrays;

public class P07_InnerArraylerinsonElemanlariniToplama {
    public static void main(String[] args) {

        // //verilen 2 katli bir arrayde bulunan inner arraylerin son elemanarini toplayip sonucu yazdirin.
              int[][] arr = {{3, 5, 6}, {1, 8, 2, 3, 4, 2}, {1, 8, 5, 4}};

              sonElemanlariniTopla(arr);

    }

    private static void sonElemanlariniTopla(int[][] arr) {
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i][arr[i].length-1];

        }
        System.out.println("SOn Elemanlarinin toplami: "+toplam);
    }
}
