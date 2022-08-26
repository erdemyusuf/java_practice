package day01_day08.day01_practice;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {

         /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */


        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        int intMax=Integer.MAX_VALUE;     //wrapper class yaptik Integer yazarak bas harfi buyuk olmali
        int intMin=Integer.MIN_VALUE;

        System.out.println("intMax = " + intMax);  //soutv : degeri ile yazdir anlamındadir
        System.out.println("intMin = " + intMin);

        byte byteMax=Byte.MAX_VALUE;
        byte byteMin=Byte.MIN_VALUE;

        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMin);

        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;

        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);

        long longMax=Long.MAX_VALUE;
        long longMin=Long.MIN_VALUE;

        System.out.println("longMax = " + longMax);
        System.out.println("longMin = " + longMin);


        double doubleMax=Double.MAX_VALUE;
        double doubleMin=Double.MIN_VALUE;

        System.out.println("doubleMax = " + doubleMax);
        System.out.println("doubleMin = " + doubleMin);

        float floatMin=Float.MIN_VALUE;
        float floatMax=Float.MAX_VALUE;

        System.out.println("floatMin = " + floatMin);
        System.out.println("floatMax = " + floatMax);




        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float laptopFiyat=999.99f;
        double kilometre=34.56;
        char seviye='A';
        boolean dogruMu=true;

        System.out.println("laptopFiyat = " + laptopFiyat);   //soutv : degeri ile yazdir anlamındadir
        System.out.println("kilometre = " + kilometre);
        System.out.println("seviye = " + seviye);
        System.out.println("dogruMu = " + dogruMu);


    }

   }


      // ALT tusu ile secip istedigimiz yeri toplu yorum,yazim yapabiliriz