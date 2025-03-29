package RelasiKelas;

public class Mahasiswa {
    private String NRP;

    private String nama;

    // construktor
    public  Mahasiswa (String nrp, String nama) {
        super();
        NRP = nrp;
        this.nama = nama;
    }

    public String display() {
        return "NRP : " + NRP + ", Nama : " + nama;
    }

    public void setNRP(String nrp) {
        this.NRP = nrp;
    }

    public String getNRP(){
        return this.NRP;
    }

    public void setNama(String name) {
      nama = name;
    }

    public String getNama(){
        return this.nama;
    }



}
