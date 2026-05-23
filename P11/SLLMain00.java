package P11;

import java.util.Scanner;

public class SLLMain00 {
    public static void main(String[] args) {
        Scanner inas = new Scanner(System.in);
        SingleLinkedList00 sll = new SingleLinkedList00();
        int jumlah;

    Mahasiswa00 mhs1 = new Mahasiswa00("24212200", "Alvaro", "1A", 4.0);
    Mahasiswa00 mhs2 = new Mahasiswa00("23212201", "Bimon", "2B", 3.8);
    Mahasiswa00 mhs3 = new Mahasiswa00("22212202", "Cintia", "3C", 3.5);
    Mahasiswa00 mhs4 = new Mahasiswa00("21212203", "Dirga", "4D", 3.6);

    sll.addLast(mhs1); 
    sll.addLast(mhs3); 
    sll.addLast(mhs2); 
    sll.addLast(mhs4); 


    System.out.println("data index 1 : ");
    sll.getData(1); 
    System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
    System.out.println();
    sll.removeFirst(); 
    sll.removeLast();  
    System.out.println("Isi Linked List:");
    sll.print();     
    sll.removeAt(0);  
    sll.print();    
    }
}