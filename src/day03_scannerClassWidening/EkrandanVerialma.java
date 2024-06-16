package day03_scannerClassWidening;
import javax.swing.*;
public class EkrandanVerialma {

    //import java.util.Scanner;

        public static void main(String[] args) {
            /// Scanner scan=new Scanner(System.in);
            /// System.out.println("isminizi giriniz:");
            /// String isminiz=scan.nextLine();
            /// System.out.println(isminiz);


            String isim= JOptionPane.showInputDialog("İsminizi Giriniz: ");
            System.out.println("İsim: "+isim);
        }
    }
