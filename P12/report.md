|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020165 |
| Nama |  Inas Asami El Murtadho |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/inasaeel-dev/PRAKTIKUM-ASD-2026/tree/main) |

## 12.2.2 Verifikasi Hasil Percobaan 1
```
==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih Menu : 2
Masukkan NIM      : 123005
Masukkan Nama     : Harry
Masukkan Kelas    : 1A
Masukkan IPK      : 3.76

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih Menu : 3
Masukkan NIM yang dicari : 123005
Masukkan data baru : 
Masukkan NIM      : 123010
Masukkan Nama     : Potter
Masukkan Kelas    : 1B
Masukkan IPK      : 3.55
Data berhasil disisipkan setelah NIM 123005

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih Menu : 6
NIM    : 123005
Nama : Harry
Kelas: 1A
IPK  : 3.76
NIM    : 123010
Nama : Potter
Kelas: 1B
IPK  : 3.55
```

## 12.2.3 Pertanyaan
1. Jelaskan perbedaan struktur dan mekanisme traversal antara single linked list dan double linked list!
> single linked list lebih sederhana, sedangkan double linked list lebih fleksibel karena dapat ditelusuri duar arah dan mempermudah operasi insert maupun delete

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!
> next digunakan untuk menyimpan alamat/reference node berikutnya, sedangkan prev untuk menghubungkan node baru dengan node sebelumnya dan mempermudah proses delete

3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!
> konstruktor pada class DoubleLinkedList berfungsi untuk mengatur kondisi awal linked list ketika object pertama kali dibuat, menginisialisasi linked list dalam keadaan kosong dan mengatur nilai awal head & tail

4. Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?
> karena belum ada node pertama maupun terakhir dan mencegah error saat proses traversal maupun manipulasi node

5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!
```
==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih Menu : 6
Linked list masih kosong!
```

6. Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!
```
 ==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih Menu : 7
Linked list masih kosong

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih Menu : 1
Masukkan NIM      : 1234
Masukkan Nama     : inas
Masukkan Kelas    : 1F
Masukkan IPK      : 3.6

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih Menu : 1
Masukkan NIM      : 1235
Masukkan Nama     : el
Masukkan Kelas    : 1A
Masukkan IPK      : 3.4

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih Menu : 2
Masukkan NIM      : 121
Masukkan Nama     : sael
Masukkan Kelas    : 1C
Masukkan IPK      : 3.7

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih Menu : 7
=== Menampilkan data secara terbalik ===
NIM    : 121
Nama : sael
Kelas: 1C
IPK  : 3.7
--------------------------------------
NIM    : 1234
Nama : inas
Kelas: 1F
IPK  : 3.6
--------------------------------------
NIM    : 1235
Nama : el
Kelas: 1A
IPK  : 3.4
--------------------------------------
```

## 12.3.2 Verifikasi Hasil Percobaan 2
```
==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih Menu : 1
Masukkan NIM      : 123005
Masukkan Nama     : Harry
Masukkan Kelas    : 1A
Masukkan IPK      : 3.76

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih Menu : 1
Masukkan NIM      : 123010
Masukkan Nama     : Potter
Masukkan Kelas    : 1B
Masukkan IPK      : 3.55

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih Menu : 5
Data berhasil dihapus
NIM    : 123005
Nama : Harry
Kelas: 1A
IPK  : 3.76

==== MENU DOUBLE LINKED LIST ====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih Menu : 6
NIM    : 123010
Nama : Potter
Kelas: 1B
```

## 12.3.3 Pertanyaan
1. Perhatikan potongan kode berikut pada method removeFirst():
```
head = head.next;
head.prev = null;
```
Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!
> head = head.next; berfungsi untuk menggeser head ke node berikutnya 
> head.prev = null; digunakan untuk memutus hubungan antara head baru dengan node yang dihapus, sehingga head tidak memiliki referensi ko node sebelumnya

2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!
```
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
```

## 12.5 Tugas Praktikum
1. Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks tertentu!
```
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
```

2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data key tertentu!
```
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
```

3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu!
```
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
```

4. Tambahkan method:
    a. getFirst()
    b. getLast()
    c. getIndex()
```
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
```

5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List.
```
public int size() {
        return size;
    }
```