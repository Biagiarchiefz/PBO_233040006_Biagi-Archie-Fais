package KelasObject.Latihan1;

public class GelasMain {

    static  void tukarWarnaGelas (Gelas g1, Gelas g2) {
        // gtemp sebagai tempat penyimpanan warna
        Gelas gtemp = new Gelas("Temp");
        gtemp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(gtemp.getWarna());
    }
    public static void main(String[] args) {
        Gelas g1 = new Gelas("Hitam");
        Gelas g2 = new Gelas("Biru");

        System.out.println("warna sebelumnya: " + g1.getWarna());
        System.out.println("warna sebelumnya: " + g2.getWarna());

        tukarWarnaGelas(g1,g2);
        System.out.println("warna g1: " + g1.getWarna());
        System.out.println("warna g2: " + g2.getWarna());
    }
}
