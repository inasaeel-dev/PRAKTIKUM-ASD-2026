package CM_2;

public class DLLPembeli15 {
    NodePembeli15 head;
    NodePembeli15 tail;
    int nomorAntrian = 1;

    public DLLPembeli15() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void tambahAntrian(Pembeli15 data){
        NodePembeli15 newNode = new NodePembeli15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void cetakAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        NodePembeli15 current = head;
        System.out.println("=============================================");
        System.out.println("\tDaftar Antrian Pembeli");
        System.out.println("=============================================");
        System.out.println("No Antrian\tNama \t\tNo HP");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    public Pembeli15 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }
        Pembeli15 deleted = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return deleted;
    }
}