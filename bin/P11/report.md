|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020202|
| Nama |  Cindy Callista N.S. |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/cindnath-tech/PRAKTIKUM_ASD_2026 |

# Jobsheet 11 - Linked List

## Praktikum 1
Hasil run dari praktikum 1 :
```
Linked list kosong
Isi Linked List : 
Dirga   21212203        4D      3.6

Isi Linked List : 
Dirga   21212203        4D      3.6
Alvaro  24212200        1A      4.0

Isi Linked List : 
Dirga   21212203        4D      3.6
Bimon   23212201        2B      3.8
Cintia  22212202        3C      3.5
Alvaro  24212200        1A      4.0
```

### Pertanyaan Praktikum 1
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? 
    - karena saat program pertama kali dijalankan linked list belum terisi node 
2. Jelaskan kegunaan variable temp secara umum pada setiap method! 
    - variabel temp digunakan sebagai variabel sementara untuk membantu proses node pada linked list
3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
```
Scanner cindy = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jml = cindy.nextInt();
        cindy.nextLine();
        SingleLinkedList08 sll = new SingleLinkedList08();
        
        for (int i = 0; i < jml; i++) {
            System.out.println("Data mahasiswa ke-" + (1 + i));
            System.out.print("NIM : ");
            String nim = cindy.nextLine();
            System.out.print("Nama : ");
            String nama = cindy.nextLine();
            System.out.print("Kelas : ");
            String kelas = cindy.nextLine();
            System.out.print("IPK : ");
            double ipk = cindy.nextDouble();
            cindy.nextLine();

            Mahasiswa08 mhs = new Mahasiswa08(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            sll.print();
        }
```

## Praktikum 2
Hasil run dari praktikum 2 :
```
Isi Linked List : 
Dirga   21212203        4D      3.6
Cintia  22212202        3C      3.5
Bimon   23212201        2B      3.8
Alvaro  24212200        1A      4.0

Data index 1 : 
Cintia  22212202        3C      3.5
Data mahasiswa an Bimon berada pada index : 2

Isi Linked List : 
Cintia  22212202        3C      3.5
Bimon   23212201        2B      3.8

Isi Linked List : 
Bimon   23212201        2B      3.8
```

### Pertanyaan Praktikum 2
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
    - Break berfungsi untuk menghentikan perulangan setelah data yang dicari ditemukan dan dihapus, jika break dihapus maka loop akan terus berjalan meskipun data yang dicari telah dihapus
2. Jelaskan kegunaan kode dibawah pada method remove
```
temp.next = temp.next.next;
if (temp.next == null) {
    tail = temp;
}
```
    - digunakan untuk menghapus node setelah temp dan untuk memperbarui nilai tail jika node yang dihapus adalah node terkahir

## Tugas
Hasil run dari tugas : 
```
=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 1
Johan sudah masuk ke antrian
Milen sudah masuk ke antrian
Dika sudah masuk ke antrian

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 4
Jumlah mahasiswa dalam antrian : 3
Daftar Antrian : 
12457   Johan   2C
13423   Milen   2E
14232   Dika    2F

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 2
Memanggil antrian : 
12457   Johan   2C

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 3
Antrian terdepan : 
13423   Milen   2E
Antrian paling akhir : 
14232   Dika    2F

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 5
Antrian berhasil dikosongkan
Jumlah mahasiswa dalam antrian : 0

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 0
Program selesai
```