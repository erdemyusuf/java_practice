package day01_day08.day01_practice;

import java.util.Scanner;

public class Q10_ıfStatement01 {
    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen Y/N ikilisinden birini giriniz : "); // ciktida satirin yanina yazdirmak icin print yazdik
        char karakter=scan.next().charAt(0);

        if(karakter=='Y' || karakter == 'y'){
            System.out.println("YES");
        }else if(karakter=='N' || karakter =='n'){
            System.out.println("NO");
        }else System.out.println("yanlis giris "); // body koymadik  kod kapsami tek satir ise {} gerek yok kod calisir

    }
}
