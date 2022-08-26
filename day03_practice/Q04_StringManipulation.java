package day01_day08.day03_practice;

import java.util.Scanner;

public class Q04_StringManipulation {
    public static void main(String[] args) {

        /*
Kullanicidan bir kelime girmesini isteyin.
* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
* kelimenin ortasindaki karakteri yazdirin.
*/


    Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime girin :");
        String kelime =scan.next();

        char ortanca=kelime.charAt((kelime.length()-1)/2); // charAt icine index alıyor.


        if(kelime.length()%2==1 && kelime.length()>=3){   // %2==1 tek oldugunu gosterir
            System.out.println("ortanca karakter :"+ ortanca);
        }


    }
}
