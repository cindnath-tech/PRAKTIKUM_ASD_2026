package P15;

public class MataKuliahTgs {
    String kodeMk;
    String namaMk;
    int sks;

    public MataKuliahTgs(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return kodeMk + " - " + namaMk + " - " + sks + " SKS";
    }
}
