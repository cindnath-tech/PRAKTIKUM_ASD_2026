package P13.CM2;

import org.w3c.dom.Node;

public class DDLPembeli {
    NodePembeli head;
    NodePembeli tail;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(Pembeli data) {
        NodePembeli newNode = new NodePembeli(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        NodePembeli current = head;
        System.out.println("============================");
        System.out.println("DAFTAR ANTRIAN");
        System.out.println("============================");
        System.out.println("No Antrian\tNama\tNo HP");
        while (current != null) {
            System.out.println(
            current.data.noAntrian + "\t\t"+
            current.data.namaPembeli + "\t"+
            current.data.noHp);
            current = current.next;
        }
    }

    Pembeli layaniAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        Pembeli data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return data;

    }
}
