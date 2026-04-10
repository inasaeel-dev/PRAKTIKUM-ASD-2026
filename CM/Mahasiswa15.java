package CM;

public class Mahasiswa15 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa15(){

    }
    Mahasiswa15(String nim, String nama, String prodi){
       this.nim = nim;
       this.nama = nama;
       this.prodi = prodi;
    }
    void tampilMahasiswa(){
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}
class buku15 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    buku15(String kodeBuku, String judul, int tahunTerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
    void tampilBuku(){
        System.out.println("Kode Buku     : " + kodeBuku);
        System.out.println("Judul Buku    : " + judul);
        System.out.println("Tahun Terbit  : " + tahunTerbit);
    }
}
class peminjaman15{
    Mahasiswa15 mhs;
    buku15 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat, denda;

    peminjaman15(Mahasiswa15 mhs, buku15 buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }
    void hitungDenda(){
        if(lamaPinjam > batasPinjam){
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 1000;
        }else{
            terlambat = 0;
            denda = 0;
        }
    }
   public void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " + buku.judul +
                " | " + lamaPinjam + " hari | Terlambat: " + terlambat +
                " | Denda: Rp " + denda);
    }
}