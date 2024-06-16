package day24AccessModifierEncapsulation;

public class P06_EncapsuleRunner {
    public static void main(String[] args) {
        P05_encapsuleClass obj=new P05_encapsuleClass();

        // hicbir getter ya da setter islemi yapmadan
        //sadece adres degerine ulasabilir ve degistirebilirim

        obj.schAdress="Uskudar";
        System.out.println(obj.schAdress);//uskudar

        //write and read yetkisini sinirlandirmak icin
        //access modifier ile private variable olusturuyoruz.
        //daha sonra vermek istedigimiz yetki icin
        //getter setter methodlarindan faydalanilir.


        obj.getStuName();
        System.out.println(obj.getStuName());

        obj.setStuName("Murat");
        System.out.println(obj.getStuName());

        System.out.println(obj.getSchName());


        System.out.println(obj.getPhoneNumber());
        obj.setPhoneNumber("25219963");
        System.out.println(obj.getPhoneNumber());

    }
}
