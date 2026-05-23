package P12;

import java.util.Scanner;

public class DoubleLinkedListMain15 {

     public static Mahasiswa15 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM      : ");
        String nim = scan.nextLine();

        System.out.print("Masukkan Nama     : ");
        String nama = scan.nextLine();

        System.out.print("Masukkan Kelas    : ");
        String kelas = scan.nextLine();

        System.out.print("Masukkan IPK      : ");
        double ipk = Double.parseDouble(scan.nextLine());

        return new Mahasiswa15(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {

        Scanner inas = new Scanner(System.in);
        DoubleLinkedList15 list = new DoubleLinkedList15();
        int pilihan;

        do {
            System.out.println("\n==== MENU DOUBLE LINKED LIST ====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Hapus pada index");
            System.out.println("7. Hapus setelah data tertentu");
            System.out.println("8.Tampilkan data");
            System.out.println("9. Tampilkan data tertentu");
            System.out.println("10. Data pertama");
            System.out.println("11. Data terakhir");
            System.out.println("12. Data pada index");
            System.out.println("13. Jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = inas.nextInt();
            inas.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa15 mhsAwal = inputMahasiswa(inas);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa15 mhsAkhir = inputMahasiswa(inas);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = inas.nextLine();
                    System.out.println("Masukkan data baru : ");
                    Mahasiswa15 dataBaru = inputMahasiswa(inas);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan index yang akan dihapus : ");
                    int hapusIndex = inas.nextInt();
                    list.remove(hapusIndex);
                    break;
                case 7:
                    System.out.print("Masukkan NIM key : ");
                    String nim = inas.nextLine();
                    list.removeAfter(nim);
                    break;
                case 8:
                    list.print();
                    break;
                case 9: 
                    list.printReverse();
                    break;
                case 10:
                    list.getFirst();
                    break;
                case 11:
                    list.getLast();
                    break;
                case 12:
                    System.out.print("Masukkan index : ");
                    int carIndex = inas.nextInt();
                    list.getIndex(carIndex);
                    break;
                case 13: 
                    System.out.println("Jumlah data : " + list.size());
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default :
                System.out.println("Menu tidak valid");
            }
        } while (pilihan != 0);
        inas.close();
    }
}