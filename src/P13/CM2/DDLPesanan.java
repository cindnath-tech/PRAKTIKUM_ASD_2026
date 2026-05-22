package P13.CM2;

import org.w3c.dom.Node;

public class DDLPesanan {
    NodePesanan head;
    NodePesanan tail;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahPesanan(Pesanan psn) {
        NodePesanan newNode = new NodePesanan(psn);

        if (isEmpty()) {
            head = tail = newNode;
        } else if (psn.namaPesanan.compareToIgnoreCase(head.data.namaPesanan) < 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            NodePesanan current = head;
            while (current.next != null && psn.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                current = current.next;
            }

            if (current.next == null) {
                current.next = newNode;
                newNode.prev = current;
                tail = newNode;
            } else {
                newNode.next = current.next;
                newNode.prev = current;

                current.next.prev = newNode;
                current.next = newNode;
            }
        }
    }

    public void tampilPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
        }

        NodePesanan current = head;
        System.out.println("=======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=======================================");
        System.out.println("Kode Pesasnan\tNama Pesanan\tHarga");
        while (current != null) {
            System.out.println(
            current.data.kodePesanan + "\t\t"+
            current.data.namaPesanan + "\t"+
            current.data.harga);
            current = current.next;
        }
    }
}
