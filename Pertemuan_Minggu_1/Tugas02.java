package Pertemuan_Minggu_1;
import java.util.Scanner;

public class Tugas02 {
        static Scanner inas = new Scanner(System.in);
    public static void inputJadwal(String [][] jadwal){
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Data Jadwal ke - " +(i+1));
            System.out.print("Nama Matkul : ");
            jadwal[i][0] = inas.nextLine();
            System.out.print("Ruang : ");
            jadwal[i][1] = inas.nextLine();
            System.out.print("Hari : ");
            jadwal [i][2] = inas.nextLine();
            System.out.print("Jam : ");
            jadwal [i][3] = inas.nextLine();
        }
    }    
    public static void tampilanSemua(String [][] jadwal) {
        System.out.println("======== DAFTAR JADWAL======== ");
        System.out.printf("%-20s %-15s %-10s %15s\n",
        "Nama Matkul", "Ruang", "Hari", "Jam");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-20s %-15s %-10s \n%-15s\n",
            jadwal[i][0], jadwal[i][1],
            jadwal[i][2], jadwal[i][3]);
        }
    }
    public static void cariHari(String[][] jadwal) {
        System.out.print("\nMasukkan hari yang dicari: ");
        String hari = inas.nextLine();

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
            }
        }
    }
    public static void cariMK(String[][] jadwal) {
        System.out.print("\nMasukkan nama MK yang dicari: ");
        String mk = inas.nextLine();

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("Ruang: " + jadwal[i][1]);
                System.out.println("Hari : " + jadwal[i][2]);
                System.out.println("Jam  : " + jadwal[i][3]);
            }
        }
    }
    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal: ");
        int n = Integer.parseInt(inas.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);
        tampilanSemua(jadwal);
        cariHari(jadwal);
        cariMK(jadwal);
    }
}