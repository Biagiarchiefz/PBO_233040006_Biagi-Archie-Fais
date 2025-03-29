package RelasiKelas;

import KelasObject.Latihan2.Matakuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("Andi S.T., M.T.", "1978123456");
        Dosen dosen2 = new Dosen("Prof. Budi", "199999999");
        Dosen dosen3 = new Dosen("Sandika Galih S.T., M.T.", "19909090");
        Dosen dosen4 = new Dosen("Siroj Nur Ulum, S.T., M.T.", "19909090");


        // Create object matakuliah
        Matakuliah mk1 = new Matakuliah("001","Algoritma", "A", 3, dosen1);
        Matakuliah mk2 = new Matakuliah("002","Matematika", "B", 2, dosen2);
        Matakuliah mk3 = new Matakuliah("003","PBO", "A", 2, dosen2);

        Matakuliah mk4 = new Matakuliah("004","Pemrograman Web", "B", 2, dosen3);
        Matakuliah mk5 = new Matakuliah("004","Pemrograman Berorientasi Objec", "A", 2, dosen4);

        // membuat object khs
        KartuHasilStudy khs = new KartuHasilStudy("2");
        KartuHasilStudy khs2 = new KartuHasilStudy("3");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        khs2.addMataKuliah(mk4);
        khs2.addMataKuliah(mk5);


        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040006", "biagi");

        // membuat object transkripnilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.addKHS(khs2);

//         Hitung IPS
//        khs2.hitungIps();

        // Hitung IPK keseluruhan
        transkrip.hitungIPK();

        transkrip.display();
    }

}
