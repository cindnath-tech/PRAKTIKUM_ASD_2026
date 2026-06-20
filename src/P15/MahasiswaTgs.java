package P15;

public class MahasiswaTgs {
    String nim;
    String nama;
    String notelp;

    public MahasiswaTgs(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return nim + " - " + nama + " - "+ notelp;
    }
}