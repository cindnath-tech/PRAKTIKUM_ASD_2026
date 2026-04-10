|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020202|
| Nama |  Cindy Callista N |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/cindnath-tech/PRAKTIKUM_ASD_2026 |

# Jobsheet 7 - Searching

## Percobaan 1

Hasil dari percobaan 1 :

```
Masukkan Data Mahasiswa ke-1
Nama  : Adi
NIM   : 111
IPK   : 3.6
Kelas : 2
----------------------
Masukkan Data Mahasiswa ke-2
Nama  : Tio
NIM   : 222
IPK   : 3.8
Kelas : 2
----------------------
Masukkan Data Mahasiswa ke-3
Nama  : Ila
NIM   : 333
IPK   : 3.0
Kelas : 2
----------------------
Masukkan Data Mahasiswa ke-4
Nama  : lia
NIM   : 444
IPK   : 3.5
Kelas : 2
----------------------
Masukkan Data Mahasiswa ke-5
Nama  : Fia
NIM   : 555
IPK   : 3.3
Kelas : 2
----------------------
Nama    : Adi
NIM     : 111
IPK     : 3.6
Kelas   : 2
--------------------
Nama    : Tio
NIM     : 222
IPK     : 3.8
Kelas   : 2
--------------------
Nama    : Ila
NIM     : 333
IPK     : 3.0
Kelas   : 2
--------------------
Nama    : lia
NIM     : 444
IPK     : 3.5
Kelas   : 2
--------------------
Nama    : Fia
NIM     : 555
IPK     : 3.3
Kelas   : 2
--------------------
------------------------------------
Pencarian data
------------------------------------
Masukkan ipk mahasiswa yang dicari :
IPK : 3.5
Menggunakan sequential searching
Data mahasiswa dengan IPK : 3.5 ditemukan pada indeks 3
NIM      : 444
Nama     : lia
kelas    : 2
IPK      : 3.5
```

### Pertanyaan Percobaan 1
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
    - Method tampilDataSearch digunakan untuk menampilkan data mahasiswa setelah pencarian nim ditemukan sedangkan method tampilPosisi digunakan untuk menampilkan index data dalam array 
2. Jelaskan fungsi break pada kode program di bawah ini!
```
if (listMhs[j].ipk == cari) {
    posisi = j;
    break;
}
```
    - break dalam kode tersebut digunakan untuk memberhentikan perulangan ketika data sudah ditemukan
3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search? 
    - variabel pos digunakan untuk menyimpan index data yang telah ditemukan karena jika tidak menggunakan variabel pos maka program tidak dapat menyimpan index data
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan. 
    - karena pada kode program menggunakan break maka data yang disimpan adalah data yang pertama kali cocok lalu program tidak akan mengecek data yang lainnya, namun jika tidak menggunakan break maka program akan menyimpan data terkahir yang cocok dengan kondisi yang ditentukan
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
    - jika break di hapus maka program akan terus melakukan pengecekan data dan setiap bertemu dengan data yang sama, variabel posisi akan diupdate

## Percobaan 2

Hasil dari percobaan 2 :

```
Masukkan jumlah mahasiswa : 5

Masukkan Data Mahasiswa ke-1
Nama  : Adi
NIM   : 111
IPK   : 3.1
Kelas : 2
----------------------
Masukkan Data Mahasiswa ke-2
Nama  : Ila
NIM   : 222
IPK   : 3.2
Kelas : 2
----------------------
Masukkan Data Mahasiswa ke-3
Nama  : Lia
NIM   : 333
IPK   : 3.3
Kelas : 2
----------------------
Masukkan Data Mahasiswa ke-4
Nama  : Susi
NIM   : 444
IPK   : 3.5
Kelas : 2
----------------------
Masukkan Data Mahasiswa ke-5
Nama  : Anita
NIM   : 555
IPK   : 3.7
Kelas : 2
----------------------
Nama    : Adi
NIM     : 111
IPK     : 3.1
Kelas   : 2
--------------------
Nama    : Ila
NIM     : 222
IPK     : 3.2
Kelas   : 2
--------------------
Nama    : Lia
NIM     : 333
IPK     : 3.3
Kelas   : 2
--------------------
Nama    : Susi
NIM     : 444
IPK     : 3.5
Kelas   : 2
--------------------
Nama    : Anita
NIM     : 555
IPK     : 3.7
Kelas   : 2
--------------------
------------------------------------
Pencarian data
------------------------------------
Masukkan ipk mahasiswa yang dicari :
IPK : 3.7
-----------------------
Menggunakan binary search
-----------------------
Data mahasiswa dengan IPK : 3.7 ditemukan pada indeks 4
NIM      : 555
Nama     : Anita
kelas    : 2
IPK      : 3.7
----------------------------
```