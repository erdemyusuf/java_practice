package day01_day08.day07_practice;

public class Q02_MDArray {

    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */

    public static void main(String[] args) {

        String[][] arr ={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam=0;

        for (int i = 0; i < 3; i++) {  // outer for kullanicidan almadik length = 3 bunu biliyoruz. arr.length yerine 3 yazdik.
            for (int j = 0; j < 3; j++) {  //inner for
                if(arr[i][j].contains("$")){
                   toplam+=Double.parseDouble(arr[i][j].replaceAll("\\$",""))*3.2;
                   // parantez icindeki replaceAll ile $ isaretinden kurtulduk,elimizde "12" stringi kaldı
                    // kalan stringi  Double.parseDouble() metodunu kullanrak data casting yaparak data type ı double yaptık

                }else {
                    toplam+=Double.parseDouble(arr[i][j].replaceAll("€",""))*4.2;
                }
            }
        }


        System.out.println("toplam = " + toplam);

    }

}
