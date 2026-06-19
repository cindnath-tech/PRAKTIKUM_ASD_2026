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

## Praktikum 2
Hasil run dari praktikum 2 :
```
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian 
```

### Pertanyaan Praktikum 2
1. Apakah perbedaan fungsi push() dan add() pada objek fruits? 
    - push() digunakan untuk menambahkan elemen baru ke bagian atas (top) stack sedangkan add() digunakan untuk menambahkan elemen baru ke akhir koleksi sehingga output yang dihasilkan akan sama
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian? 
```
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 


```
    - method push() digunakan untuk menambahkan elemen baru ke bagian atas dari stack, jika method push di hapus maka objek fruits tidak memiliki elemen yang dapat ditampilkan oleh perulangan Iterator sehingga ketika dijalankan "Melon" dan "Durian" tidak akan muncul
3. Jelaskan fungsi dari baris 46-49? 
    - kode program tersebut akan membuat objek iterator terlebih dahulu untuk mengakses elemen dalam collection fruits satu per satu, kemudian akan dilakukan pengecekan apakah masih ada elemen berikutnya yang belum terbaca jika ada maka perulangan akan terus berjalan, jika tidak maka perulangan akan berhenti. "it.next" akan mengambil elemen berikutnya dan memindahkan posisi iterator ke elemen berikutnya dan kemudian program akan menampilkan setiap elemen yang telah diperoleh
4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian? 
    - yang terjadi adalah error pada baris kode yang menggunkan method push, pop, dan empty karena method tersebut tidak ada dalam library List. Program akan tetap berjalan menggunakan List<String> jika di dalamnya tidak terdapat baris kode yang menggunakan method yang tersedia di stack (push, pop, empty, peek, dll)
5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”! 
```
menambahkan kode berikut:
fruits.set(fruits.size() - 1, "Strawberry");

hasil run:
Banana Orange Watermelon Leci Strawberry 
[Banana, Orange, Watermelon, Leci, Strawberry]
Strawberry Leci Watermelon Orange Banana 
```
6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
```
menambahkan kode berikut:
fruits.push("Mango");
fruits.push("Guava");
fruits.push("Avocado");
for (String fruit : fruits) {
    System.out.printf("%s ", fruit);
}

Collections.sort(fruits);
System.out.println("\nSetelah sorting: ");
System.out.println(fruits);

hasil run:
Mango Guava Avocado 
Setelah sorting: 
[Avocado, Guava, Mango]
```