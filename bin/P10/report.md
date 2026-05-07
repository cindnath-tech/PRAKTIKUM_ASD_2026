|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020202|
| Nama |  Cindy Callista N.S. |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/cindnath-tech/PRAKTIKUM_ASD_2026 |

# Jobsheet 10 - Queue

## Percobaan 1
Hasil run dari percobaan 1 :
```
Masukkan kapasistas queue : 4
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
---------------------------
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
---------------------------
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
---------------------------
4
Elemen terdepan : 15
```

### Pertanyaan Percobaan 1
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
    - karena front dan rear bernilai -1 menandakan queue masih kosong sedangkan size bernilai 0 menandakan belum ada data di dalam queue.
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
```
if (rear == max - 1) {
    rear = 0;
```
    - jika rear sudah sampai pada indeks terkahir yaitu max - 1 lalu akan dikembalikan ke awal yaitu 0 agar array dapat digunakan kembali dari depan.
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
```
if (front == max - 1) {
    front = 0;
```
    - jika front sudah sampai di posisi akhir array maka front akan kembali ke awal agar pengambilan data tetap berjalan dalam bentuk melingkar.
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
    - karena elemen pertama tidak selalu berada di index 0, bisa saja front sudah bergeser setelah dilakukannya proses dequeue
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! 
```
i = (i + 1) % max;
```
    - dilakukannya perpindahan index berikutnya dengan perintah i + 1 lalu di modulus dengan max (jika nilai i melebihi batas array maka akan kembali lagi ke 0), kode tersebut menjadikan perulangan dapat berputar terus tanpa keluar dari array
6. Tunjukkan potongan kode program yang merupakan queue overflow! 
    - dibawah ini merupakan kode yang menunjukkan queue overflow
```
if (isFull()) {
    System.out.println("Queue sudah penuh");
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
    - menambahkan System.exit() pada enqueue dan dequeue
```
if (isFull()) {
    System.out.println("Queue sudah penuh");
    System.exit(0);
dan
if (isEmpty()) {
    System.out.println("Queue masih kosong");
    System.exit(0);
```