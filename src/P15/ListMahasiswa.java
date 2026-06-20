package P15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah (Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    // int linierSearch(String  nim) {
    //     for (int i = 0; i < mahasiswas.size(); i++) {
    //         if (nim.equals(mahasiswas.get(i).nim)) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public int binarySearch(String nim) {
        Collections.sort(mahasiswas, (a, b) -> a.nim.compareTo(b.nim));

        return Collections.binarySearch(mahasiswas, 
            new Mahasiswa(nim, "", ""),
            (a, b) -> a.nim.compareTo(b.nim)
        );
    }

    public void sortAsc() {
        Collections.sort(mahasiswas, (a, b) -> a.nim.compareTo(b.nim));
    }

    public void sortDesc() {
        Collections.sort(mahasiswas, (a, b) -> b.nim.compareTo(a.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        //menambah objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa
        lm.tampil();
        // update mahasiswa
        // lm.update(lm.linierSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        System.out.println("\nData Ascending : ");
        lm.sortAsc();
        lm.tampil();

        System.out.println("\nData Descending : ");
        lm.sortDesc();
        lm.tampil();
    }
}
