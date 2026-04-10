package P7.CaseMethod1;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;;

    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.print("NIM: " + nim + " | ");
        System.out.print("Nama: " + nama + " | ");
        System.out.print("Prodi: " + prodi);
    }
}
