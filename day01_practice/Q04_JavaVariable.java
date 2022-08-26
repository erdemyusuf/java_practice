package day01_day08.day01_practice;

public class Q04_JavaVariable {
    public static void main(String[] args) {

        // Initializing Variable  //variable baslangic degeri verme
        int yas=33;
        double boy=1.70;
        System.out.println("yas:" +yas);
        System.out.println("boy:" +boy);


        // To copy the variable's value

        int yasim=33;
        int yusufYas=yasim;

        System.out.println("yusufYas = " + yusufYas);
        System.out.println("yasim = " + yasim);


        // you can declare multiple variables in the same line

        int yil=2022, ay= 6, gun=20;

        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);


        // updating a variable

        yil=2032;
        System.out.println("update yil :" +yil);



        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x;     // x declare edildi
        int y=2000;   //y initialize edildi , yani ilk degeri verdigimiz icin bu ismi aldi
        x=30;  //x in initialized
        y=1;  // guncelleme


        System.out.println("x = " + x);
        System.out.println("y = " + y);



    }
}
