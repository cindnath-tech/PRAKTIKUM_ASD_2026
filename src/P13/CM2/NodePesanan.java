package P13.CM2;

public class NodePesanan {
    Pesanan data;
    NodePesanan prev, next;

    NodePesanan(Pesanan data) {
        this.data = data;
        prev = next = null;
    }
}
