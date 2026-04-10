package P7;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = cindy.nextInt();
        cindy.nextLine();
        System.out.println();

        int jumMhs = 5;

        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08(n);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" +(i + 1));
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
        }

        list.tampil();
        System.out.println("------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        String stCari = cindy.nextLine();
        double cari = Double.parseDouble(stCari);

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSeacrh(cari, pss);

        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terturut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT");
        list.insertionSort();
        list.tampil();
    }
}