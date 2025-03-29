package RelasiKelas;

import Praktek.Latihan2.Matakuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("Dr. Andi", "1978123456");
        Dosen dosen2 = new Dosen("Prof. Budi", "1969123456");
        Dosen dosen3 = new Dosen("Prof. Sandika Galih", "19909090");


        // Create object matakuliah
        Matakuliah mk1 = new Matakuliah("001","Algoritma", "A", 3, dosen1);
        Matakuliah mk2 = new Matakuliah("002","Matematika", "B", 2, dosen2);
        Matakuliah mk3 = new Matakuliah("003","PBO", "A", 2, dosen2);

        Matakuliah mk4 = new Matakuliah("004","Pemrograman Web", "B", 4, dosen3);

        // membuat object khs
        KartuHasilStudy khs = new KartuHasilStudy("4");
        KartuHasilStudy khs2 = new KartuHasilStudy("2");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        khs2.addMataKuliah(mk4);


        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040006", "biagi");

        // membuat object transkripnilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.addKHS(khs2);

//         Hitung IPS untuk semester 2
        khs2.hitungIps();
        // Hitung IPK keseluruhan
        transkrip.hitungIPK();

        transkrip.display();
    }

}
