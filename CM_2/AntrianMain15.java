package CM_2;

import java.util.Scanner;

public class AntrianMain15 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        DLLPembeli15 antrian = new DLLPembeli15();
        DLLPesanan15 laporan = new DLLPesanan15();
        int pilih;

        do {
            System.out.println("\n==== SISTEM ANTRIAN ROYAL DELISH ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilih = inas.nextInt();
            inas.nextLine();

            switch (pilih) {
                case 1:
                    antrian.tambahAntrian(new Pembeli15(1, "Ainra", "0822450000"));
                    antrian.tambahAntrian(new Pembeli15(2, "Danra", "0822245111"));
                    antrian.tambahAntrian(new Pembeli15(3, "Sanri", "0822452222"));
                    antrian.tambahAntrian(new Pembeli15(4, "Vania", "0822453333"));
                    System.out.println("Antrian sudah ditambahkan");
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    Pembeli15 p = antrian.hapusAntrian();
                    if (p != null) {
                        System.out.print("Kode Pesanan  : ");
                        int kode = inas.nextInt();
                        inas.nextLine();
                        System.out.print("Nama Pesanan  : ");
                        String namaPesanan = inas.nextLine();
                        System.out.print("Harga         : ");
                        int harga = inas.nextInt();

                        Pesanan15 newPesanan = new Pesanan15(kode, namaPesanan, harga);
                        laporan.tambahPesanan(newPesanan);
                        System.out.println(p.namaPembeli + " telah memesan "+ namaPesanan);
                    }
                    break;
                case 4:
                    laporan.tampilLaporan();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilih != 0);
    }
}