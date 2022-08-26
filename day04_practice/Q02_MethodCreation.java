package day01_day08.day04_practice;

import java.util.Scanner;

public class Q02_MethodCreation {

    /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("metre ve km ye donusturmek istediginiz cm degerini girin");
        double cmValue=scan.nextDouble();


        convertCM(cmValue);


    }

    private static void convertCM(double cmValue) {

        double metre=cmValue/100;
        double km=cmValue/100000;

        System.out.println("girdiginiz cm degeri :" + cmValue +" "+ metre +" metredir, "+ km+ " km dir");




    }
}
