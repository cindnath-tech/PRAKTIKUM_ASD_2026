package P3;

public class Matakuliah08 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;

    public Matakuliah08() {
        
    }

    public Matakuliah08 (String kode, String nama, int sks, int jumlahjam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    void tambahData (String kd, String nm, int sks, int jmlJam) {
        kode = kd;
        nama = nm;
        this.sks = sks;
        jumlahjam = jmlJam;
    }

    void cetakInfo() {
        System.out.println("Kode        : " +kode);
        System.out.println("Nama        : " +nama);
        System.out.println("Sks         : " +sks);
        System.out.println("Jumlah Jam  : " +jumlahjam);
    }
}
