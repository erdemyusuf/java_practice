package day01_day08.day06_practice;

import java.util.Scanner;

public class Q11_PinKodu {

    // string olan pin kodunuzu kontrol eden kod yaziniz


    public static void main(String[] args) {

        String pin="mehmet.1234";
        int girishakki=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("*******HOSGELDINIZ*******");


        while (true){
            System.out.println("pin kodunuzu giriniz : ");
            String girilenpin=scan.nextLine();

            if(pin.equals(girilenpin)){
                System.out.println("basarili giris..");
                break;

            }else{
                System.out.println("yanlis giris ...");
                girishakki--;
                System.out.println("kalan giris hakkiniz : "+ girishakki);


            }
            if(girishakki==0){
                System.out.println("giris hakki kalmadi bloklandiniz...");
                break;  // dongunun bitmesi icin yazdik
            }
        }

    }
}
