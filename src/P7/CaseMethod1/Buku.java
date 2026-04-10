package P7.CaseMethod1;

public class Buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku(String kode, String judul, int tahun) {
        kodeBuku = kode;
        this.judul = judul;
        tahunTerbit= tahun;
    }

    void tampilBuku() {
        System.out.print("Kode Buku: " + kodeBuku + " | ");
        System.out.print("Judul: " + judul + " | ");
        System.out.print("Tahun Terbit: " + tahunTerbit);
    }
}
