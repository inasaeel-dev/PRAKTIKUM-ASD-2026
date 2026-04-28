package CM;

import java.util.Scanner;

public class PeminjamanDemo15 {
    public static void main(String[] args) {
    Mahasiswa15 [] m = {
        new Mahasiswa15("22001", "Andi", "Teknik Informatika"),
        new Mahasiswa15("22002", "Budi", "Teknik Informatika"),
        new Mahasiswa15("22003", "Citra", "Sistem Informasi Bisnis")
    };

    buku15 [] b = {
        new buku15("B001", "Algoritma", 2020),
        new buku15("B002", "Basis Data", 2019),
        new buku15("B003", "Pemrograman", 2021),
        new buku15("B004", "Fisika", 2024)
    };

    peminjaman15 [] p = {
        new peminjaman15(m[0], b[0], 7),
        new peminjaman15(m[1], b[1], 3),
        new peminjaman15(m[2], b[2], 10),
        new peminjaman15(m[2], b[3], 6),
        new peminjaman15(m[0], b[1], 4)
    };

    Scanner inas = new Scanner(System.in);
    int pilihMenu;

    do {
        System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda (Descending)");
        System.out.println("0. Keluar");
        System.out.print("Pilih : ");
        pilihMenu = inas.nextInt();
        inas.nextLine();

        if (pilihMenu == 1){
            for (Mahasiswa15 mhs: m){
                System.out.println(mhs.nim + " | " + mhs.nama + " | " + mhs.prodi);
            }

        } else if(pilihMenu == 2){
            for (buku15 bk: b){
                System.out.println(bk.kodeBuku + " | " + bk.judul + " | " + bk.tahunTerbit);
            }

        } else if(pilihMenu == 3){
            for (peminjaman15 pj: p){
                pj.tampilPeminjaman();
            }

        } else if(pilihMenu == 4){
            // Bubble Sort Descending
            for (int i = 0; i < p.length - 1; i++) {
                for (int j = 0; j < p.length - i - 1; j++) {
                    if (p[j].denda < p[j + 1].denda) {
                        peminjaman15 temp = p[j];
                        p[j] = p[j + 1];
                        p[j + 1] = temp;
                    }
                }
            }

            System.out.println("Data setelah diurutkan (Denda terbesar):");
            for (peminjaman15 pj: p){
                pj.tampilPeminjaman();
            }

        } else if(pilihMenu == 0){
            System.out.println("Keluar program!");

        } else {
            System.out.println("Pilihan tidak valid!");
        }

    } while (pilihMenu != 0);
}
}