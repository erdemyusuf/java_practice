package day01_day08.day09_practice.restourant;

public class Musteri {

    public static void main(String[] args) {

        Mutfak menu=new Mutfak();

        System.out.println("menu.toString() = " + menu.toString());
        // menu.toString() metodu ile hepsini yazdiririz

        Mutfak siparisim=new Mutfak("adanakebab","mercimek","kunefe","salgam");

        System.out.println("siparisim = " + siparisim);


    }

}
