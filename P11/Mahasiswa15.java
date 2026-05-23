package P11;

public class Mahasiswa15 {
    String nama, nim, kelas;

    public Mahasiswa15(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    public void tampilkanInformasi(){
        System.out.println(nim + "\t" + nama + "\t" + kelas);
    }
}
