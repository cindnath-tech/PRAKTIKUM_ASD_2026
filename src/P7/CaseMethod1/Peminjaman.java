package P7.CaseMethod1;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    boolean isCanceled; // atribut yang akan digunakan untuk menandai data yang perlu dihapus 

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat < 0) {
            terlambat = 0;
        }
        denda = terlambat * 2000;

        if (denda > 20000) {  // Pada program ini akan dilakukan pengecekan apakah denda melebihi 20000, jika iya maka program akan set denda otomatis 20000
            denda = 20000; // Jawaban dari Sesi 4 yang A
        }
    }

    void tampilPeminjaman() {
        System.out.print(mhs.nama + " | ");
        System.out.print(buku.judul + " | ");
        System.out.print("Lama : " + lamaPinjam + " | ");
        System.out.print("Terlambat: " + terlambat + " | ");
        System.out.print("Denda: " + denda);
    }
}
