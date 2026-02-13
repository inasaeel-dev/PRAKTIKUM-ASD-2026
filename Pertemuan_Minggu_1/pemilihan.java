package Pertemuan_Minggu_1;

import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = inas.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = inas.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = inas.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = inas.nextDouble();

        System.out.println("==============================");

        // Validasi nilai
        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("nilai tidak valid");
            System.out.println("==============================");

        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

            String nilaiHuruf;
            String status;

            if (nilaiAkhir > 80) {
                nilaiHuruf = "A";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 73) {
                nilaiHuruf = "B+";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 65) {
                nilaiHuruf = "B";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 60) {
                nilaiHuruf = "C+";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 50) {
                nilaiHuruf = "C";
                status = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 39) {
                nilaiHuruf = "D";
                status = "ANDA TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                status = "ANDA TIDAK LULUS";
            }

            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println(status);
        }
    }
}
