package P4;

import java.util.Scanner;

public class PaketPengirimanMain {
    
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        PaketPengiriman[] arrPaketPengiriman = new PaketPengiriman[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrPaketPengiriman[i] = new PaketPengiriman();

            System.out.print("Masukkan nomor resi paket : ");
            arrPaketPengiriman[i].nomorResi = cindy.nextLine(); //Mengisi nilai atribut nomor resi
            System.out.print("Masukkan jumlah berat paket : ");
            dummy = cindy.nextLine();
            arrPaketPengiriman[i].berat = Double.parseDouble(dummy); //Mengisi nilai atribut berat
            System.out.print("Masukkan harga ongkos dasar : ");
            dummy = cindy.nextLine();
            arrPaketPengiriman[i].ongkosDasar = Double.parseDouble(dummy); //Mengisi nilai atribut ongkos dasar
            System.out.println("-------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Berikut adalah data paket ke-" + (i + 1));
            arrPaketPengiriman[i].printData();
        }
    }
}
