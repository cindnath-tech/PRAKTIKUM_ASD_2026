package P13.CM2;

public class LinkedListRekap {
    NodeRekap head;
    NodeRekap tail;
    int size = 0;

    public boolean isEmpty() { // method ini digunakan untuk mengecek apakah linked list kosong atau tidak
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahPesan(String namaPesan) {
        NodeRekap current = head;

        // cek apakah sudah ada
        while (current != null) {
            if (current.namaPesanan.equalsIgnoreCase(namaPesan)) {
                current.jumlah++;
                return;
            }

        current = current.next;
    }
        NodeRekap newNode = new NodeRekap(namaPesan);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
}


    public void cekRekap(String namaPesanan) {
        NodeRekap current = head;

        while (current != null) {
            if (current.namaPesanan.equalsIgnoreCase(namaPesanan)) { // dilakukan pengecekan apakah terdapat nama menu tersebut di rekap
                current.jumlah++; // dilakukan penambahan jumlah rekap menu jika memenuhi kondisi di atas
                return;
            }
            current = current.next; // node saat ini menunjuk ke node setelah current
        }
    }

    public void tampilRekap() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        System.out.println("=== REKAP PESANAN ===");
        NodeRekap current = head;
        while (current != null) {
            System.out.println(current.namaPesanan + " = " + current.jumlah);
        }
        current = current.next;
    }
}
