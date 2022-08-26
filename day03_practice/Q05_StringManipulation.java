package day01_day08.day03_practice;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {

// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("isim soyisim girin :\nisim");
        String isim=scan.next();
        System.out.println("soyisim");
        String soyisim=scan.next();


        if(isim.length()>soyisim.length()){
            System.out.println("isiminiz daha uzun");
        }else if (isim.length()==soyisim.length()){
            System.out.println("esit uzunluk");
        }else System.out.println("soyisim daha uzun");

    }
}
