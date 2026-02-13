package Pertemuan_Minggu_1;
public class fungsiRG {
    public static int hitungPendapatan(int [] stock, int [] hargaBarang) {
        int total = 0;
        for (int i = 0; i < stock.length; i++) {
            total += stock[i] * hargaBarang[i];
        }
        return total;
    }
    public static String statusCabang (int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    public static void main(String[] args) {
        String [] cabangRoyalGarden = {
            "Royal Garden 1", "Royal Garden 2", 
            "Royal Garden 3", "Royal Garden 4"
        };
        int [][] stock = {
            {10, 5, 15, 7}, {6, 11, 9, 12},
            {2, 10, 10, 5}, {5, 7, 12, 9}
        };
        int [] hargaBarang = {75000, 50000, 60000, 10000};
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock [i], hargaBarang);
            String status = statusCabang(pendapatan);

            System.out.println("Cabang : " + cabangRoyalGarden[i]);
            System.out.println("Pendapatan : Rp " +pendapatan);
            System.out.println("Status : " + status);
            System.out.println("-----------------------------");
        }
    }
}