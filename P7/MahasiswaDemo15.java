package P7;

import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = inas.nextInt();
        inas.nextLine();
        System.out.println();

        int jmlMhs = 5;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke - " + (i+1));
            System.out.print("NIM       : ");
            String nim = inas.nextLine();
            System.out.println("Nama    : ");
            String nama = inas.nextLine();
            System.out.print("Kelas     : ");
            String kelas = inas.nextLine();
            System.out.print("IPK       : ");
            String ip = inas.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------");

            Mahasiswa15 m = new Mahasiswa15(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        list.tampil();
        System.out.println("------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        String stCari = inas.nextLine();
        double cari = Double.parseDouble(stCari);
        System.out.println("-----------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-----------------------");
        double posisi2 = list.findBinarySearch(cari, 0, n - 1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSeacrh(cari, pss2);

        System.out.println("----------------------------");
        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSeacrh(cari, pss);

        System.out.println("\nData mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData yang sudah terturut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT");
        list.insertionSort();
        list.tampil();
    }
}
