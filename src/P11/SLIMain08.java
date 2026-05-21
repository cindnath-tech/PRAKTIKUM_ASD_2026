package P11;

import java.util.Scanner;

public class SLIMain08 {
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jml = cindy.nextInt();
        cindy.nextLine();
        SingleLinkedList08 sll = new SingleLinkedList08();
        
        for (int i = 0; i < jml; i++) {
            System.out.println("Data mahasiswa ke-" + (1 + i));
            System.out.print("NIM : ");
            String nim = cindy.nextLine();
            System.out.print("Nama : ");
            String nama = cindy.nextLine();
            System.out.print("Kelas : ");
            String kelas = cindy.nextLine();
            System.out.print("IPK : ");
            double ipk = cindy.nextDouble();
            cindy.nextLine();

            Mahasiswa08 mhs = new Mahasiswa08(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            sll.print();
        }
        // Mahasiswa08 mhs1 = new Mahasiswa08("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa08 mhs2 = new Mahasiswa08("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa08 mhs3 = new Mahasiswa08("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa08 mhs4 = new Mahasiswa08("21212203", "Dirga", "4D", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.inserAt(2, mhs2);
        // sll.print();
    }
}
