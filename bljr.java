 class bljr {


    // jika private cuma bisa di akses di kelas ini saja, tidak bisa di akses di main.
     // tetapi ada cara agar kita dapat mengaksesnya dengan getter dan settter

//   private String nama;
    String nama;
    String alamat;
    int umur;

    boolean setnilai;

    public  void statusPerwalian(){
        setnilai = true;
    }

    final  String negara = "indonesia";

}
