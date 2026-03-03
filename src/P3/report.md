|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020202|
| Nama |  Cindy Callista N |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/cindnath-tech/PRAKTIKUM_ASD_2026 |

# Jobsheet 3 - Array Of Object

## 3.2 Percobaan 1

Hasil dari percobaan 1 :

```
NIM     : 244107060033
Nama    : AGNES TITANIA KINANTI
Kelas   : SIB-1E
IPK     : 3.75
----------------------------------
NIM     : 2341720172
Nama    : ACHMAD MAULANA HAMZAH
Kelas   : TI-2A
IPK     : 3.36
----------------------------------
NIM     : 244107023006
Nama    : DIRHAMAWAN PUTRANTO
Kelas   : TI-2E
IPK     : 3.8
----------------------------------
```

### Pertanyaan Percobaan 1

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method Jelaskan!
    - tidak harus karena class bisa hanya berisi atribut saja maupun method saja, atribut digunakan untuk menyimpan data yang akan ditambilkan
2. Apa yang dilakukan oleh kode program berikut?
    - kode program diatas akan membuat arrMahsiswa yang dapat menampunng tiga object mahasiswa
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
    - tidak memiliki konstruktor default namun dapat memanggil kode program berikut karena java otomatis menyediakan konstruktor default
4. Apa yang dilakukan oleh kode program berikut?
    - melakukan proses instansiasi untuk membuat objek dan mengisi nilai dari elemen array
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2? 
    - karena dengan dipisah dapat untuk atribut dapat berfokus di class Mahasiswa sedangkan class MahasiswaDemo difokuskan pada logika eksekusinya agar lebih mudah dalam mengelola data

## 3.3 Percobaan 2

Hasil dari percobaan 2 : 

```
Masukkan Data Mahasiswa ke-1
NIM   : 254107867
Nama  : Jace
Kelas : TI - 2F
IPK   : 4.00
-------------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 254108987
Nama  : Inas
Kelas : TM - 1M
IPK   : 3.89
-------------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 254106547
Nama  : Johan
Kelas : TE - 2A
IPK   : 3.88
-------------------------------
Data Mahasiwa ke-2
NIM     : 254107867
Nama    : Jace
Kelas   : TI - 2F
IPK     : 4.0
----------------------------
Data Mahasiwa ke-2
NIM     : 254108987
Nama    : Inas
Kelas   : TM - 1M
IPK     : 3.89
----------------------------
Data Mahasiwa ke-2
NIM     : 254106547
Nama    : Johan
Kelas   : TE - 2A
IPK     : 3.88
----------------------------
```

### Pertanyaan Percobaan 2

1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3. 
```
Masukkan Data Mahasiswa ke-1
NIM   : 254107564
Nama  : Jace
Kelas : TI - 2G
IPK   : 3.88
-------------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 254106897
Nama  : Johan
Kelas : TM - 2G
IPK   : 4.00
-------------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 254103456
Nama  : Rama
Kelas : TE - 3D
IPK   : 3.76
-------------------------------
Data Mahasiwa ke-2
NIM     : 254107564
Nama    : Jace
Kelas   : TI - 2G
IPK     : 3.88
----------------------------
Data Mahasiwa ke-2
NIM     : 254106897
Nama    : Johan
Kelas   : TM - 2G
IPK     : 4.0
----------------------------
Data Mahasiwa ke-2
NIM     : 254103456
Nama    : Rama
Kelas   : TE - 3D
IPK     : 3.76
----------------------------
```
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
    - karena myArrayOfMahasiswa hanya membuat slot sebanyak 3 kali namun varibelnya belum dideklarasikan sehingga isi dari arraynya masih null