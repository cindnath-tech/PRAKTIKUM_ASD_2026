package P12;

public class DoubleLinkedList08 {
    Node08 head;
    Node08 tail;
    int size = 0;

    DoubleLinkedList08() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa08 data) {
        Node08 newNode = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.prev = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa08 data) {
        Node08 newNode = new Node08(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa08 data) {
        if (index < 0 || index > size) {
            System.out.println("Index di luar batas");
            return;
        }

        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node08 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node08 newNode = new Node08(data);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa08 data) {
        Node08 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node08 newNode = new Node08(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
        size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;   
        }

        Node08 delete = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus");
        delete.data.tampil();
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node08 delete = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil di hapus");
        delete.data.tampil();
        size--;
    }

    public void removeAfter(String key) {
        Node08 current = head;
        while (current != null && !current.data.nama.equals(key)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelahnya");
            return;
        }

        Node08 removeNode = current.next;
        current.next = removeNode.next;
        if (removeNode.next != null) {
            removeNode.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Data yang dihapus : ");
        removeNode.data.tampil();
        size--;
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Liked List kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node08 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;

            System.out.println("Data yang dihapus : ");
            current.data.tampil();
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }
        
        Node08 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node08 current = tail;
        System.out.println("== Menampilkan data secara terbalik ==");
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            System.out.println("Data pertama : ");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            System.out.println("Data terkahir : ");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        }

        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas");
            return;
        }

        Node08 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
            System.out.println("Data index ke-" + (i + 1) + " : ");
        }
        current.data.tampil();
    }

    public int jumlahData() {
        return size;
    }
}
