//package Praktek.Latihan2;
//
//public class MatakuliahMain {
//    public static void main(String[] args) {
//        Matakuliah mk1 = new Matakuliah("001", "algoritma pemrograman", "A", 2);
//        Matakuliah mk2 = new Matakuliah("002", "Bahasa Indonesia", "C", 1);
//        Matakuliah mk3 = new Matakuliah("003", "Matematika", "B", 3);
//
//        System.out.println("DAFTAR MATAKULIAH");
//        System.out.println(mk1.display());
//        System.out.println(mk2.display());
//        System.out.println(mk3.display());
//        System.out.println("Ini index" + mk1.getIndex());
//
//        double totalBobot = (mk1.getIndex() * mk1.getSKS()) +
//                (mk2.getIndex() * mk2.getSKS()) +
//                (mk3.getIndex() * mk3.getSKS());
//
//        int totalSKS = mk1.getSKS() + mk2.getSKS() + mk3.getSKS();
//
//        // Menghitung IPK
//        double ipk = totalBobot / totalSKS;
//
//        // Menampilkan hasil IPK.
//        System.out.println("\nNilai IPK: " + ipk);
//
//    }
//
//}
