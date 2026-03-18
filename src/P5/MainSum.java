package P5;

import java.util.Scanner;

public class MainSum {
    
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = cindy.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + " : ");
            sm.keuntungan[i] = cindy.nextDouble();
        }

        System.out.println("Toral keuntungan menggunakan brute force : " +sm.totalBF());
        System.out.println("Total keuntungan menggunakan divide and conquer : " +sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
