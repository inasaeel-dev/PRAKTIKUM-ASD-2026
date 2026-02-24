package Pertemuan_Minggu_2;

public class Dosen15 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunGabung;
    String bidangKeahlian;

    public Dosen15() {

    }
    public Dosen15 (String idDosen, String nm, boolean statusAktif, int tahunGabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        nama = nm;
        this.tahunGabung = tahunGabung;
        this.statusAktif = statusAktif;
        this.bidangKeahlian = bidangKeahlian;
    }
    void tampilkanInformasi() {
        System.out.println("ID Dosen    : " + idDosen);
        System.out.println("Nama Dosen  : " + nama);
        if (statusAktif) {
            System.out.println("Status dosen : Aktif");
        } else {
            System.out.println("Status dosen : Tidak aktif");
        }
        System.out.println("Tahun Bergabung : " + tahunGabung);
        System.out.println("Bidah Keahlian  : " + bidangKeahlian);
        System.out.println();
    }
    void setStatusAktif (boolean status) {
        statusAktif = status;
    }
        int hitungMasaKerja(int tahunSkrg) {
        int masaKerja = tahunSkrg - tahunGabung;
        System.out.println("Masa kerja dosen : " + masaKerja + " tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}