package Pertemuan_Minggu_2;

public class MataKuliahMain15 {
    public static void main(String[] args) {
        MataKuliah15 matkul1 = new MataKuliah15();
        matkul1.kodeMK = "254107";
        matkul1.nama = "Desain Antarmuka";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(1);
        matkul1.kurangiJam(3);
        matkul1.tampilkanInformasi();

        MataKuliah15 matkul2 = new MataKuliah15("20165", "Sistem Operasi", 4, 8);
        matkul2.kurangiJam(2);
        matkul2.tampilkanInformasi();

        MataKuliah15 matkul3 = new MataKuliah15("1307", "Basis Data", 3, 9);
        matkul3.kurangiJam(4);
        matkul3.tampilkanInformasi();
    }
}