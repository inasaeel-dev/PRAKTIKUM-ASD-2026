package P11;

import java.util.Scanner;

public class AntrianMain15 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        QueueAntrian15 antrian = new QueueAntrian15(3);
        int pilihan;

        do{
            System.out.println("\n=== Menu Antrian Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggiil Antrian");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Jumlah Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = inas.nextInt();
            inas.nextLine();
            switch (pilihan) {
                case 1:
                    antrian.tambahAntrian(new Mahasiswa15("127001", "Zayn", "1D"));
                    antrian.tambahAntrian(new Mahasiswa15("127002", "Martin", "1C"));
                    antrian.tambahAntrian(new Mahasiswa15("127003", "Ujin", "1B"));
                    break;
                case 2:
                    antrian.memanggilAntrian();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    antrian.lihatTerakhir();
                    break;
                case 4:
                    antrian.jumlahAntrian();
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.clear();
                    antrian.jumlahAntrian();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}