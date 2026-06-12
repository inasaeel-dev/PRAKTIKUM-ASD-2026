package CM_2;

public class LinkedListRekapAntrian15 {
    int jamAntri;
    int jumlah;
    LinkedListRekapAntrian15 next;

    public LinkedListRekapAntrian15(int jamAntri, int jumlah){
        this.jamAntri = jamAntri;
        this.jumlah = 1;
        this.next = null;
    }
    public class rekapJam {
        rekapJam head;

        public void updateRekap(int jam){
            if(head == null){
                head = new rekapJam();
                return;
            }
            rekapJam current = head;
            while (current != null) {
                if(current.jam == jam){ // cari apakah jam sudah ada tapi masih error 
                    current.jumlah++;
                    return;
                }
                if (current.next == null){
                    
                }
            }
        }
    }
}