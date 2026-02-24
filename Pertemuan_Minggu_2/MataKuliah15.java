package Pertemuan_Minggu_2;

public class MataKuliah15 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah15() {

    }

    public MataKuliah15 (String kodeMK, String nm, int sks, int jmlJam) {
        this.kodeMK = kodeMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }
    void tampilkanInformasi () {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }
    void ubahSKS (int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS te;ah berhasil diubah!");
    }
    void tambahJam (int jam) {
        jumlahJam += jam;
    }
    void kurangiJam (int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berkurang menjadi " + jumlahJam);
        } else {
            System.out.println("Jumlah jam tidak cukup untuk dikurangi! ");
        }
    }
}
