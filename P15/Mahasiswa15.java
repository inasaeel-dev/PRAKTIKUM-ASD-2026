package P15;

public class Mahasiswa15 {
    String nim;
    String nama;
    String noTelp;

    public Mahasiswa15(){

    }
    public Mahasiswa15(String nim, String nama, String noTelp){
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }
    @Override
    public String toString(){
        return "Mahasiswa{" + "nim = " + nim + ", nama = " + nama + ", notelp = " + noTelp + '}';
    }
}
