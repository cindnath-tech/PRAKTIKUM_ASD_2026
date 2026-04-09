|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020202|
| Nama |  Cindy Callista N.S. |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/cindnath-tech/PRAKTIKUM_ASD_2026 |

# Jobsheet 6 - Sorting (Bubble, Selection, dan Insertion Sort)

## Praktikum 1

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

## Pertanyaan Praktikum 1
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

## Praktikum 2

Hasil dari percobaan praktikum 2 :

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

## Pertanyaan Praktikum 2

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