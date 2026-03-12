package P3;

import java.util.Scanner;

public class DosenDemo08 {
    
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen : ");
        int jmlDosen = cindy.nextInt();
        cindy.nextLine();

        Dosen08[] arrDosen08 = new Dosen08[jmlDosen];
        String kode, nama, jk;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrDosen08.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" +(i + 1));
            System.out.print("Kode  : ");
            kode = cindy.nextLine();
            System.out.print("Nama  : ");
            nama = cindy.nextLine();
            System.out.print("Jenis Kelamin (L / P) : ");
            jk = cindy.nextLine();
            jenisKelamin = jk.equalsIgnoreCase("L"); 
            System.out.print("Usia  : ");
            usia = cindy.nextInt();
            cindy.nextLine();
            System.out.println("---------------------------------------");  

            arrDosen08[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        for (int i = 0; i < arrDosen08.length; i++) {
            System.out.println("Data Dosen ke-" +(i + 1));
            arrDosen08[i].cetakInfo();
        }
    }
}
