package P6;

public class Dosen15 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen15(){

    }
    Dosen15(String kd, String name, Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Kode : " + kode);
        System.out.println("Jenis Kelamin Laki-Laki ? " + jenisKelamin);
        System.out.println("Usia : " + usia);
    }
}
