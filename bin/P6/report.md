|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020202|
| Nama |  Cindy Callista N.S. |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/cindnath-tech/PRAKTIKUM_ASD_2026 |

# Jobsheet 6 - Sorting (Bubble, Selection, dan Insertion Sort)

## Percobaan 1

### Sorting - Bubble Sort

Hasil dari percobaan bubble sort :

```
Data awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 
```

### Sorting - Selection Sort

Hasil dari percobaan selection sort :

```
Data awal 2
30 20 2 8 14
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 8 14 20 30
```

### Sorting - Insertion Sort

Hasil dari percobaan insertion sort :

```
Data awal 3
40 10 4 9 3
Data sudah diurutkan dengan INSERTION SORT (ASC)
3 4 9 10 40
```

## Pertanyaan Percobaan 1
1. Jelaskan fungsi kode program berikut :
```
if (data[j - 1] > data[j]) {
    temp = data[j];
    data[j] = data[j - 1];
    data[j - 1] = temp;
}
```
- Berfungsi untuk membandingkan dua elemen yang berselebahan apakah elemen di kiri lebih besar dari elemen di kanan. Jika lebih besar, maka elemen di kiri akan ditukar dengan elemen di kanan. Sehingga elemen akan urut secara ascending

2. Tunjukkan kode program yang merupakan algoritma pnecarian nilai minimum pada selection sort!
```
if (data[j] < data[min]) {
    min = j;
}
```

3. Pada insertion sort, jelaskan maksud dari kondisi pada perulangan while (j >= 0 && data[j] > temp) 
- Kondisi tersebut digunakan untuk memastikan pergeseran elemen yang ada di kanan selama elemen tersebut lebih besar dari nilai temp dan index elemen masih di dalam batas index array

4. Pada insertion sort, apakah tujuan dari perintah data[j + 1] = data[j];
- Digunakan untuk menggeser elemen ke kanan agar elemen yang lebih kecil mendapatkan posisi urutan yang benar

## Percobaan 2

Hasil dari percobaan 2 :

```
Data mahasiswa sebelum sorting : 
Nama    : Zidan
NIM     : 123
IPK     : 3.2
Kelas   : 2A
--------------------
Nama    : Ayu
NIM     : 124
IPK     : 3.5
Kelas   : 2A
--------------------
Nama    : Sofi
NIM     : 125
IPK     : 3.1
Kelas   : 2A
--------------------
Nama    : Sita
NIM     : 126
IPK     : 3.9
Kelas   : 2A
--------------------
Nama    : Miki
NIM     : 127
IPK     : 3.7
Kelas   : 2A
--------------------
Data mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama    : Sita
NIM     : 126
IPK     : 3.9
Kelas   : 2A
--------------------
Nama    : Miki
NIM     : 127
IPK     : 3.7
Kelas   : 2A
--------------------
Nama    : Ayu
NIM     : 124
IPK     : 3.5
Kelas   : 2A
--------------------
Nama    : Zidan
NIM     : 123
IPK     : 3.2
Kelas   : 2A
--------------------
Nama    : Sofi
NIM     : 125
IPK     : 3.1
Kelas   : 2A
--------------------
```

## Pertanyaan Percoabaan 2

1. Perhatikan perulangan di dalam bubbleSort() di bawah ini: 
```
for (int i = 0; i < listMhs.length - 1; i++) {
    for (int j = 1; j < listMhs.length - i; j++) {
```
    a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ? 
        - Syarat tersebut digunakan untuk menempatkan elemen terkecil ke posisi plaing akhir setiap iterasi
    b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ? 
        - Syarat tersebut digunakan untuk menghindari membandingkan kembali elemen yang sudah berada di posisi yang tepat
    c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh? 
        - Perulangan i dan tahap bubble sort dilakukan sebanyak 49 kali
2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!
```
Masukkan jumlah mahasiswa : 3

Nama  : Zidan 
NIM   : 134
IPK   : 3.5
Kelas : 2B
----------------------
Nama  : Johan
NIM   : 135
IPK   : 3.9
Kelas : 2B
----------------------
Nama  : Mika
NIM   : 136
IPK   : 3.2
Kelas : 2B
----------------------
Data mahasiswa sebelum sorting :
Nama    : Zidan
NIM     : 134
IPK     : 3.5
Kelas   : 2B
--------------------
Nama    : Johan
NIM     : 135
IPK     : 3.9
Kelas   : 2B
--------------------
Nama    : Mika
NIM     : 136
IPK     : 3.2
Kelas   : 2B
--------------------
Data mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama    : Johan
NIM     : 135
IPK     : 3.9
Kelas   : 2B
--------------------
Nama    : Zidan
NIM     : 134
IPK     : 3.5
Kelas   : 2B
--------------------
Nama    : Mika
NIM     : 136
IPK     : 3.2
Kelas   : 2B
--------------------
```

## Percobaan 3

Hasil dari percobaan 3 :

```
Masukkan jumlah mahasiswa : 5

Nama  : Ali
NIM   : 123
IPK   : 3.9
Kelas : 2B
----------------------
Nama  : Ila
NIM   : 124
IPK   : 3.1
Kelas : 2B
----------------------
Nama  : Agus
NIM   : 125
IPK   : 3.6
Kelas : 2B
----------------------
Nama  : Tika
NIM   : 126
IPK   : 3.3
Kelas : 2B
----------------------
Nama  : Udin
NIM   : 127
IPK   : 3.2
Kelas : 2B
----------------------
Data mahasiswa sebelum sorting :
Nama    : Ali
NIM     : 123
IPK     : 3.9
Kelas   : 2B
--------------------
Nama    : Ila
NIM     : 124
IPK     : 3.1
Kelas   : 2B
--------------------
Nama    : Agus
NIM     : 125
IPK     : 3.6
Kelas   : 2B
--------------------
Nama    : Tika
NIM     : 126
IPK     : 3.3
Kelas   : 2B
--------------------
Nama    : Udin
NIM     : 127
IPK     : 3.2
Kelas   : 2B
--------------------
Data yang sudah terturut menggunakan SELECTION SORT (ASC)
Nama    : Ila
NIM     : 124
IPK     : 3.1
Kelas   : 2B
--------------------
Nama    : Udin
NIM     : 127
IPK     : 3.2
Kelas   : 2B
--------------------
Nama    : Tika
NIM     : 126
IPK     : 3.3
Kelas   : 2B
--------------------
Nama    : Agus
NIM     : 125
IPK     : 3.6
Kelas   : 2B
--------------------
Nama    : Ali
NIM     : 123
IPK     : 3.9
Kelas   : 2B
--------------------
```

## Pertanyaan Praktikum 3
Di dalam method selection sort, terdapat baris program seperti di bawah ini: 
```
int idxMin = i;
for (int j = i + 1; j < listMhs.length; j++) {
    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
        idxMin = j;
        }
    }
```
Untuk apakah proses tersebut, jelaskan!
- Proses tersbeut digunakan untuk mencari indeks elemen dengan nilai IPK terkecil lalu akan dilakukan proses swap

## Percobaan 4

Hasil dari percobaan 4 :

```
Masukkan jumlah mahasiswa : 5

Nama  : Ayu
NIM   : 111
IPK   : 3.7
Kelas : 2C
----------------------
Nama  : Dika
NIM   : 222
IPK   : 3.0
Kelas : 2C
----------------------
Nama  : Ila
NIM   : 333
IPK   : 3.8
Kelas : 2C
----------------------
Nama  : Susi
NIM   : 444
IPK   : 3.1
Kelas : 2C
----------------------
Nama  : Yayuk
NIM   : 555
IPK   : 3.4
Kelas : 2C
----------------------
Data mahasiswa sebelum sorting :
Nama    : Ayu
NIM     : 111
IPK     : 3.7
Kelas   : 2C
--------------------
Nama    : Dika
NIM     : 222
IPK     : 3.0
Kelas   : 2C
--------------------
Nama    : Ila
NIM     : 333
IPK     : 3.8
Kelas   : 2C
--------------------
Nama    : Susi
NIM     : 444
IPK     : 3.1
Kelas   : 2C
--------------------
Nama    : Yayuk
NIM     : 555
IPK     : 3.4
Kelas   : 2C
--------------------
Data yang sudah terurut menggunakan INSERTION SORT (ASC)
Nama    : Dika
NIM     : 222
IPK     : 3.0
Kelas   : 2C
--------------------
Nama    : Susi
NIM     : 444
IPK     : 3.1
Kelas   : 2C
--------------------
Nama    : Yayuk
NIM     : 555
IPK     : 3.4
Kelas   : 2C
--------------------
Nama    : Ayu
NIM     : 111
IPK     : 3.7
Kelas   : 2C
--------------------
Nama    : Ila
NIM     : 333
IPK     : 3.8
Kelas   : 2C
--------------------
```

## Pertanyaan Percobaan 4
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.
```
Nama    : Ila
NIM     : 333
IPK     : 3.8
Kelas   : 2C
--------------------
Nama    : Ayu
NIM     : 111
IPK     : 3.7
Kelas   : 2C
--------------------
Nama    : Yayuk
NIM     : 555
IPK     : 3.4
Kelas   : 2C
--------------------
Nama    : Susi
NIM     : 444
IPK     : 3.1
Kelas   : 2C
--------------------
Nama    : Dika
NIM     : 222
IPK     : 3.0
Kelas   : 2C
--------------------
```

## Tugas
```
Masukkan jumlah dosen : 3

=== MENU ===
1. Tambah Data
2. Tampil Data
3. Sorting ASC berdasarkan usia
4. Sorting DSC berdasarkan usia
5. Sorting usia menggunakan insertion sort
6. Keluar

Masukkan menu : 1
Kode : 123
Nama : Ayu
Jenis Kelamin (L/P) : P
Usia : 34
------------------
Kode : 654
Nama : Johan
Jenis Kelamin (L/P) : L
Usia : 20
------------------
Kode : 764
Nama : Jace
Jenis Kelamin (L/P) : P
Usia : 25
------------------

Masukkan menu : 2

Data seluruh dosen
Kode            : 123
Nama            : Ayu
Jenis Kelamin   : Perempuan
Usia            : 34
----------------
Kode            : 654
Nama            : Johan
Jenis Kelamin   : Laki-Laki
Usia            : 20
----------------
Kode            : 764
Nama            : Jace
Jenis Kelamin   : Perempuan
Usia            : 25
----------------

Masukkan menu : 3
Data diurutkan berdasarkan usia (ASC)
Kode            : 654
Nama            : Johan
Jenis Kelamin   : Laki-Laki
Usia            : 20
----------------
Kode            : 764
Nama            : Jace
Jenis Kelamin   : Perempuan
Usia            : 25
----------------
Kode            : 123
Nama            : Ayu
Jenis Kelamin   : Perempuan
Usia            : 34
----------------

Masukkan menu : 4
Data diurutkan berdasarkan usia (DSC)
Kode            : 123
Nama            : Ayu
Jenis Kelamin   : Perempuan
Usia            : 34
----------------
Kode            : 764
Nama            : Jace
Jenis Kelamin   : Perempuan
Usia            : 25
----------------
Kode            : 654
Nama            : Johan
Jenis Kelamin   : Laki-Laki
Usia            : 20
----------------

Masukkan menu : 5
Data diurutkan menggunakan insertion sort
Kode            : 123
Nama            : Ayu
Jenis Kelamin   : Perempuan
Usia            : 34
----------------
Kode            : 764
Nama            : Jace
Jenis Kelamin   : Perempuan
Usia            : 25
----------------
Kode            : 654
Nama            : Johan
Jenis Kelamin   : Laki-Laki
Usia            : 20
----------------

Masukkan menu : 6
Program telah selesai!
```