|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020202|
| Nama |  Cindy Callista N.S. |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/cindnath-tech/PRAKTIKUM_ASD_2026 |

# Jobsheet 12 - Double Linked List

## Percobaan 1
Hasil run dari percobaan 1 :
```
=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
0. Keluar
Pilih menu : 2
Masukkan NIM      : 123005
Masukkan Nama     : Harry
Masukkan Kelas    : 1A
Masukkan IPK      : 3.76

=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
0. Keluar
Pilih menu : 3
Masukkan NIM yang dicari : 123005
Masukkan data baru : 
Masukkan NIM      : 123010
Masukkan Nama     : Potter
Masukkan Kelas    : 1B
Masukkan IPK      : 3.55
Data berhasil disisipkan setelah NIM 123005

=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
0. Keluar
Pilih menu : 6
NIM    : 123005
Nama   : Harry
Kelas  : 1A
IPK    : 3.76
NIM    : 123010
Nama   : Potter
Kelas  : 1B
IPK    : 3.55
```

### Pertanyaan Percobaan 1
1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List! 
    - Untuk struktur node pada single linked list hanya memiliki 1 pointer yaitu next sedangkan double linked list memiliki 2 pointer yaitu prev dan next. Pada single linked list traversal hanya dapat dilakukan dari depan ke belakang sedangkan double linked lit dapat dilakukan 2 arah yaitu depan ke belakang dan sebaliknya
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node! 
    - atribut next berfungsi untuk menyimpan alamat node setelah node saat ini (menghubungkan node ke node berikutnya) dan digunakan untuk traversal manju, atribut prev digunakan untuk menyimpan alamat node sebelum node saat ini (menghubungkan node ke node sebelumnya) dan digunakan untuk traversal mundur
3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list! 
    - Berfungsi untuk menginisialisasi linked list dalam keadaan kosong dengan begitu program akan melakukan pengecekan apakah linked list kosong atau tidak serta membantu menghindari error saat traversal atau penambahan data pertama kali
4. Perhatikan potongan kode berikut: 
if (isEmpty()) { 
head = tail = newNode; 
} 
Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong? 
    - karena ketika linked list masih kosong dan ditambahkan data pertama, node tersebut secara otomatis menjadi node pertama sekaligus menjadi node terkahir
5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list! 
```
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
```
6. Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!
```
kode program :
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
```
```
Hasil run :
=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
7. Tampilkan data tertentu
0. Keluar
Pilih menu : 2
Masukkan NIM      : 123005
Masukkan Nama     : Harry
Masukkan Kelas    : 1A
Masukkan IPK      : 3.76

=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
7. Tampilkan data tertentu
0. Keluar
Pilih menu : 3
Masukkan NIM yang dicari : 123005
Masukkan data baru : 
Masukkan NIM      : 123010
Masukkan Nama     : Potter
Masukkan Kelas    : 1B
Masukkan IPK      : 3.55
Data berhasil disisipkan setelah NIM 123005

=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
7. Tampilkan data tertentu
0. Keluar
Pilih menu : 7
== Menampilkan data secara terbalik ==
NIM    : 123010
Nama   : Potter
Kelas  : 1B
IPK    : 3.55
NIM    : 123005
Nama   : Harry
Kelas  : 1A
IPK    : 3.76
```

## Percobaan 2
Hasil run dari percobaan 2 :
```
=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
7. Tampilkan data tertentu
0. Keluar
Pilih menu : 2
Masukkan NIM      : 123005
Masukkan Nama     : Harry
Masukkan Kelas    : 1A
Masukkan IPK      : 3.76

=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
7. Tampilkan data tertentu
0. Keluar
Pilih menu : 3
Masukkan NIM yang dicari : 123005
Masukkan data baru : 
Masukkan NIM      : 123010
Masukkan Nama     : Potter
Masukkan Kelas    : 1B
Masukkan IPK      : 3.55
Data berhasil disisipkan setelah NIM 123005

=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
7. Tampilkan data tertentu
0. Keluar
Pilih menu : 5
Data berhasil di hapus
NIM    : 123010
Nama   : Potter
Kelas  : 1B
IPK    : 3.55

=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilakn data
7. Tampilkan data tertentu
0. Keluar
Pilih menu : 6
NIM    : 123005
Nama   : Harry
Kelas  : 1A
IPK    : 3.76
```

### Pertanyaan Percobaan 2
1. Perhatikan potongan kode berikut pada method removeFirst(): 
head = head.next; 
head.prev = null; 
Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node! 
    - statement head = head.next berfungsi untuk memindahkan head ke node berikutnya (node lama dihapus dan node setelahnya menjadi head yang baru). Statement head.prev = null berfungsi untuk memutus hubungan node yang baru dengan node lama yang telah dihapus
2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!
```
menambahkan statement berikut pada removeFirst
Node08 delete = head;
menambahkan statement berikut pada removeLast
Node08 delete = tail;

menambahkan kode berikut pada method removeFirst() dan removeLast()
System.out.println("Data berhasil di hapus");
delete.data.tampil();
```

## Tugas
1. Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks tertentu! 
```
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
```
2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data key tertentu! 
```
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
```
3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu! 
```
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
```
4. Tambahkan method: 
a. getFirst() 
b. getLast() 
c. getIndex() 
untuk menampilkan data pada node pertama, node terakhir, dan node pada indeks tertentu. 
```
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
    }
    System.out.println("Data index ke-" + (i + 1) + " : ");
    current.data.tampil();
}
```
5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List.
```
public int jumlahData() {
    return size;
}
```