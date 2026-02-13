package P1;

import java.util.Scanner;

public class pemilihan {
    
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir;
        double persenTugas = 0.2, persenKuis = 0.2, persenUts = 0.3, persenUas = 0.4; 
        String nilaiHuruf = " ", keterangan, nilai;
    
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = cindy.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = cindy.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        uts = cindy.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        uas = cindy.nextDouble();
        System.out.println("===============================");
        System.out.println("===============================");
        

        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai Tidak Valid!");
        } else if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai Tidak Valid!");
        } else if (uts < 0 || uts > 100) {
            System.out.println("Nilai Tidak Valid!");
        } else {
            nilaiAkhir = (tugas * persenTugas) + (kuis * persenKuis) + (uts * persenUts) + (uas * persenUas);
            
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        if (nilaiHuruf == "D" || nilaiHuruf == "E") {
            keterangan = "TIDAK LULUS!";
        } else {
            keterangan = "SELAMAT ANDA LULUS";
        }
        
        System.out.println("Nilai Akhir : " +nilaiAkhir);
        System.out.println("Nilai Huruf : " +nilaiHuruf);
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println(keterangan);
        }
    }
}
