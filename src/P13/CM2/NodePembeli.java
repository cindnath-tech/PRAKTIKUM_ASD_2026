package P13.CM2;

public class NodePembeli {
    Pembeli data;
    NodePembeli prev, next;

    NodePembeli(Pembeli data) {
        this.data = data;
        prev = next = null;
    }
}
