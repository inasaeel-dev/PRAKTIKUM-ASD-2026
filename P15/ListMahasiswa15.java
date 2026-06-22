package P15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import P5.Mahasiswa;

public class ListMahasiswa15 {
    List<Mahasiswa15> mahasiswas = new ArrayList<>();
    public void tambah(Mahasiswa15...mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa15 mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(" " + mhs.toString());
        });
    }
    public int binarySearch(String nim) {
        Collections.sort(mahasiswas, (a, b) -> a.nim.compareTo(b.nim));
        return Collections.binarySearch(mahasiswas, 
            new Mahasiswa15(nim, "", ""),
            (a, b) -> a.nim.compareTo(b.nim)
        );
    }
    public void sortAsc() {
        Collections.sort(mahasiswas, (a, b) -> a.nim.compareTo(b.nim));
    }
    public void sortDesc() {
        Collections.sort(mahasiswas, (a, b) -> b.nim.compareTo(a.nim));
    }
    public static void main(String[] args) {
        
    ListMahasiswa15 lm = new ListMahasiswa15();
    Mahasiswa15 m = new Mahasiswa15("201234", "Noureen", "021xx1");
    Mahasiswa15 m1 = new Mahasiswa15("201235", "Akhleema", "021xx2");
    Mahasiswa15 m2 = new Mahasiswa15("201236", "Shannum", "021xx3");

    lm.tambah(m, m1, m2);
    lm.tampil();
    lm.update(lm.binarySearch("201235"), new Mahasiswa15("201235", "Akhleema Lela", "021xx2"));
    System.out.println();
    lm.tampil();
    }
}