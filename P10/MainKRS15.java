package P10;

import java.util.Scanner;

public class MainKRS15 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        AntrianKRS15 antrian = new AntrianKRS15 (10);
        int pilih;

        do {
            System.out.println("\n=== SISTEM ANTRIAN KRS DPA ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Statistik & Sisa DPA");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = inas.nextInt();
            inas.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); 
                    String nim = inas.nextLine();
                    System.out.print("Nama: "); 
                    String nama = inas.nextLine();
                    System.out.print("Prodi: "); 
                    String prodi = inas.nextLine();
                    System.out.print("Kelas: "); 
                    String kelas = inas.nextLine();
                    antrian.tambahAntrian(new Mahasiswa15 (nim, nama, prodi, kelas));
                    break;
                case 2: 
                    antrian.panggilAntrian(); 
                    break;
                case 3: 
                    antrian.tampilkanSemua(); 
                    break;
                case 4: 
                    antrian.tampilkanDuaTerdepan(); 
                    break;
                case 5: 
                    antrian.tampilkanTerakhir(); 
                    break;
                case 6: 
                    antrian.cetakStatistik(); 
                    break;
                case 7: 
                    antrian.clear(); 
                    break;
            }
        } while (pilih != 0);
    }
}