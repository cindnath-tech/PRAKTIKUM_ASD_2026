package P7.CaseMethod1;

import java.util.Scanner;

public class MainCaseMethod {
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        Mahasiswa [] listMhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Basis")
        };

        Buku [] listBuku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        Peminjaman [] listPeminjaman = {
            new Peminjaman(listMhs[0], listBuku[0], 7),
            new Peminjaman(listMhs[1], listBuku[1], 3),
            new Peminjaman(listMhs[2], listBuku[2], 10),
            new Peminjaman(listMhs[2], listBuku[3], 6),
            new Peminjaman(listMhs[0], listBuku[1], 4),
        };
        
        while (true) {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int menu = cindy.nextInt();
            cindy.nextLine();
            System.out.println();
            if (menu == 1) {
                for (Mahasiswa mhs : listMhs) {
                    mhs.tampilMahasiswa();
                    System.out.println();
                }
            } else if (menu == 2) {
                for (Buku bk : listBuku) {
                    bk.tampilBuku();
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.print("Masukkan NIM: ");
                String cari = cindy.nextLine();
                boolean ketemu = false;
                boolean isCanceled = false;
                for (int i = 0; i < listPeminjaman.length; i++) {
                    if (listPeminjaman[i].mhs.nim.equals(cari)) {
                        ketemu = true;
                        isCanceled = ketemu;
                    }
                } // fungsi ini digunakan untuk mencari nim yang datanya perlu dihapus
                // Jawaban dari Sesi 4 yang B

                if (!ketemu) {
                    System.out.println("Data tidak ditemukan");
                }

                for (Peminjaman pmjn : listPeminjaman) {
                    if (isCanceled = true) { // digunakan untuk menampilkan data yang isCancelednya false
                        pmjn.tampilPeminjaman();
                    }
                    System.out.println();
                }
            } else if (menu == 4) {
                for (int i = 1; i < listPeminjaman.length; i++) {
                    Peminjaman temp = listPeminjaman[i];
                    int j = i;
                    while (j > 0 && listPeminjaman[j - 1].denda < temp.denda) {
                        listPeminjaman[j] = listPeminjaman[j - 1];
                        j--;
                    }
                    listPeminjaman[j] = temp;
                }

                System.out.println("Setelah diurutkan (Denda terbesar):");
                for (Peminjaman pmjn : listPeminjaman) {
                    pmjn.tampilPeminjaman();
                    System.out.println();
                }
            } else if (menu == 5) {
                System.out.print("Masukkan NIM: ");
                String cari = cindy.nextLine();
                boolean ketemu = false;
                for (int i = 0; i < listPeminjaman.length; i++) {
                    if (listPeminjaman[i].mhs.nim.equals(cari)) {
                        listPeminjaman[i].tampilPeminjaman();
                        ketemu = true;
                    }
                    System.out.println();
                }

                if (!ketemu) {
                    System.out.println("Data tidak ditemukan");
                }
            } else {
                System.out.println("Program Anda Selesai!");
                break;
            }
        }
    }
    
}
