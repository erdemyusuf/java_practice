package day01_day08.recap1;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {

        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("5 basamakli sayi girin");
        int num=scan.nextInt();

        int ilkIki=num/1000;
        int sonIki=num%100;  // 100 e bolumunden kalani verir

        int ilkIkiToplam=(ilkIki/10)+ (ilkIki%10);
        int sonIkiToplam=(sonIki/10)+ (sonIki%10);

        System.out.println("sayilarin toplami :" + (ilkIkiToplam+sonIkiToplam));




    }
}
