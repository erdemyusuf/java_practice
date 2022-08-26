package day01_day08.recap2;

public class Q04_NestedIfandTernary {
    public static void main(String[] args) {
         /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/


      // NESTED IF COZUMU

        int sayi=7;
        String sonuc="";

        if(sayi>0 && sayi<9){
            if(sayi==9){sonuc="dokuz";}
            else if(sayi==8){sonuc="sekiz";}  //   else if yerine sout icinde de yapabilirdik farkli bir yoldan cozduk
            else if(sayi==7){sonuc="yedi";}
            else if(sayi==6){sonuc="alti";}
            else if(sayi==5){sonuc="bes";}
            else if(sayi==4){sonuc="dort";}
            else if(sayi==3){sonuc="uc";}
            else if(sayi==2){sonuc="iki";}
            else if(sayi==1){sonuc="bir";}
            else sonuc="sifir";

        }else sonuc="gecersiz";
        System.out.println("sonuc = " + sonuc);


        // TERNARY COZUMU

        int no=4;

        String result=no==9?"dokuz":no==8? "sekiz" :no==7? "yedi" :no==6? "alti" :no==5? "bes"
                : no==4? "dort": no==3? "uc":no==2? "iki": no==1? "bir": no==0? "sifir": "gecersiz";
        System.out.println("result = " + result);




    }
}
