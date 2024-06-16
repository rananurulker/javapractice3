package exercise01;

public class PrepostIncrement {
    public static void main(String[] args) {
        int a=10;
        System.out.println("anin degeri: "+ ++a);

        int b=a++;
        System.out.println("bnin degeri: "+b);

        int c=b++ + a;


        System.out.println("cnin degeri: "+c);
        System.out.println("son toplam: "+(a+b+c));
    }

}
