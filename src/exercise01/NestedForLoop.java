package exercise01;

public class NestedForLoop {
    public static void main(String[] args) {
        //for loop ile 1,2,3,4 yazdirin.

        for (int i = 1; i <=4 ; i++) {
            System.out.print(1*i+" ");

        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i+" ");

        }
        System.out.println();

        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i+" ");


        }

        System.out.println();

        System.out.println("boyutlu tarama icin nested for loop kullanilir...");
        System.out.println();

        for (int i = 1; i <=3 ; i++) {// outer for loop satirlari kontrol eder. index numarasi yazariz
            for (int j = 1; j <=4 ; j++) {//inner for loop her satirdaki sutunu kontrol eder
                System.out.print(i*j+" ");
                
            }
            System.out.println();
            
        }
    }
}
