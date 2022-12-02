package Quis2;
public class MainDino {
    public static void main(String[] args){
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops trice = new Triceratops();
        Oviraptor ovirap = new Oviraptor();
        Pemburu buru = new Pemburu();
        AnakPemburu anak = new AnakPemburu();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Macam - Macam Karakteristik Dinosaurus dan Pemburu");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("==============================");
        System.out.println("    Jenis Dinosaurus Trex   ");
        System.out.println("==============================");
        trex.makan();
        trex.berjalan();
        System.out.println();
        System.out.println("======================================");
        System.out.println("    Jenis Dinosaurus Triceratops    ");
        System.out.println("======================================");
        trice.makan();
        trice.berjalan();
        System.out.println();
        System.out.println("==================================");
        System.out.println("    Jenis Dinosaurus Oviraptor  ");
        System.out.println("==================================");
        ovirap.makan();
        ovirap.berjalan();
        ovirap.bertelur();
        System.out.println();
        System.out.println("==========================");
        System.out.println("    Pemburu Dinosaurus  ");
        System.out.println("==========================");
        buru.berburu(trex);
        System.out.println();
        System.out.println("===============================");
        System.out.println("    Anak Pemburu Dinosaurus ");
        System.out.println("===============================");
        anak.berburu(trex);
        anak.mengambilTelur(ovirap);
    }
}