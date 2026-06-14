package P13.CM2;

import java.util.Scanner;

public class MainAntrian {
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);

        DDLPembeli antrian = new DDLPembeli();
        DDLPesanan pesan = new DDLPesanan();
        LinkedListRekap rekap = new LinkedListRekap(); // untuk tempat menambahkan data baru di rekap
        int pilihan;
        do {
            System.out.println("=====================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=====================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Rekap Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = cindy.nextInt(); cindy.nextLine();
            switch (pilihan) {
                case 1:
                    antrian.tambahAntrian(new Pembeli(1, "Ainra", "08224500000"));
                    antrian.tambahAntrian(new Pembeli(2, "Danra", "08224511111"));
                    antrian.tambahAntrian(new Pembeli(3, "Sanri", "08224522222"));
                    antrian.tambahAntrian(new Pembeli(4, "Vania", "08422234556"));
                    System.out.println("Antrian berhasil ditambahkan");
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    Pembeli pbl = antrian.layaniAntrian();
                    if (pbl != null) {
                        System.out.print("Kode Pesanan  : ");
                        int kode = cindy.nextInt(); cindy.nextLine();
                        System.out.print("Nama Pesanan  : ");
                        String namaPesanan = cindy.nextLine();
                        System.out.print("Harga         : ");
                        int harga = cindy.nextInt();

                        Pesanan pesanBaru = new Pesanan(kode, namaPesanan, harga);
                        pesan.tambahPesanan(pesanBaru);
                        System.out.println(pbl.namaPembeli + " telah memesan " + pesanBaru.namaPesanan);
                    }
                    break;
                case 4:
                    pesan.tampilPesanan();
                    break;
                case 5:
                    rekap.tampilRekap(); // menampilkan rekap pesanan
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
