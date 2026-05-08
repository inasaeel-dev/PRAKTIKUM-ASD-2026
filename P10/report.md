|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020165 |
| Nama |  Inas Asami El Murtadho |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/inasaeel-dev/PRAKTIKUM-ASD-2026/tree/main) |

## 2.1.2 Verifikasi Hasil Percobaan 1
```
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------------------------
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------------------------
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------------------------
4
Elemen terdepan: 15
Masukkan operasi yang diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------------------------
```

## 2.1.3 Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
> nilai awal atribut front dan rear bernilai -1 karena pada saat queue masih kosong tidak ada elemen di dalamnya. atribut size bernilai 0 karena diawal tidak ada elemen yang dimasukkan ke dalam queue

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```
if (rear == max - 1){
        rear = 0;
```
> untuk menambahkan elemen baru ke dalam queue

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```
if (front == max -1){
         front = 0;
```
> untuk menghapus elemen dari queue atau untuk memindahkan elemen terdepan. jika queue kosong program akan menampilkan pesan bahwa queue kosong dan tidak ada data yang dapat dikeluarkan

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i = front?
> untuk mencetak semua elemen dalam queue perulangan dimulai dari posisi front sampai rear

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
```
i = (i + 1) % max;
```
> untuk mencetak elemen yang berada dalam queue

6. Tunjukkan potongan kode program yang merupakan queue overflow!
```
if (IsFull()) {
    System.out.println("Queue sudah penuh");
}
```

Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
```
if (IsFull()) {
    System.out.println("Queue sudah penuh. Program dihentikan");
    System.exit(0);
}
```

## 2.2.2 Verifikasi Hasil Percobaan 2
```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 2
Melayani mahasiswa : 
123 - Aldi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 5
Jumlah dalam antrian : 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu : 0
Terima kasih
```

## 2.2.3 Pertanyaan
1. Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga method LihatAkhir dapat dipanggil!
```
=== Menu Antrian Layanan Akademik ===
1. Tambah mahasiswa ke antrian
2. Layani mahasiswa
3. Lihat mahasiswa terdepan
4. Lihat semua antrian
5. Jumlah mahasiswa dalam antrian
6. Cek antrian paling belakang
0. Keluar
Pilih menu : 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1F
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah mahasiswa ke antrian
2. Layani mahasiswa
3. Lihat mahasiswa terdepan
4. Lihat semua antrian
5. Jumlah mahasiswa dalam antrian
6. Cek antrian paling belakang
0. Keluar
Pilih menu : 1
NIM   : 124
Nama  : Al
Prodi : SIB
Kelas : 1A
Al berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah mahasiswa ke antrian
2. Layani mahasiswa
3. Lihat mahasiswa terdepan
4. Lihat semua antrian
5. Jumlah mahasiswa dalam antrian
6. Cek antrian paling belakang
0. Keluar
Pilih menu : 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1F
2. 124 - Al - SIB - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah mahasiswa ke antrian
2. Layani mahasiswa
3. Lihat mahasiswa terdepan
4. Lihat semua antrian
5. Jumlah mahasiswa dalam antrian
6. Cek antrian paling belakang
0. Keluar
Pilih menu : 2
Melayani mahasiswa : 123 - Aldi - TI - 1F

=== Menu Antrian Layanan Akademik ===
1. Tambah mahasiswa ke antrian
2. Layani mahasiswa
3. Lihat mahasiswa terdepan
4. Lihat semua antrian
5. Jumlah mahasiswa dalam antrian
6. Cek antrian paling belakang
0. Keluar
Pilih menu : 6
Mahasiswa paling belakang: NIM NAMA PRODI KELAS
124 - Al - SIB - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah mahasiswa ke antrian
2. Layani mahasiswa
3. Lihat mahasiswa terdepan
4. Lihat semua antrian
5. Jumlah mahasiswa dalam antrian
6. Cek antrian paling belakang
0. Keluar
Pilih menu : 0
Terima kasih
```

## 2.3 Tugas
```
=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 1
NIM: 123
Nama: Al
Prodi: SIB
Kelas: 1G
Al berhasil masuk antrian.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 1
NIM: 124
Nama: Jordan
Prodi: TI
Kelas: 1F
Jordan berhasil masuk antrian.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 2
Memanggil antrian untuk proses KRS:
- Al (Selesai KRS)
- Jordan (Selesai KRS)

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 3
Antrian kosong.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 1
NIM: 127
Nama: L
Prodi: TI
Kelas: 1F
L berhasil masuk antrian.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 1
NIM: 126
Nama: Siti
Prodi: TI
Kelas: 1G
Siti berhasil masuk antrian.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 3
Daftar Antrian (Seluruhnya):
127 - L - TI - 1F
126 - Siti - TI - 1G

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 6
--- STATISTIK ---
Jumlah antrian saat ini     : 2
Mahasiswa sudah selesai KRS : 2
Sisa mahasiswa DPA (belum)  : 28

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 5
Antrian Paling Akhir:
126 - Siti - TI - 1G

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 4
2 Antrian Terdepan:
127 - L - TI - 1F
126 - Siti - TI - 1G

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 7
Antrian berhasil dikosongkan.

=== SISTEM ANTRIAN KRS DPA ===
1. Tambah Antrian Mahasiswa
2. Panggil Antrian (2 Mahasiswa)
3. Tampilkan Semua Antrian
4. Tampilkan 2 Terdepan
5. Tampilkan Antrian Terakhir
6. Statistik & Sisa DPA
7. Kosongkan Antrian
0. Keluar
Pilih: 0
```