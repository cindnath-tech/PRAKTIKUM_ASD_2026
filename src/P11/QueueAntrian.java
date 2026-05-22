package P11;

public class QueueAntrian {
    NodeAntrian front;
    NodeAntrian rear;
    int size;
    int max;

    QueueAntrian(int max) {
        this.max = max;
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");   
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Antrian penuh");
        }

        NodeAntrian newNode = new NodeAntrian(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data.nama + " sudah masuk ke antrian");
    }

    public void memanggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }

        System.out.println("Memanggil antrian : ");
        front.data.tampilkanInformasi();

        front = front.next;
        size--;
        if (front == null) {
            rear = null;
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan : ");
            front.data.tampilkanInformasi();
        }
    }

    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling akhir : ");
            rear.data.tampilkanInformasi();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }

        System.out.println("Daftar Antrian : ");
        NodeAntrian temp = front;
        while (temp != null) {
            temp.data.tampilkanInformasi();
            temp = temp.next;
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian : " +size);
    }
}
