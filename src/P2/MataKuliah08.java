package P2;

public class MataKuliah08 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah08() {

    }

    public MataKuliah08(String kodeMk, String nm, int sks, int jmlJam) {
        this.kodeMk = kodeMk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam; 
    }

    void tampilkanInformasi() {
        System.out.println("Kode MK : " +kodeMk);
        System.out.println("Nama : " +nama);
        System.out.println("SKS : " +sks);
        System.out.println("Jumlah Jam : " +jumlahJam);
    }

    void ubahSks(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah berhasil diubah!");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan karena jam tidak mencukupi");
        }
    }
}
