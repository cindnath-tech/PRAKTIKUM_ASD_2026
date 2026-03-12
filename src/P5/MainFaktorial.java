package P5;
import java.util.Scanner;

public class MainFaktorial {
    
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = cindy.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF : " +fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC : " +fk.faktorialDC(nilai));
    }

}
