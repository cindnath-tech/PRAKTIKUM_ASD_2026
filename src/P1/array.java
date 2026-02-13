package P1;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        String[] matkul = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemograman",
            "Praktikum Dasar Pemograman", "Keselamatan dan Kesehatan Kerja"};
        double[][] nilai = new double[matkul.length][1];
        String[][] nilaiHuruf = new String[matkul.length][1];
        double[][] nilaiSetara = new double[matkul.length][1];
        int[] sks = {2, 2, 3, 2, 2, 2, 2, 2, 2};
        int jmlSks = 0;
        double jmlBobot = 0, ip = 0;

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + matkul[i] + " : ");
            nilai[i][0] = cindy.nextDouble();
        }
        System.out.println("===============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > 80 && nilai[i][j] <=100) {
                    nilaiHuruf[i][j] = "A";
                    nilaiSetara[i][j] = 4.00;
                } else if (nilai[i][j] > 73 && nilai [i][j] <= 80) {
                    nilaiHuruf[i][j] = "B+";
                    nilaiSetara[i][j] = 3.50;
                } else if (nilai[i][j] > 65 && nilai[i][j] <= 73) {
                    nilaiHuruf[i][j] = "B";
                    nilaiSetara[i][j] = 3.00;
                } else if (nilai[i][j] > 60 && nilai[i][j] <= 65) {
                    nilaiHuruf[i][j] = "C+";
                    nilaiSetara[i][j] = 2.50;
                } else if (nilai[i][j] > 50 && nilai[i][j] <= 60) {
                    nilaiHuruf[i][j] = "C";
                    nilaiSetara[i][j] = 2.00;
                } else if (nilai[i][j] > 39 && nilai[i][j] <= 50) {
                    nilaiHuruf[i][j] = "D";
                    nilaiSetara[i][j] = 1.00;
                } else {
                    nilaiHuruf[i][j] = "E";
                    nilaiSetara[i][j] = 0.00;
                }
            }
        }

        for (int i = 0; i < sks.length; i++) {
            jmlSks += sks[i];
        }

        for (int i = 0; i < matkul.length; i++) {
            jmlBobot += (nilaiSetara[i][0]) * sks[i]; 
        }

        ip = jmlBobot / jmlSks;

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-12.1f %-12s %-12.1f\n",
            matkul[i],
            nilai[i][0],
            nilaiHuruf[i][0],
            nilaiSetara[i][0]);
        }

        System.out.println("===============================");
        System.out.println("IP : " +String.format("%.2f", ip));
    }
}
