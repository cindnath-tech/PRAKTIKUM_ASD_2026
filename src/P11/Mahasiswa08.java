package P11;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa08() {

    }

    Mahasiswa08(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
