package TugasPBO;

public class Lingkaran {

    private double jari2;

    // Konstruktor
    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    // Getter untuk jari-jari
    public double getJari2() {
        return jari2;
    }

    // Setter untuk jari-jari
    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    // fungsi untuk menghitung luas lingkaran
    public double hitungLuas() {
        return Math.PI * jari2 * jari2;
    }

}
