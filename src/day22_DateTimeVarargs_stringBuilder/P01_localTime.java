package day22_DateTimeVarargs_stringBuilder;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class P01_localTime {

    public static void main(String[] args) {

        LocalTime time=LocalTime.now();

        //local time ozel bir class oldugu icin bu objeye new diyemeyiz. kendisi method kullanmaya izin verir.

        System.out.println("lokal Time"+time);
        //herkesin bilgisayarindaki guncel saati veriyor.

        LocalTime thetimethatiswaited=LocalTime.of(21,15,35);
        System.out.println(thetimethatiswaited);

        LocalTime zoneTime=LocalTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println(zoneTime);

        //bir isin ne kadar surdgunu bulmak icin baslangic ve bitis zamanlarini kaydedebiliriz.

        LocalTime baslangic=LocalTime.now();
        for (int i = 0; i <100000 ; i++) {
            for (int j = 0; j <1000000 ; j++) {
                for (int k = 0; k < 2; k++) {

                }

            }

        }
        LocalTime bitis=LocalTime.now();
        //  bu islemler yukaridaki forloop un ne kadar zamanda calistigini gosterir/

        // bir kodun 3 saniyede calismasi gerekiyorsa bu ne kadar zaman surer onu bulmak icin kullanilir.

        // iki zaman arasi farki bulmak

        System.out.println(bitis.toSecondOfDay()-baslangic.toSecondOfDay());//baslangic ve bitis arasindaki fark.
        System.out.println(bitis.toNanoOfDay()-baslangic.toNanoOfDay());//baslangic ile bitis arasindaki testin
        // nano saniyeyi uzerinden gosterilmesi
        System.out.println(baslangic.until(bitis, ChronoUnit.SECONDS));
        System.out.println(baslangic.until(bitis, ChronoUnit.NANOS));
        System.out.println(time.getHour());//saati getirir

        System.out.println(time.getHour()+"."+time.getMinute()+time.getSecond());
    }
}
