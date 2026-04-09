package P6;

public class dataDosen {
    Dosen [] dataDosen;
    int idx;

    dataDosen(int n) {
        dataDosen = new Dosen[n];
    }

    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen m : dataDosen) {
            m.tampil();
            System.out.println("----------------");
        }
    }

    void sortingASC() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j -1];
                    dataDosen[j -1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen temp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] =  dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
