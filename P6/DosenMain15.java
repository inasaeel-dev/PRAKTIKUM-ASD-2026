package P6;

import java.util.Scanner;

public class DosenMain15 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        DataDosen15 list = new DataDosen15();
        int pilihMenu;

        do {
            System.out.println("\n === MENU === ");
            System.out.println("1. Tambah Data ");
            System.out.println("2. Tampil Data ");
            System.out.println("3. Sorting ASC ");
            System.out.println("4. Sorting DSC ");
            System.out.println("5. Insertion Sort ");
            System.out.println("0. Keluar ");
            System.out.println();
            System.out.print("Pilih : ");
            pilihMenu = inas.nextInt();
            inas.nextLine();

            if (pilihMenu == 1) {
                System.out.print("Nama : ");
                String nama = inas.nextLine();

                System.out.print("Kode : ");
                String kd = inas.nextLine();

                System.out.print("Jenis Kelamin Laki-Laki ? (Y/N) : ");
                char jkInput = inas.next().charAt(0);
                boolean jk = (jkInput == 'Y' || jkInput == 'y');

                System.out.print("Usia : ");
                int usia = inas.nextInt();
                inas.nextLine();

                Dosen15 d = new Dosen15(kd, nama, jk, usia);
                list.tambah(d);
            } else if (pilihMenu == 2){
                list.tampil();
            } else if (pilihMenu == 3){
                System.out.println("Data diurutkan ASC ");
                list.sortingASC();
                list.tampil();
            } else if (pilihMenu == 4){
                System.out.println("Data diurutkan DSC ");
                list.SortingDSC();
                list.tampil();
            } else if (pilihMenu == 5){
                System.out.println("Data diurutkan Insertion ");
                list.insertionSort();
                list.tampil();
            } else if (pilihMenu == 0){
                System.out.println("Keluar program !");
            } else {
                System.out.println("Pilihan tidak valid !");
            }
        } while (pilihMenu != 0);
    }
}
