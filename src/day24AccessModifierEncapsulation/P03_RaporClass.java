package day24AccessModifierEncapsulation;

public class P03_RaporClass {

   private int satisTutari;
   private int ToplamSatisTutari;


/*
ISTENEN GÖREV:
  Bir rapor hazırlanması isteniyor;
    1- Satış tutarları bilgisi nbaşka departmanlar tarafından görülemesin
       Ama bunlara her departman kendinde var olan bilgiliyi atayabilsin(değiştirebilsin)
    2- Toplam satış tutarı üzernde değişiklik yapılamasın ama
       bu tutar değeri görütntülenebilsin.

    Bu işlemdeki okuma(read) ve yazma (write) yetkileri access modifier ile yapılamaz
    Daha net ifade etmek istersek ya ikisini birden verip ya da hiç vermeden işlem yapılır
    Bu iki yetki birbirinden ancak Encapsulation kullanılark ayrılır
 */
   /*
   Encapsulation islemi iki adimda yapilir.

   1- access modifier private yapilarak erisim engellenir
   2- sinirli islem yapabilsin.
   -(SET)deger atanabilsin ama sonuclari
   veya deger verileri goremesin
   -(GET)deger atayamasin ama sonuclari
   veya verileri goruntulebilsin

    */

   public int getToplamSatisTutari(){

      return ToplamSatisTutari;
   }

   public void setSatisTutari(int satisTutari){
      this.satisTutari=satisTutari;
      ToplamSatisTutari+=satisTutari;
   }

   public void setToplamSatisTutari(int ToplamSatisTutari){
      this.ToplamSatisTutari=ToplamSatisTutari;
   }

   public int getSatisTutari() {
      return satisTutari;
   }
}

