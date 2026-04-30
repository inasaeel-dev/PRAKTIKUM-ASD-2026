package P9;

import java.util.Scanner;

public class SuratMain15 {
    public static void main(String[] args) {
        StackSurat15 stack = new StackSurat15(10);
        Scanner inas = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Masukkan Data Surat");
            System.out.println("2. Memverifikasi Surat");
            System.out.println("3. Melihat Surat Teratas");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.print("Pilih : ");
            pilih = inas.nextInt();
            inas.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = inas.nextLine();
                    System.out.print("Nama: ");
                    String nama = inas.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = inas.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = inas.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = inas.nextInt();
                    Surat15 s = new Surat15(id, nama, kelas, durasi, jenis);
                    stack.push(s);
                    break;
                case 2:
                    System.out.println("Verifikasi Surat ");
                    System.out.println("ID Surat\tNama\tKelas\tJenis Izin\tDurasi ");
                    stack.print();
                    break;
                case 3:
                    Surat15 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir di input pada mahasiswa  " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Cari nama: ");
                    String cari = inas.nextLine();
                    if (stack.cariNama(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}