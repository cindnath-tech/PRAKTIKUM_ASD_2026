package P15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainTgs {
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);

        ArrayList<MahasiswaTgs> listMhs = new ArrayList<>();
        ArrayList<MataKuliahTgs> listMk = new ArrayList<>();
        ArrayList<NilaiTgs> listNilai = new ArrayList<>();
        Queue<NilaiTgs> queueHapus = new LinkedList<>(); 
        int pilihan;

        do {
            System.out.println("\n=======================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA");
            System.out.println("=======================================");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tambah Mata Kuliah");
            System.out.println("3. Input Nilai");
            System.out.println("4. Tampil Nilai");
            System.out.println("5. Mencari Nilai Mahasiswa");
            System.out.println("6. Urut Data Nilai");
            System.out.println("7. Hapus Nilai");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilihan = cindy.nextInt(); cindy.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = cindy.nextLine();
                    System.out.print("Nama : ");
                    String nama = cindy.nextLine();
                    System.out.print("No Telp : ");
                    String noTelp = cindy.nextLine();

                    listMhs.add(new MahasiswaTgs(nim, nama, noTelp));
                    System.out.println("Data mahasiswa berhasil ditambahkan");
                    break;
                case 2:
                    System.out.print("Kode MK : ");
                    String kodeMk = cindy.nextLine();
                    System.out.print("Nama MK : ");
                    String namaMk = cindy.nextLine();
                    System.out.print("SKS : ");
                    int sks = cindy.nextInt(); cindy.nextLine();

                    listMk.add(new MataKuliahTgs(kodeMk, namaMk, sks));
                    System.out.println("Data mata kuliah berhasil ditambahkan");
                    break;
                case 3:
                    if (listMhs.isEmpty() || listMk.isEmpty()) {
                        System.out.println("Data masih kosong");
                        break;
                    }

                    System.out.println("\nDaftar Mahasiswa");
                    for (int i = 0; i < listMhs.size(); i++) {
                        System.out.println((i + 1) + ". " + listMhs.get(i).nama);
                    }
                    System.out.print("Pilih mahasiswa : ");
                    int idxMhs = cindy.nextInt() - 1;

                    System.out.println("\nDaftar Mata Kuliah");
                    for (int i = 0; i < listMk.size(); i++) {
                        System.out.println((i + 1) + ". " + listMk.get(i).namaMk);
                    }
                    System.out.print("Pilih mata kuliah : ");
                    int idxMk = cindy.nextInt() - 1;

                    System.out.print("Nilai : ");
                    double nilai = cindy.nextDouble(); cindy.nextLine();

                    NilaiTgs nl = new NilaiTgs(listMhs.get(idxMhs), listMk.get(idxMk), nilai);
                    listNilai.add(nl);
                    queueHapus.offer(nl);
                    System.out.println("Nilai berhasil ditambahkan");
                    break;
                case 4:
                    if (listNilai.isEmpty()) {
                        System.out.println("Belum ada data nilai");
                        break;
                    }

                    System.out.println("\nDaftar Nilai");
                    System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
                    for (NilaiTgs data : listNilai) {
                        System.out.println(data);
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM : ");
                    String nimCari = cindy.nextLine();
                    int totalSKS = 0;
                    boolean ditemukan = false;

                    System.out.println("\nHasil Pencarian");
                    System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
                    for (NilaiTgs data : listNilai) {
                        if (data.mahasiswa.nim.equals(nimCari)) {
                            System.out.println(data);
                            totalSKS += data.mataKuliah.sks;
                            ditemukan = true;
                        }
                    }

                    if (ditemukan) {
                        System.out.println("Total SKS : " +totalSKS);
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 6:
                    Collections.sort(listNilai, Comparator.comparingDouble(a -> a.nilai));
                    System.out.println("\nData nilai setelah diurutkan");
                    System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
                    for (NilaiTgs data : listNilai) {
                        System.out.println(data);
                    }
                    break;
                case 7:
                    if (queueHapus.isEmpty()) {
                        System.out.println("Queue masih kosong");
                    } else {
                        NilaiTgs hapus = queueHapus.poll();
                        listNilai.remove(hapus);
                        System.out.println("Nilai " + hapus.mahasiswa.nama + " berhasil dihapus");
                    }
                    break;
                case 0:
                    System.out.println("Program anda selesai!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
        cindy.close();
    }
}
