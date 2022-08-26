package day01_day08.day01_practice;

public class Q13_Ternary {
    public static void main(String[] args) {

        /*
         * Ternary (daha basit kullanım -pratik if diyebiliriz . )kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        int fiyat=50;

        if(fiyat<10){
            System.out.println("ucuz");
        }else if(fiyat<20){
            System.out.println("normal");
        }else System.out.println("pahali");     // son durum oldugu icin {} acmadik () kullanmadik


        String result = fiyat<10?"ucuz":fiyat<20?"normal":"pahali";
        System.out.println("result = " + result);





    }
}
