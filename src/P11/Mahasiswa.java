package P11;

public class Mahasiswa {
    String nim;
    String nama;
    String kelas;

    Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampilkanInformasi() {
        System.out.println(nim + "\t" + nama + "\t" + kelas);
    }
}
