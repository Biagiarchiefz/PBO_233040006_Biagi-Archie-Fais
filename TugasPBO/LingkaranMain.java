package TugasPBO;

public class LingkaranMain {
    public static void main(String[] args) {

        // Membuat objek Lingkaran
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;

        // Menampilkan nilai awal
        System.out.println("Nilai jari-jari awal:");
        System.out.println("l1: " + l1.getJari2());
        System.out.println("l2: " + l2.getJari2());

        // Mengubah jari-jari melalui referensi l   2
        l2.setJari2(10);

        // Menampilkan nilai setelah perubahan
        System.out.println("Setelah perubahan jari-jari:");
        System.out.println("l1: " + l1.getJari2());
        System.out.println("l2: " + l2.getJari2());

        // Menampilkan luas lingkaran
        System.out.println("Luas lingkaran: " + l1.hitungLuas());
    }
}
