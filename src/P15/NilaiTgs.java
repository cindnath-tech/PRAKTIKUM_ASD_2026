package P15;

public class NilaiTgs {
    MahasiswaTgs mahasiswa;
    MataKuliahTgs mataKuliah;
    double nilai;

    public NilaiTgs(MahasiswaTgs mahasiswa, MataKuliahTgs mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return mahasiswa.nim + "\t" +
        mahasiswa.nama + "\t" +
        mataKuliah.namaMk + "\t" +
        mataKuliah.sks + "\t" +
        nilai;
    }
}
