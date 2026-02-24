package P2;

public class Dosen08 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen08() {

    }

    public Dosen08(String idDosen, String nm, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        nama = nm;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilkanInformasi() {
        System.out.println("ID Dosen    : " +idDosen);
        System.out.println("Nama Dosen  : " +nama);
        if (statusAktif) {
            System.out.println("Status Dosen : Aktif");
        } else {
            System.out.println("Status Dosen : Tidak aktif");
        }

        System.out.println("Tahun Bergabung : " +tahunBergabung);
        System.out.println("Bidang Keahlian : " +bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int tahunSkrg) {
        int masaKerja = tahunSkrg - tahunBergabung;
        System.out.println("Masa kerja dosen : " + masaKerja + " tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
