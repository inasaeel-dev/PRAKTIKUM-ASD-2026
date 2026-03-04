package Pertemuan_Minggu_3;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
    Mahasiswa15 [] arrayOfMahasiswa15 = new Mahasiswa15[3];
    arrayOfMahasiswa15 [0] = new Mahasiswa15();
    arrayOfMahasiswa15 [0].nim = "244107060033";
    arrayOfMahasiswa15 [0].nama = "AGNES TITANIA KINANTI";
    arrayOfMahasiswa15 [0].kelas = "SIB - 1E";
    arrayOfMahasiswa15 [0].ipk = (float) 3.75;

    arrayOfMahasiswa15 [1] = new Mahasiswa15();
    arrayOfMahasiswa15 [1].nim = "2341720172";
    arrayOfMahasiswa15 [1].nama = "ACHMAD MAULANA HAMZAH";
    arrayOfMahasiswa15 [1].kelas = "TI - 2A";
    arrayOfMahasiswa15 [1].ipk = (float) 3.36;

    arrayOfMahasiswa15 [2] = new Mahasiswa15();
    arrayOfMahasiswa15 [2].nim = "244107023006";
    arrayOfMahasiswa15 [2].nama = "DIRHAMAWAN PUTRANTO";
    arrayOfMahasiswa15 [2].kelas = "TI - 2E";
    arrayOfMahasiswa15 [2].ipk = (float) 3.80;

    System.out.println("NIM         : "+arrayOfMahasiswa15[0].nim);
    System.out.println("Nama        : "+arrayOfMahasiswa15[0].nama);
    System.out.println("Kelas       : "+arrayOfMahasiswa15[0].kelas);
    System.out.println("IPK         : "+arrayOfMahasiswa15[0].ipk);
    System.out.println("-------------------------------------");
    System.out.println("NIM         : "+arrayOfMahasiswa15[1].nim);
    System.out.println("Nama        : "+arrayOfMahasiswa15[1].nama);
    System.out.println("Kelas       : "+arrayOfMahasiswa15[1].kelas);
    System.out.println("IPK         : "+arrayOfMahasiswa15[1].ipk);
    System.out.println("---------------------------------------");
    System.out.println("NIM         : "+arrayOfMahasiswa15[2].nim);
    System.out.println("Nama        : "+arrayOfMahasiswa15[2].nama);
    System.out.println("Kelas       : "+arrayOfMahasiswa15[2].kelas);
    System.out.println("IPK         :   "+arrayOfMahasiswa15[2].ipk);
    }
}