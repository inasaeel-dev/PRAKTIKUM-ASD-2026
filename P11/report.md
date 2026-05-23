|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020165 |
| Nama |  Inas Asami El Murtadho |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/inasaeel-dev/PRAKTIKUM-ASD-2026/tree/main) |

## 2.1.1 Verifikasi Hasil Percobaan
```
Linked List Kosong
Isi Linked List:
Dirga   2004    TI-1B   3.8

Isi Linked List:
Dirga   2004    TI-1B   3.8
Alvaro  2001    TI-1A   3.5

Isi Linked List:
Dirga   2004    TI-1B   3.8
Alvaro  2001    TI-1A   3.5

Isi Linked List:
Dirga   2004    TI-1B   3.8
Alvaro  2001    TI-1A   3.5
Bimon   2002    TI-1B   3.6
```

## 2.1.2 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
> karena saat pada saat pemanggilan method sll.print(); objek masih belum memiliki data

2. Jelaskan kegunaan variable temp secara umum pada setiap method!
> variabel temp digunakan sebagai pointer sementara untuk menelusuri node pada linked list tanpa mengubah head

3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
```
Masukkan jumlah mahasiswa : 2

Data Mahasiswa ke - 1
NIM   : 123
Nama  : Bimo
Kelas : 1F
IPK   : 3.4
Isi Linked List:
Bimo    123     1F      3.4


Data Mahasiswa ke - 2
NIM   : 124
Nama  : Permata
Kelas : 1D
IPK   : 3.6
Isi Linked List:
Bimo    123     1F      3.4
Permata 124     1D      3.6
```

## 2.2.2 Verifikasi Hasil Percobaan
```
data index 1 : 
Cintia  22212202        3C      3.5
data mahasiswa an Bimon berada pada index : 2

Isi Linked List:
Isi Linked List : 
Cintia  22212202        3C      3.5
Bimon   23212201        2B      3.8

Isi Linked List : 
Bimon   23212201        2B      3.8
```

## 2.2.3 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
> untuk menghentikan proses perulangan setelah data yang dicari berhasil ditemukan dan dihapus

2. Jelaskan kegunaan kode dibawah pada method remove
```
temp.next = temp.next.next; 
        if (temp.next == null) {
            tail = temp; 
        }
```
> temp.next = temp.next.next; untuk melewati node yang akan dihapus
> tail = temp untuk memperbarui node terakhir jika node yang dihapus adalah tail

## Tugas 
Verifikasi hasil : 
```
=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggiil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 1
Zayn sudah masuk ke antrian
Martin sudah masuk ke antrian
Ujin sudah masuk ke antrian

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggiil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 4
Jumlah mahasiswa dalam antrian : 3
Daftar Antrian : 
127001  Zayn    1D
127002  Martin  1C
127003  Ujin    1B

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggiil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 2
Memanggil antrian : 
127001  Zayn    1D

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggiil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 3
Antrian terdepan : 
127002  Martin  1C
Antrian paling akhir : 
127003  Ujin    1B

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggiil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 5
Antrian berhasil dikosongkan
Jumlah mahasiswa dalam antrian : 0

=== Menu Antrian Kemahasiswaan ===
1. Tambah Antrian
2. Panggiil Antrian
3. Lihat Antrian
4. Jumlah Antrian
5. Kosongkan Antrian
0. Keluar
Pilih menu : 0
Program selesai
```