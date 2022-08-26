package day01_day08.recap1;

import java.util.Scanner;

public class Q02_YolHizZaman {
    public static void main(String[] args) {

        /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.

 */
        Scanner scan=new Scanner(System.in);
        System.out.print("gideceginiz yol mesafesi(km) :");
        double yol=scan.nextDouble();

        System.out.println("ortalama hiziniz(km/h) :");
        double ort_hiz= scan.nextDouble();  // variable camelcase disinda baska yollarla da yapılır ort_hiz gibi ...

        double varis_suresi=yol/ort_hiz;
        System.out.println("varis sureniz :"+varis_suresi);


        scan.close();   // scan objesi kapanir devam etmek icin kaldirmaniz gerekir.
                        // kapattıktan sonra kullanicadan baska bir scanner yapmak gerekir

    }
}
