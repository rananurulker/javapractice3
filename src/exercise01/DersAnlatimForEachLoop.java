package exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DersAnlatimForEachLoop {
    public static void main(String[] args) {

        //verilen bir arraydeki tekrar eden elementler icin
        //mukerrer olanlari silip tum elemanlardan sadece 1 tane yapip eski arraye yeni halini yazdirin.

        int [] arr={3,3,5,5,7,7,8,6,5,4,3,9,8,2}; // 3,5,7,8,6,4,9,2

        List <Integer> benzersizList=new ArrayList<>();

        for( int each:arr){
            if (!benzersizList.contains(each)){
                benzersizList.add(each);
            }
            System.out.println(benzersizList);

            arr=new int[benzersizList.size()];//0000000

            for (int i = 0; i <arr.length ; i++) {
                arr[i]=benzersizList.get(i);

            }



        } System.out.print("Arrayin son hali"+ Arrays.toString(arr));








    }
}
