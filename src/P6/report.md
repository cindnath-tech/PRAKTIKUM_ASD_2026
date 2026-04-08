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