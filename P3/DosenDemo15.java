package P3;

import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen     : ");
        int jmlData = inas.nextInt();
        System.out.println();
        inas.nextLine();

        Dosen15 [] arrayDosen15 = new Dosen15[jmlData];
        String kode, nama;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < jmlData; i++) {
            System.out.println("Data Dosen ke - " + (i + 1));
            System.out.print("Kode          : ");
            kode = inas.nextLine();
            System.out.print("Nama          : ");
            nama = inas.nextLine();
            System.out.print("Jenis kelamin (true = perempuan, false = laki-laki  :");
            jenisKelamin = inas.nextBoolean();
            System.out.print("Usia           : ");
            usia = inas.nextInt();
            System.out.println("------------------------------------------------------------");
            inas.nextLine();

            arrayDosen15 [i] = new Dosen15(kode, nama, jenisKelamin, usia);
        }
        DataDosen15 data = new DataDosen15();

        System.out.println("====== Data Semua Dosen ======");
        data.dataSemuaDosen(arrayDosen15);
        System.out.println();

        
    }
}