package day29_InterfaceException;

import org.w3c.dom.ls.LSOutput;

public interface P01_InterfaceIstisna {

    /*
    devam eden projelerde
    Interfacelere sonradan mudahale etmek gerekirse
    o interfacei kullanan classlarda ciddi problemler olusabilir.

    Java 8 versiyonunda bu konudaki beklentilere istisnai bir cozum onermistir.

    sonradan eklenen methodlarin problem cikarmamasi icin
    child classlara implement ettgimizde
    interface icindeki istisnai methodlarin bodyye sahip olmasina imkan tanimistir.
    bunu static ve default keywordleri ile saglar.
     */
        void method1();

        void method2();

        int method3();

        public default void method4(){

    //buradaki default access modifier degildir. istisnasi bir durumdur.
    //access modifier publictir ve ikinci bir access modifier olmaz.
    //buradaki default keyword kullanimi farkli bir durumu ifade eder.
            System.out.println("interface icindeki default keyworde sahip istisnasi method");
        }
        public static void method5(){

            //buradaki default access modifier degildir. istisnasi bir durumdur.
            //access modifier publictir ve ikinci bir access modifier olmaz.
            //buradaki default keyword kullanimi farkli bir durumu ifade eder.
            System.out.println("interface icindeki static keyworde sahip istisnasi method");
        }
    }

