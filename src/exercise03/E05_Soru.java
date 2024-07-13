package exercise03;

import java.util.Scanner;

public class E05_Soru {
    public static void main(String[] args) {
         /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yarım elmas uzunluğu: ");
        int n = scanner.nextInt();

        // Üst yarım elmas
        for (int i = 1; i <= n; i++) {
            // Boşluklar
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt yarım elmas
        for (int i = n - 1; i >= 1; i--) {
            // Boşluklar
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}