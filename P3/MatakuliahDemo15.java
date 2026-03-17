package P3;

import java.util.Scanner;

public class MatakuliahDemo15 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jmlData = inas.nextInt();
        inas.nextLine();
        Matakuliah15 [] arrayOfMatakuliah15 = new Matakuliah15[jmlData];
        String kode, nama, dummy;
        int sks, jmlJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke - " + (i + 1));
            System.out.print("Kode          : ");
            kode = inas.nextLine();
            System.out.print("Nama          : ");
            nama = inas.nextLine();
            System.out.print("SKS           : ");
            dummy = inas.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = inas.nextLine();
            jmlJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            // arrayOfMatakuliah15 [i] = new Matakuliah15();
            arrayOfMatakuliah15[i].tambahData (kode, nama, sks, jmlJam);

        }
         for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke - " + (i + 1));
            arrayOfMatakuliah15[i].cetakInfo();
            System.out.println("---------------------------------");
            }
        }
    }