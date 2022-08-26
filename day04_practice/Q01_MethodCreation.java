package day01_day08.day04_practice;

public class Q01_MethodCreation {
    /*
    Problem tanımı :
    Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
    Test Data:
    input: "aabbcccccddddaaa"
    output: abcd
 */


    public static void main(String[] args) {

        birkereYazdir("abbbaaccccddddeee");



    }

    private static void birkereYazdir(String str) {

        String output="";  // string defaault degeri hiclik oldugu icin isleme etki etmemesi icin bu sekilde atama yaptik
        for (int i = 0; i < str.length(); i++) {  //  <= yaparsak str.length()-1 ; i++ yazardik.
            if(!output.contains(str.substring(i,i+1))){  //tekrarsiz karakterleri dondureegimiz icin sonucumuz str den alınan herhangibir karakteri icermesi
                output+=str.substring(i,i+1);  // o zaman sonuca eklesin
            }
        }

        System.out.println(output);
    }
}
