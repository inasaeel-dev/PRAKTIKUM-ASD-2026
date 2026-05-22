package P12;

public class DoubleLinkedList15 {
    Node15 head;
    Node15 tail;

    public DoubleLinkedList15(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Mahasiswa15 data){
        Node15 newNode15 = new Node15(data);
        if (isEmpty()){
            head = tail = newNode15;
        } else {
            newNode15.next = head;
            head.prev = newNode15;
            head = newNode15;
        }
    }
    public void addLast(Mahasiswa15 data){
        Node15 newNode15 = new Node15(data);
        if (isEmpty()){
            head = tail = newNode15;
        } else {
            tail.next = newNode15;
            newNode15.prev = tail;
            tail = newNode15;
        }
    }
    public void insertAfter(String keyNim, Mahasiswa15 data) {
        Node15 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node15 newNode03 = new Node15(data);

        if (current == tail) {
            newNode03.prev = current;
            current.next = newNode03;
            tail = newNode03;
        } else {
            newNode03.prev = current;
            newNode03.next = current.next;
            current.next.prev = newNode03;
            current.next = newNode03;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong!");
            return;
        }
        Node15 current = head;
        while ((current != null)) {
            current.data.tampil();
            current = current.next;
        }
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list kosong");
            return;
        }
        Node15 deleted = head;
        if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus");
        deleted.data.tampil();
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list kosong");
            return;
        }
        Node15 deleted = tail;
        if (head == tail){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus");
        deleted.data.tampil();
    }
}