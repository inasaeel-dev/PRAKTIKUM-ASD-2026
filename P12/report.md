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

6. Modifikasi kode program dengan menambahkan method printReverse() untuk
menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!