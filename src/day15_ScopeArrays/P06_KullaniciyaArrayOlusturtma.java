package day15_ScopeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {
        //Kullanicidan arrayin boyutunu ve elemanlarini alip arrayi olusturup bize donduren
        //methodu hazirlayin.

        int[] arr = arrayOlustur();
        System.out.println("Array: "+Arrays.toString(arr));

    }

    public static int[] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi girisi olacak?: ");
        int arrayBoyutu = scan.nextInt();
        int[] arr = new int[arrayBoyutu];
        System.out.println("Array'in Ham Hali: " + Arrays.toString(arr));

        for (int i = 0; i < arrayBoyutu; i++) {
            System.out.print(i + ". indexteki sayiyi giriniz:");
            arr[i] = scan.nextInt();

        }
        return arr;
    }
}



