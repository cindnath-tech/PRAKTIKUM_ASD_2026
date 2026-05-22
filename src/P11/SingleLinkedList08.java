package P11;

public class SingleLinkedList08 {
    Node08 head;
    Node08 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node08 tmp = head;
            System.out.println("Isi Linked List : \t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa08 input) { 
        Node08 ndInput = new Node08(input, null);
        if (isEmpty()) {
            head = ndInput; // head menunjuk ke node baru
            tail = ndInput; // tail menunjuk ke node baru
        } else {
            ndInput.next = head; // node baru dihubungkan ke head yg lama
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa08 input) {
        Node08 ndInput = new Node08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa08 input) {
        Node08 ndInput = new Node08(input, null);
        Node08 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next; // node diarahkan ke node setelah temp
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput; // tail diperbarui jika node baru di terkahir
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void inserAt(int index, Mahasiswa08 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node08 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node08(input, temp.next); // menyisipkan node baru di posisi yg diinginkan
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        Node08 tmp = head; // traversal dimulai dari head
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        Node08 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next; // head dipindahkan ke node berikutnya (node sebelumnya dihapus)
        }
    }

    public void removeLast() {
        if (isEmpty()) {
             System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node08 temp = head;
            while (temp.next != tail) { // mencari node sebelum tail
                temp = temp.next; // memutus node terkahir
            }
            temp.next = null;
            tail = temp; // node sebelum tail menjadi tail baru
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
             System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            Node08 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key) && (temp == head))) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next; //menghapus node tertentu
                    if (temp.next == null) {
                        tail = temp; //memperbarui tail jika yg dihapus node terakhir
                    }
                    break;
                }
            }
        }
    }

    public void removeAt(int index)  {
        if (index == 0) {
            removeFirst();;
        } else {
            Node08 temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
