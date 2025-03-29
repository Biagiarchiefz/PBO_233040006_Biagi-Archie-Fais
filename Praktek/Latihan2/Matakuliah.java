package Praktek.Latihan2;

import RelasiKelas.Dosen;

public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;
    private double bobotNilai;
    private Dosen dosenPengampu;


    public Matakuliah(String kode, String nama, String index, int sks, Dosen dosenPengampu) {
        super();

        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
        this.bobotNilai = hitungBobot();

    }

    // Method untuk mendapatkan bobot nilai berdasarkan indeks
    public double hitungBobot() {
        switch (index) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0; // Indeks E atau tidak valid
        }
    }

    // Getter untuk SKS
    public int getSKS() {
        return sks;
    }

    public double getIndex() {
        return bobotNilai;
    }


    public String display() {
        return kode + " - " + nama + " - " + index + " - " + sks + "\n" +  dosenPengampu.display();
    }
}

