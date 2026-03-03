package P3;

import java.util.Scanner;

public class MahasiswaDemo08 {
    
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        Mahasiswa08[] arrMahasiswa08 = new Mahasiswa08[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrMahasiswa08[i] = new Mahasiswa08();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrMahasiswa08[i].nim = cindy.nextLine();
            System.out.print("Nama  : ");
            arrMahasiswa08[i].nama = cindy.nextLine();
            System.out.print("Kelas : ");
            arrMahasiswa08[i].kelas = cindy.nextLine();
            System.out.print("IPK   : ");
            dummy = cindy.nextLine();
            arrMahasiswa08[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiwa ke-" + (1 +1));
            arrMahasiswa08[i].cetakInfo();
        }
    }
}
