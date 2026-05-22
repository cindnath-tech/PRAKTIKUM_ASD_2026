package P11;

import java.util.Scanner;

public class AntrianMain {
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        QueueAntrian antrian = new QueueAntrian(3);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Jumlah Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = cindy.nextInt(); cindy.nextLine();
            switch (pilihan) {
                case 1:
                    antrian.tambahAntrian(new Mahasiswa("12457", "Johan", "2C"));
                    antrian.tambahAntrian(new Mahasiswa("13423", "Milen", "2E"));
                    antrian.tambahAntrian(new Mahasiswa("14232", "Dika", "2F"));
                    break;
                case 2:
                    antrian.memanggilAntrian();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    antrian.lihatTerakhir();
                    break;
                case 4:
                    antrian.jumlahAntrian();
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.clear();
                    antrian.jumlahAntrian();
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
