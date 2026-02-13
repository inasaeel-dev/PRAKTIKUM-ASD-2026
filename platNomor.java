import java.util.Scanner;

public class platNomor {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);

        String [] kode = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String [] kota = {
           "BANTEN", 
           "JAKARTA", 
           "BANDUNG", 
           "CIREBON", 
           "BOGOR", 
           "PEKALONGAN", 
           "SEMARANG", 
           "SURABAYA", 
           "MALANG", 
           "TEGAL"
        };
        System.out.print("Masukkan kode plat: ");
        String plat = inas.next().toUpperCase();

        for (int i = 0; i < kode.length; i++) {
                if (plat.equals(kode[i])) {
                    System.out.println(kota[i]);
                }
            
        }
        inas.close();
    }
}
