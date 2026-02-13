package P1;

import java.util.Scanner;

public class tugas2 {
    static Scanner cindy = new Scanner(System.in);
    static int jmlJadwal;
    static String[][] jadwal;
    static String[] kolom = {"Nama Mata Kuliah", "Ruang", "Hari Kuliah", "Jam Kuliah"};
    static String hari, matkul;
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliahmu : ");
        jmlJadwal = cindy.nextInt();
        cindy.nextLine();

        jadwal = new String[jmlJadwal][kolom.length];

        tampilJadwal();
        cariHariKuliah();
        cariMatkul();
    }

    static void inputJadwal() {
        for (int i = 0; i < jadwal.length; i++) {
           System.out.println("\nJadwal ke - " + (i + 1));
           for (int j = 0; j < kolom.length; j++) {
            System.out.print(kolom[j] + " : ");
            jadwal[i][j] = cindy.nextLine();
           }
        }
    }

    static void tampilJadwal() {
        inputJadwal();
        System.out.println("\n=== Jadwal Kuliah ===");
        System.out.print("Jadwal\t");
        for (int i = 0; i < kolom.length; i++) {
            System.out.print(kolom[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < jadwal.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < kolom.length; j++) {
                System.out.print(jadwal[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void cariHariKuliah() {
        System.out.print("\nMasukkan hari yang ingin dicari : ");
        hari = cindy.nextLine();
        boolean ada = false;
        System.out.println("Jadwal pada hari " + hari + " : ");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                ada = true;
                System.out.println(
                    (i + 1) + "\t" +
                    jadwal[i][0] + "\t" +
                    jadwal[i][1] + "\t" +
                    jadwal[i][2] + "\t" +
                    jadwal[i][3] + "\t"
                );
            }
        }

        if (!ada) {
            System.out.println("Tidak ada perkuliahan di hari tersebut");
        }
    }

    static void cariMatkul() {
        System.out.print("\nMasukkan nama mata kuliah yang dicari : ");
        matkul = cindy.nextLine();
        boolean ketemu = false;
        System.out.print("Jadwal dengan mata kuliah " + matkul + " : ");

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(matkul)) {
                ketemu = true;
                System.out.println(
                     (i + 1) + "\t" +
                    jadwal[i][0] + "\t" +
                    jadwal[i][1] + "\t" +
                    jadwal[i][2] + "\t" +
                    jadwal[i][3] + "\t"
                );
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ada jadwal dengan mata kuliah tersebut");
        }
    }
}
