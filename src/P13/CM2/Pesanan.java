package P13.CM2;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;
    Pembeli pembeli;

    Pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }
}
