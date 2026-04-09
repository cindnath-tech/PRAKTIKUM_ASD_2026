package P6;

import java.util.Scanner;

public class dosenDemo {
    
    public static void main(String[] args) {
        Scanner cindy = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : " );
        int dsn = cindy.nextInt();
        dataDosen list = new dataDosen(dsn);
        int menu;

        System.out.println("\n === MENU ===");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Sorting ASC berdasarkan usia");
        System.out.println("4. Sorting DSC berdasarkan usia");
        System.out.println("5. Sorting usia menggunakan insertion sort");
        System.out.println("6. Keluar");

        while (true) {
            System.out.print("\nMasukkan menu : ");
            menu = cindy.nextInt();
            cindy.nextLine();
                if (menu == 1) {
                    for (int i = 0; i < dsn; i++) {
                        System.out.print("Kode : ");
                        String kode = cindy.nextLine();
                        System.out.print("Nama : ");
                        String nama = cindy.nextLine();
                        System.out.print("Jenis Kelamin (L/P) : ");
                        String jk = cindy.nextLine();
                        boolean jenisKelamin = jk.equalsIgnoreCase("L");
                        System.out.print("Usia : ");
                        String usia = cindy.nextLine();
                        int age = Integer.parseInt(usia);
                        System.out.println("------------------");

                        Dosen dosen = new Dosen(kode, nama, jenisKelamin, age);
                        list.tambah(dosen); 
                    }  
                } else if (menu == 2) {
                    System.out.println("\nData seluruh dosen");
                    list.tampil();
                } else if (menu == 3) {
                    System.out.println("Data diurutkan berdasarkan usia (ASC)");
                    list.sortingASC();
                    list.tampil();
                } else if (menu == 4) {
                    System.out.println("Data diurutkan berdasarkan usia (DSC)");
                    list.sortingDSC();
                    list.tampil();
                } else if (menu == 5) {
                    System.out.println("Data diurutkan menggunakan insertion sort");
                    list.insertionSort();
                    list.tampil();
                } else {
                    System.out.println("Program telah selesai!");
                    break;
                }
            }
        }
    }    