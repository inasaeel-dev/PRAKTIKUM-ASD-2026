package P2.Kuis;

public class kendaraan15 {
    String nomorPlat;
    double jarakTempuh;
    double konsumsiBahanBakar; 
    double efisiensiBBM;

    public kendaraan15 () {

    }
    public kendaraan15 (String nomorPlat, double jarakTempuh, double konsumsiBahanBakar, double efisiensiBBM){
        this.nomorPlat = nomorPlat;
        jarakTempuh = jarakTempuh;
        konsumsiBahanBakar = konsumsiBahanBakar;
        efisiensiBBM = efisiensiBBM;
    }
    void printData () { //method atau fungsi
        System.out.println("Nomor Plat                      : " +nomorPlat);
        System.out.println("Jarak Tempuh                    : " +jarakTempuh);
        System.out.println("Jumlah Konsumsi Bahan Bakar   : " +konsumsiBahanBakar);

    }
}
