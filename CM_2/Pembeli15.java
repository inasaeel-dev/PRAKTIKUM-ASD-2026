package CM_2;

public class Pembeli15 {
    int noAntrian;
    String namaPembeli;
    String noHp;

    public Pembeli15(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }
    public void tampil(){
        System.out.println(noAntrian + "\t\t" + namaPembeli + "\t\t" + noHp);
    }
}