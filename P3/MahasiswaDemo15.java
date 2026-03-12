package P3;

import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
    Scanner inas15 = new Scanner(System.in);
    Mahasiswa15 [] arrayOfMahasiswa15 = new Mahasiswa15[3];
    String dummy;

    for (int i = 0; i < 3; i++) {
        arrayOfMahasiswa15 [i] = new Mahasiswa15();

        System.out.println("Masukkan Data Mahasiswa ke - " + (i + 1));
        System.out.print("NIM   : ");
        arrayOfMahasiswa15 [i].nim = inas15.nextLine();
        System.out.print("Nama  : ");
        arrayOfMahasiswa15 [i].nama = inas15.nextLine();
        System.out.print("Kelas : ");
        arrayOfMahasiswa15 [i].kelas = inas15.nextLine();
        System.out.print("IPK   : ");
        dummy = inas15.nextLine();
        arrayOfMahasiswa15 [i].ipk = Float.parseFloat(dummy);
        System.out.println("------------------------------");

        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke - " + (i + 1));
            arrayOfMahasiswa15[i].cetakInfo();
            
            System.out.println("NIM           : " + arrayOfMahasiswa15[i].nim);
            System.out.println("Nama          : " + arrayOfMahasiswa15[i].nama);
            System.out.println("Kelas         : " + arrayOfMahasiswa15[i].kelas);
            System.out.println("IPK           : " + arrayOfMahasiswa15[i].ipk);
            System.out.println("-----------------------------");
        }
    }
}