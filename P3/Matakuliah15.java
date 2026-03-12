package P3;

public class Matakuliah15 {
    public String kode;
    public String nama;
    public int sks;
    public int jmlJam;

    public Matakuliah15 (String kode, String nama, int sks, int jmlJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }

    void tambahData(String kode, String nm, int sks, int jmlJam) {
        kode = kode;
        nama = nm;
        this.sks = sks;
        jmlJam = jmlJam;
    }

    void cetakInfo (){
        System.out.println("Kode    : " + kode);
        System.out.println("Nama    : " + nama);
        System.out.println("SKS     : " + sks);
        System.out.println("Jumlah Jam  : " + jmlJam);
    }
}