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
        }
    }    
    public static void tampilanSemua(String [][] jadwal) {
        System.out.println("======== DAFTAR JADWAL======== ");
        System.out.printf("%-20s %-15s %-10s %15",
        "Nama Matkul", "Ruang", "Hari");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n",
            jadwal[i][0], jadwal[i][1],
            jadwal[i][2], jadwal[i][3]);
        }
    }
}