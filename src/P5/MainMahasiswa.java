package P5;

public class MainMahasiswa {
    
    public static int maxUts(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUts;
        }

        int mid = (l + r) / 2;
        int lmax = maxUts(arr, l, mid);
        int rmax = maxUts(arr, mid + 1, r);
        return Math.max(lmax, rmax);
    }

    public static int minUts(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUts;
        }

        int mid = (l + r) / 2;
        int lmin = minUts(arr, l, mid);
        int rmin = minUts(arr, mid + 1, r);
        return Math.min(lmin, rmin);
    }

    public static double rataUas(Mahasiswa[] arr) {
        double total = 0;
        for (Mahasiswa m : arr) {
            total += m.nilaiUas;
        }
        return total / arr.length;
    }
    public static void main(String[] args) {
        Mahasiswa[] data = {
            new Mahasiswa("Ahmad", 78, 82),
            new Mahasiswa("Budi", 85, 88),
            new Mahasiswa("Cindy", 90, 87),
            new Mahasiswa("Dian", 76, 79),
            new Mahasiswa("Eko", 92, 95),
            new Mahasiswa("Fajar", 88, 85),
            new Mahasiswa("Gina", 80, 83),
            new Mahasiswa("Hadi", 82, 84)
        };

        System.out.println("Nilai UTS Tertinggi : " +maxUts(data, 0, data.length -1));
        System.out.println("Nilai UTS Terendah : " +minUts(data, 0, data.length - 1));
        System.out.println("Rata-rata Nilai UAS : " +rataUas(data));
    }
}
