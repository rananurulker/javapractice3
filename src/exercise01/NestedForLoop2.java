package exercise01;

public class NestedForLoop2 {
    public static void main(String[] args) {
        //nested for loop kullanarak
        // 2 3 4 5 6
        // 3 4 5 6 7
        // 4 5 6 7 8
        // 5 6 7 8 9
        //yazdirin


        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(i+j+" ");
                
            }
            System.out.println();

        }



    }
}
