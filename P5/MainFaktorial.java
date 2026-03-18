package P5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        
    Scanner inas = new Scanner(System.in);
    System.out.print("Masukkan nilai : ");
    int nilai = inas.nextInt();

    Faktorial fk = new Faktorial();
    System.out.println("Nilai faktorial " +nilai+ " menggunakan BF : "+fk.faktorialBF(nilai));
    System.out.println("Nilai faktorial " +nilai+ " mengunakan DC : " +fk.faktorialDC(nilai));
    }
}