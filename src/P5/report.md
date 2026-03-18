|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020202|
| Nama |  Cindy Callista N |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/cindnath-tech/PRAKTIKUM_ASD_2026 |

# Jobsheet 5 - Brute Force dan Divide Conquer

## 5.2 Percobaan 1

Hasil dari percobaan 1 : 

```
Masukkan nilai : 5
Nilai Faktorial 5 menggunakan BF : 120
Nilai faktorial 5 menggunakan DC : 120
```

### Pertanyaan ercobaan 1

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else! 
    - penggunaan if (n == 1) digunakan sebagai kondisi penghentian rekursi sehingga ketika n sama dengan 1 maka fungsi akan mereturn nilai 1. Sedangkan else digunakan untuk membagi masalah menjadi bagaian lebih kecil
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan! 
    - bisa menggunakan while
```
 int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }
```
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); ! 
    - fakto *= i digunakan pada perulangan dalam metode brute force sehingga nilai faktorial dihitung dengan mengalikan angka satu per satu dalam perulangan. Sedangkan pada int fakto - n * faktorialDC(n-1) digunakan pada rekursi dalam metode divide conquer sehingga nilai n dikalikan dengan hasil faktorial dari n-1
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
    - faktorialBF() menggunakan pendekatan brute force dengan perulangan untuk menghitung nilai faktorial dari 1 sampai n dengan bertahap sedangkan faktorialDC() menggunakan pendekatan divide and conquer dengan rekursi sehingga membagai masalah menjadi bagian masalah yang lebih kecil

## 5.3 Percobaan 2

Hasil dari percobaan 2 :

```
Masukkan jumlah elemen : 3
Masukkan nilai basis elemen ke-1 : 2
Masukkan nilai pangkat elemen ke-1 : 3
Masukkan nilai basis elemen ke-2 : 4
Masukkan nilai pangkat elemen ke-2 : 5
Masukkan nilai basis elemen ke-3 : 6
Masukkan nilai pangkat elemen ke-3 : 7
HASIL PANGKAT BRUTE FORCE : 
2^3 : 8
4^5 : 1024
6^7 : 279936
HASIL PANGKAT DIVIDE AND CONQUER : 
2^3 : 8
4^5 : 1024
6^7 : 279936
```