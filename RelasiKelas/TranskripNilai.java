package RelasiKelas;

import Praktek.Latihan2.Matakuliah;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk ;
    private List<KartuHasilStudy> kartuHasilStudy;
    private  Mahasiswa mahasiswa;

    public TranskripNilai (Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        kartuHasilStudy = new ArrayList<KartuHasilStudy>();
        tglCetak = new Date();
    }


    public double hitungIPK(){
        double totalBobot = 0;
        int totalSKS = 0;

        for (KartuHasilStudy khs : kartuHasilStudy) {
            khs.hitungIps(); // Hitung IPS untuk setiap semester
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalBobot += mk.getIndex() * mk.getSKS();
                totalSKS += mk.getSKS();
            }
        }

        if (totalSKS > 0) {
            this.ipk = totalBobot / totalSKS;
        } else {
            this.ipk = 0;
        }

        return this.ipk;
    }


    public void addKHS (KartuHasilStudy khs) {
        kartuHasilStudy.add(khs);
    }

    public void display (){
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        System.out.println("\n");

        for (KartuHasilStudy khs : kartuHasilStudy) {
            System.out.println("Semester: " + khs.getSemester());
            System.out.println("IPS Semester " + khs.getSemester() + ": " + khs.getIps());
            System.out.println(khs.display());
        }

    }




}
