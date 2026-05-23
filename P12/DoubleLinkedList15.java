package P12;

public class DoubleLinkedList15 {
    Node15 head;
    Node15 tail;
    int size;

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
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        } 
        Node15 deleted = head; 
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus.");
        deleted.data.tampil();
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        } 
        Node15 deleted = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus.");
        deleted.data.tampil();
    }
    public void printReverse(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong");
            return;
        }
        Node15 current = tail;
        System.out.println("=== Menampilkan data secara terbalik ===");
        while (current != null) {
            current.data.tampil();
            System.out.println("--------------------------------------");
            current = current.prev;
        }
    }
    public void add(int index, Mahasiswa15 data){
        if(index < 0 || index > size){
            System.out.println("Index tidak valid");
            return;
        } if(index == 0){
            addFirst(data);
            return;
        } if(index == size){
            addLast(data);
            return;
        }
        Node15 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Node15 newNode15 = new Node15(data);
        current.prev.next = newNode15;
        current.prev = newNode15;

        size++;
    }
     public void removeAfter(String nim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        Node15 current = head;
        while (current != null &&
                !current.data.nim.equals(nim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah data tersebut");
            return;
        }
        Node15 deleted = current.next;
        if (deleted == tail) {
            tail = current;
            tail.next = null;
        } else {
            current.next = deleted.next;
            deleted.next.prev = current;
        }
        System.out.println("Data berhasil dihapus:");
        deleted.data.tampil();

        size--;
    }
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node15 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Data berhasil dihapus:");
        current.data.tampil();

        size--;
    }
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        System.out.println("Data pertama:");
        head.data.tampil();
    }
    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        System.out.println("Data terakhir:");
        tail.data.tampil();
    }
    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }
        Node15 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }
    public int size() {
        return size;
    }
}