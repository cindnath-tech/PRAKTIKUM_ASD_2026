package P2;

public class MataKuliahMain08 {
    
    public static void main(String[] args) {
        MataKuliah08 mk1 = new MataKuliah08();
        mk1.kodeMk = "25617";
        mk1.nama = "Bahasa Inggris";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilkanInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilkanInformasi();

        MataKuliah08 mk2 = new MataKuliah08("1543", "Pancasila", 4, 12);
        mk2.tambahJam(2);
        mk2.tampilkanInformasi();
        
        MataKuliah08 mk3 = new MataKuliah08("5643", "Basis Data", 3, 9);
        mk3.kurangiJam(4);
        mk3.tampilkanInformasi();
    }
}
