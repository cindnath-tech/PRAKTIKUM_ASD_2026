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