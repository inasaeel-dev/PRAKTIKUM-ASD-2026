package P7;

import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15(5);
        Scanner inas = new Scanner(System.in);
    
        int jmlMhs = 5;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke - " + (i+1));
            System.out.print("NIM       : ");
            String nim = inas.nextLine();
            System.out.print("Nama      : ");
            String nama = inas.nextLine();
            System.out.print("Kelas     : ");
            String kelas = inas.nextLine();
            System.out.print("IPK       : ");
            String ip = inas.nextLine();
            double ipk = Double.parseDouble(ip);

            list.tambah (new Mahasiswa15(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        String ip = inas.nextLine();
        double cari = Double.parseDouble(ip);

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;

        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}