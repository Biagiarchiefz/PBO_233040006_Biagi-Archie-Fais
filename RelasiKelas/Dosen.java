package RelasiKelas;

// Kelas Dosen
    public class Dosen {
        private String nama;
        private String nip;

        public Dosen(String nama, String nip) {
            this.nama = nama;
            this.nip = nip;
        }

        public String display() {
            return "Dosen: " + nama + " (NIP: " + nip + ")";
        }
    }

