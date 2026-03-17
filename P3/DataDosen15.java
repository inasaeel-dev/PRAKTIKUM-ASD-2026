package P3;

public class DataDosen15 {
    
    void dataSemuaDosen (Dosen15 [] arrayDosen15) {
        int n = 1;
        for (Dosen15 dosen15 : arrayDosen15) {
            System.out.println("Data Dosen ke - " + n++);
            System.out.println("Kode        : " + dosen15.kode);
            System.out.println("Nama        : " + dosen15.nama);
            System.out.println("Jenis Kelamin   : " + dosen15.jenisKelamin);
            System.out.println("Usia        : " + dosen15.usia);
            System.out.println("------------------------------------");
        }
    }
    void jmlDosenPerJenisKelamin (Dosen15[]arrayDosen15) {
        int LK = 0;
        int perempuan = 0;

        for (Dosen15 dosen15 : arrayDosen15) {
            if (dosen15.jenisKelamin) {
                perempuan++;
            } else {
                LK++;
            }
        }
        System.out.println("Jumlah Dosen Perempuan  :" + perempuan);
        System.out.println("Jumlah Dosen Laki-laki  : " + LK);
    }
    void rataUsiaDosenPerjenisKelamin (Dosen15 [] arrayDosen15) {
        int totalLK = 0, totalPerempuan = 0, LK = 0, perempuan = 0;

        for (Dosen15 dosen15 : arrayDosen15) {
            if (dosen15.jenisKelamin) {
                totalPerempuan += dosen15.usia;
                perempuan++;
            } else {
                totalLK += dosen15.usia;
                LK++;
            }
        }
        System.out.println("Rata-rata usia dosen perempuan      : " + totalPerempuan/perempuan);
        System.out.println("Rata-rata usia dosen laki-laki      : " + totalLK/LK);
    }
    void dosenTertua (Dosen15 [] arrayDosen15) {
        Dosen15 tertua = arrayDosen15[0];

        for (Dosen15 dosen15 : arrayDosen15) {
            if (dosen15.usia > tertua.usia) {
                tertua = dosen15;
            }
        }
        System.out.println("Dosen paling tua    : ");
        System.out.println("Kode                  : " + tertua.kode);
        System.out.println("Nama                  : " + tertua.nama);
        System.out.println("Usia                  : " + tertua.usia);
    }
    void dosenTermuda (Dosen15[] arrayDosen15) {
        Dosen15 termuda = arrayDosen15[0];

        for (Dosen15 dosen15 : arrayDosen15) {
            if (dosen15.usia > termuda.usia) {
                termuda = dosen15;
            }
        }
        System.out.println("Dosen paling muda     : ");
        System.out.println("Kode                    : " + termuda.kode);
        System.out.println("Nama                    : " + termuda.nama);
        System.out.println("Usia                    : " + termuda.usia);
    }
}