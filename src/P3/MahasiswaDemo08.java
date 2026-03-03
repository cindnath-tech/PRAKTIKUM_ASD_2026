package P3;

public class MahasiswaDemo08 {
    
    public static void main(String[] args) {
        Mahasiswa08[] arrMahasiswa08 = new Mahasiswa08[3];
        arrMahasiswa08[0] = new Mahasiswa08();
        arrMahasiswa08[0].nim = "244107060033";
        arrMahasiswa08[0].nama = "AGNES TITANIA KINANTI";
        arrMahasiswa08[0].kelas = "SIB-1E";
        arrMahasiswa08[0].ipk = (float) 3.75;

        arrMahasiswa08[1] = new Mahasiswa08();
        arrMahasiswa08[1].nim = "2341720172";
        arrMahasiswa08[1].nama = "ACHMAD MAULANA HAMZAH";
        arrMahasiswa08[1].kelas = "TI-2A";
        arrMahasiswa08[1].ipk = (float) 3.36;

        arrMahasiswa08[2] = new Mahasiswa08();
        arrMahasiswa08[2].nim = "244107023006";
        arrMahasiswa08[2].nama = "DIRHAMAWAN PUTRANTO";
        arrMahasiswa08[2].kelas = "TI-2E";
        arrMahasiswa08[2].ipk = (float) 3.80;

        System.out.println("NIM     : " +arrMahasiswa08[0].nim);
        System.out.println("Nama    : " +arrMahasiswa08[0].nama);
        System.out.println("Kelas   : " +arrMahasiswa08[0].kelas);
        System.out.println("IPK     : " +arrMahasiswa08[0].ipk);
        System.out.println("----------------------------------");
        System.out.println("NIM     : " +arrMahasiswa08[1].nim);
        System.out.println("Nama    : " +arrMahasiswa08[1].nama);
        System.out.println("Kelas   : " +arrMahasiswa08[1].kelas);
        System.out.println("IPK     : " +arrMahasiswa08[1].ipk);
        System.out.println("----------------------------------");
        System.out.println("NIM     : " +arrMahasiswa08[2].nim);
        System.out.println("Nama    : " +arrMahasiswa08[2].nama);
        System.out.println("Kelas   : " +arrMahasiswa08[2].kelas);
        System.out.println("IPK     : " +arrMahasiswa08[2].ipk);
        System.out.println("----------------------------------");
    }
}
