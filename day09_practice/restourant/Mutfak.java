package day01_day08.day09_practice.restourant;

public class Mutfak {

public String yemekler="adanakebab, urfaciger, kusbasi, kusleme";

public String arasicak="yaylacorba, mercimek, duguncorba, corba";

public String tatlilar="baklava, sutlac, gullac, kazandibi, kunefe";

public String icecekler="ayran, salgam, kola,";

    public Mutfak(String adanakebab, String mercimek, String kunefe, String salgam) {

        this.yemekler=adanakebab;  // this ile yazmaz isek dinamik olmaz
        this.arasicak=mercimek;  // this ile yazmaz isek dinamik olmaz
        this.tatlilar=kunefe;  // this ile yazmaz isek dinamik olmaz
        this.icecekler=salgam;  // this ile yazmaz isek dinamik olmaz


    }

    public Mutfak() {
      //  this("adanakebab","mercimek","kunefe","salgam");
        // this ile cons call yaparak parametreli cons. yaparsak menu yerine siparis  calısır
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ",\n arasicak='" + arasicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ",\n icecekler='" + icecekler + '\'' +
                '}';
    }
}
