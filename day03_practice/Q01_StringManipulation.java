package day01_day08.day03_practice;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("birinci kelime");
        String str1=scan.next().toLowerCase();
        System.out.println("ikinci kelime");
        String str2=scan.next().toLowerCase();
        System.out.println("ucuncu kelime");
        String str3=scan.next().toLowerCase();
        System.out.println("dorduncu kelime");
        String str4=scan.next().toLowerCase();

        System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1) +" "+str2+" "+str3+" "+str4+" ");
    }
}
