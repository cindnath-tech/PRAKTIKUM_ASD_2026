package P1;

public class fungsi {
    static String[] cabangToko = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
    static int[][] bunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
    static int[] harga = {75000, 50000, 60000, 10000};
    public static void main(String[] args) {
        pendapatanTiapCabang();
    }

    static int pendapatanTiapCabang () {
        int pendapatan = 0;
        for (int i = 0; i < cabangToko.length; i++) {
           pendapatan = (bunga[i][0] * harga[0]) + (bunga[i][1] * harga[1]) +
           (bunga[i][2] * harga[2]) + (bunga[i][3] * harga[3]);

            System.out.println("Pendapatan " + cabangToko[i] + " : Rp " +pendapatan);

            if (pendapatan <= 1500000) {
                System.out.println("Status : Perlu evaluasi");
            } else {
                System.out.println("Status : Sangat Baik");
            }

            System.out.println("=======================================");
        }
        return pendapatan;
    }
}
