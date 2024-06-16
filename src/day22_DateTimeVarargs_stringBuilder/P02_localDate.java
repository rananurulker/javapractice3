package day22_DateTimeVarargs_stringBuilder;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class P02_localDate {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        System.out.println(bugun);
        LocalDate istenenTarih=LocalDate.of(2005,03,22);
        System.out.println(istenenTarih);

        LocalDate dateofBirth=LocalDate.of(1990,8,8);
        System.out.println(dateofBirth);

        LocalDate istenenUlkeTarihi=LocalDate.now(ZoneId.of("Pacific/Honolulu"));
        System.out.println(istenenUlkeTarihi);

        System.out.println(bugun.getDayOfMonth());//ayin kacinci gunu
        System.out.println(bugun.getDayOfWeek());//haftanin hangi gunu
        System.out.println(bugun.getDayOfYear());// yilin n gunu

        //zone girilirse bulundguun bolgenin zamanini alir.
        //lokal girilirse sadece olunan yer

        System.out.println(bugun.plusYears(5).plusMonths(3).plusDays(14));
        System.out.println(bugun.getEra());
        System.out.println(bugun.getChronology());
        System.out.println(bugun.withMonth(10).withYear(2025));//ay ve yili biz belirledik.
        System.out.println(bugun.isLeapYear());//artik yil olup olmadigina bakar.
        System.out.println(bugun.withYear(2025).isLeapYear());//girilen yilin artik yil olup olmadigi
        System.out.println(bugun.lengthOfYear());//yildaki gun sayisi
        System.out.println(bugun.lengthOfMonth());
        System.out.println(bugun.withMonth(7).lengthOfMonth());

        System.out.println(dateofBirth.until(bugun));//P33Y9M26D 33 yil 9 ay 6 gun
        System.out.println(dateofBirth.until(bugun).getYears());
        Period period=Period. between(dateofBirth,bugun);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());




    }
}
