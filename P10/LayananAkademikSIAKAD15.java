package P10;

import java.util.Scanner;

public class LayananAkademikSIAKAD15 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        AntrianLayanan15 antrian = new AntrianLayanan15(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah mahasiswa ke antrian");
            System.out.println("2. Layani mahasiswa");
            System.out.println("3. Lihat mahasiswa terdepan");
            System.out.println("4. Lihat semua antrian");
            System.out.println("5. Jumlah mahasiswa dalam antrian");
            System.out.println("6. Cek antrian paling belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = inas.nextInt();
            inas.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = inas.nextLine();
                    System.out.print("Nama  : ");
                    String nama = inas.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = inas.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = inas.nextLine();
                    Mahasiswa15 mhs = new Mahasiswa15(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa15 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null){
                        System.out.print("Melayani mahasiswa : ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian : " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.LihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0); 
    }
}