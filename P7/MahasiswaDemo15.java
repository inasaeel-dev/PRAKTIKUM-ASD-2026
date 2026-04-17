package P7;

import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = inas.nextInt();
        System.out.println();

        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15(n);
    
        int jmlMhs = 5;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke - " + (i+1));
            System.out.println("NIM       : ");
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

        for (int i = 0; i < list.listMhs.length - 1; i++) {
            for (int j = 0; j < list.listMhs.length - i - 1; j++) {
                if (list.listMhs[j].ipk > list.listMhs[j + 1].ipk) {
                    Mahasiswa15 temp = list.listMhs[j];
                    list.listMhs[j] = list.listMhs[j + 1];
                    list.listMhs[j + 1] = temp;
            }
        }
    }
        System.out.println("Masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        String ip = inas.nextLine();
        double cari = Double.parseDouble(ip);

        System.out.println("------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jmlMhs -1);
        int pss = (int)posisi2;

        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}