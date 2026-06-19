|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020202|
| Nama |  Cindy Callista N.S. |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/cindnath-tech/PRAKTIKUM_ASD_2026 |

# Jobsheet 15 - Collection

## Praktikum 1
Hasil run dari praktikum 1 :
```
Elemen 0: 1 total elemen: 4 elemen terkahir: Cireng
Elemen 0: 2 total elemen: 4 elemen terkahir: 4
Elemen 0: Noureen total elemen: 5 elemen terkahir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terkahir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
```

### Pertanyaan Praktikum 1
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist? 
    - Karena menggunakan List dan ArrayList tanpa generic type sehingga ArrayList akan menyimpan elemen dengan tipe object (dapat menampung berbagai jenis data seperti Interger dan String)
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
```
List<String> l = new ArrayList<>();
l.add("Satu");
l.add("Dua");
l.add("Tiga");
l.add("Cireng");
System.out.printf("Elemen 0: %s total elemen: %s elemen terkahir: %s\n", 
l.get(0), l.size(), l.get(l.size() - 1));

l.add("Empat");
l.remove(0);
System.out.printf("Elemen 0: %s total elemen: %s elemen terkahir: %s\n", 
l.get(0), l.size(), l.get(l.size() - 1));
```
3. Ubah kode pada baris kode 38  menjadi seperti ini
```
LinkedList<String> names = new LinkedList<>();
```
4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya 
```
names.push("Mei-mei");
System.out.printf("Elemen 0: %s total elemen: %s elemen terkahir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
System.out.println("Names: " + names.toString());
```
5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
```
Elemen 0: Satu total elemen: 4 elemen terkahir: Cireng
Elemen 0: Dua total elemen: 4 elemen terkahir: Empat
Elemen 0: Noureen total elemen: 5 elemen terkahir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terkahir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
Elemen 0: Mei-mei total elemen: 6 elemen terkahir: Al-Qarni
Names: [Mei-mei, My kid, Akhleema, Shannum, Uwais, Al-Qarni]
```
    - Method push pada LinkedList bekerja seperti di stack yaitu menambahkan elemen di bagian depan (head) dari linked list