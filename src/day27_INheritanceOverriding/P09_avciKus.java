package day27_INheritanceOverriding;

public class P09_avciKus extends P08_kuslar {
    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        P09_avciKus kartal1=new P09_avciKus();

        System.out.println(kartal1.beslenme);// AV et yerler
        System.out.println(kartal1.hareket);//AV ucarlar
        System.out.println(kartal1.gaga);//AV sivri gagali
        System.out.println(kartal1.pence);//AV pencelidir

       P08_kuslar kartal2=new P09_avciKus();// ha beslenirler
        System.out.println(kartal2.beslenme);//ku gagalari vardir
        System.out.println(kartal2.gaga);// ha hareket ederler
        System.out.println(kartal2.hareket);// ku kanatlidir
        System.out.println(kartal2.omur);// ha yasarlar ve olurler

        P08_kuslar kartal3=new P08_kuslar();
        System.out.println(kartal3.gaga);// ku gagalari vardir
        System.out.println(kartal3.kanat);//ku kanatlidirlar
        System.out.println(kartal3.cogalma);//ku yumurtayla cogalirlar
        System.out.println(kartal3.beslenme);//ha beslenirler
        System.out.println(kartal3.omur);//ha yasarlar ve olurler

        P07_Hayvanlar kartal4=new P08_kuslar();


    }

}
