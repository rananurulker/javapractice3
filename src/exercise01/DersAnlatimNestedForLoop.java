package exercise01;

public class DersAnlatimNestedForLoop {
    public static void main(String[] args) {

        //Dikdortgen biciminde cikti icin nested for loop

        //1,2,3,4
       //for (int i = 1; i <=4 ; i++) {
       //    System.out.print(i+" ");

       //}
       //System.out.println();

       ////2,4,6,8

       //for (int i = 2; i <=8; i++) {
       //    if (i%2==0){
       //        System.out.print(i+" ");
       //    }

       //}
       //System.out.println();

       ////3,6,9,12

       //for (int i = 3; i <=12 ; i++) {
       //    if (i%3==0){
       //        System.out.print(i+ " ");
       //    }

       //}
       //System.out.println();

        //nested for loop kullanarak asagidaki tabloyu yazdirin.
       // 1 2 3 4
       // 2 4 6 8
       // 3 6 9 12


        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=4 ; j++) {

                System.out.print(i+j+" ");
                }


            System.out.println();
            }



        }


    }

