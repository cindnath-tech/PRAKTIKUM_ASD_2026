package P6;

import java.util.Scanner;

public class MahasiswaDemo08 {
    
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = cindy.nextInt();
        cindy.nextLine();
        System.out.println();

        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(n);
        // Mahasiswa08 m1 = new Mahasiswa08("123", "Zidan", "2A", 3.2);
        // Mahasiswa08 m2 = new Mahasiswa08("124", "Ayu", "2A", 3.5);
        // Mahasiswa08 m3 = new Mahasiswa08("125", "Sofi", "2A", 3.1);
        // Mahasiswa08 m4 = new Mahasiswa08("126", "Sita", "2A", 3.9);
        // Mahasiswa08 m5 = new Mahasiswa08("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        for (int i = 0; i < n; i++) {
            System.out.print("Nama  : ");
            String nama = cindy.nextLine();
            System.out.print("NIM   : ");
            String nim = cindy.nextLine();
            System.out.print("IPK   : ");
            String ipk = cindy.nextLine();
            double ip = Double.parseDouble(ipk);
            System.out.print("Kelas : ");
            String kelas = cindy.nextLine();
            System.out.println("----------------------");

            Mahasiswa08 m = new Mahasiswa08(nim, nama, kelas, ip);
            list.tambah(m);
        }


        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terturut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
