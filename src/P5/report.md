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

### Pertanyaan Percobaan 2

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()! 
    - pangkatBF() menghitung pangkat menggunakan perulangan sehingga kode akan mengalikan bilangan secara berulang sesuai dengan jumlah pangkat yang diminta sedangkan pangkatDC() menghitung pangkat menggunakan rekursi sehingga kode akan memecah masalah menjadi bagain yang lebih kecil dan nantinya hasilnya akan digabungkan kembali
2. Apakah tahap combine sudah termasuk dalam kode tersebut Tunjukkan! 
    - Tahap combine ada di kode berikut : 
```
return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
return (pangkatDC(a, n/2) * pangkatDC(a, n/2) );
```
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter? 
    - masih relevan karena bisa dipakai untuk nilai apapun tanpa bergantung dengan atribut class, berikut kode method pangkatBF() tanpa parameter : 
```
int pangkatBF() {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil  *= nilai;
        }
        return hasil;
    }
```
4. Tarik kesimpulan tentang cara kerja method pangkatBF() dan pangkatDC()!
    - method pangkatBF() bekerja dengan cara mengalikan nilai secara berulang ulang menggunakan perulangan hingga nilai mencapai pada jumlah pangkat yang diinginkan. Method pangkatDC() bekerja dengan cara membagi masalah menjadi bagian yang lebih kecil (pangkat dibagi menjadi dua bagian) kemudan hasil dari setiap pangkat akan digabungkan kembali melalui proses combine

## 5.4 Percobaan 3

Hasil dari percobaan 3 :

```
Masukkan jumlah elemen : 5
Masukkan keuntungan ke-1 : 10
Masukkan keuntungan ke-2 : 20
Masukkan keuntungan ke-3 : 30
Masukkan keuntungan ke-4 : 40
Masukkan keuntungan ke-5 : 50
Toral keuntungan menggunakan brute force : 150.0
Total keuntungan menggunakan divide and conquer : 150.0
```

### Pertanyaan Percobaan 3

1. Kenapa dibutuhkan variable mid pada method TotalDC()? 
    - mid digunakan untuk menentukan titik tengah dari array serta mid akan membagi dua bagian array dalam metode divide and conquer sehingga pada bagian kiri memiliki indeks dari l sampai mid dan pada bagian kanan memiliki indkes dari mid + 1 sampai r
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()? 
    - digunakan untuk menghitung jumlah nilai pada masing-masing bagian array. lsum digunakan untuk menghitung jumlah elemen di bagian kiri dan rsum digunakan untuk menghitung jumlah elemen di bagian kanan
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini? 
    - karena setelah dilakukan perhitungan tiap gabungan maka dilakukan combine (digabungkan) untuk mendapatkan nilai total keseluruhan
4. Apakah base case dari totalDC()? 
```
if (l == r) {
    return arr[l];
    }
```
5. Tarik Kesimpulan tentang cara kerja totalDC()
    - method totalDC() bekerja dengan membagi masalah menjadi bagian yang lebih kecil lalu menyelesaikan masing-masing bagian dan digabungkan hasilnya untuk mendapatkan nilai total keseluruhan. Array dibagi menjadi dua menggunakan mid lalu dihitung lsum dan rsum kemudian dilakukannya lsum + rsum