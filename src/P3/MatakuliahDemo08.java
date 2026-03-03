package P3;

import java.util.Scanner;

public class MatakuliahDemo08 {
    
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        Matakuliah08[] arrayOfMatakuliah08 = new Matakuliah08[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = cindy.nextLine();
            System.out.print("Nama       : ");
            nama = cindy.nextLine();
            System.out.print("Sks        : ");
            dummy = cindy.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = cindy.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            arrayOfMatakuliah08[i] = new Matakuliah08(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah08[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah08[i].nama);
            System.out.println("Sks         : " + arrayOfMatakuliah08[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah08[i].jumlahjam);
            System.out.println("---------------------------------------");
        }
    }
}
