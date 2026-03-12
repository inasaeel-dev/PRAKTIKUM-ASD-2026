package P2;

public class DosenMain15 {
    public static void main(String[] args) {
        Dosen15 dsn1 = new Dosen15();
        dsn1.idDosen = "2541070";
        dsn1.nama = "Bu Latte";
        dsn1.statusAktif = false;
        dsn1.tahunGabung = 2021;
        dsn1.bidangKeahlian = "Biologi";

        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(true);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("Biologi Murni");
        dsn1.tampilkanInformasi();

        Dosen15 dsn2 = new Dosen15("254321", "Pak Cookies", true, 2023, "Fisika");
        dsn2.tampilkanInformasi();
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Kimia");

        Dosen15 dsn3 = new Dosen15("2541102", "Pak Joko", false, 2024, "Sejarah");
        dsn3.tampilkanInformasi();
        dsn3.setStatusAktif(true);
        dsn3.hitungMasaKerja(2025);
    }
}