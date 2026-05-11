package P11;

import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        SingleLinkedList00 sll = new SingleLinkedList00();
        // int jumlah;

        // System.out.print("Masukkan jumlah mahasiswa : ");
        // jumlah = inas.nextInt();
        // inas.nextLine();

        // for (int i = 0; i < jumlah; i++) {
        //     System.out.println("\nData Mahasiswa ke - " + (i + 1));
        //     System.out.print("NIM   : ");
        //     String nim = inas.nextLine();
        //     System.out.print("Nama  : ");
        //     String nama = inas.nextLine();
        //     System.out.print("Kelas : ");
        //     String kelas = inas.nextLine();
        //     System.out.print("IPK   : ");
        //     double ipk = Double.parseDouble(inas.nextLine());

        //     Mahasiswa00 mhs = new Mahasiswa00(nim, nama, kelas, ipk);
        //     sll.addLast(mhs);
        //     sll.print();
        // }

        Mahasiswa00 mhs1 = new Mahasiswa00("2001", "Alvaro", "TI-1A", 3.5);
        Mahasiswa00 mhs2 = new Mahasiswa00("2002", "Bimon", "TI-1B", 3.6);
        Mahasiswa00 mhs3 = new Mahasiswa00("2003", "Cintia", "TI-1A", 3.7);
        Mahasiswa00 mhs4 = new Mahasiswa00("2004", "Dirga", "TI-1B", 3.8);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.print();
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
