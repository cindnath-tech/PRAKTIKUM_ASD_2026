package P13.CM2;

public class NodeRekap {
    String namaPesanan;
    int jumlah;
    NodeRekap next, prev;

    NodeRekap(String namaPesanan) {
        this.namaPesanan = namaPesanan; // node untuk nama pesanan
        this.jumlah = 1; // jika nama menu tidak terdapat di menu, maka jumlah yang tertulis di rekap adalah 1
        
        this.next = null;
        this.prev = null;
    }
}
