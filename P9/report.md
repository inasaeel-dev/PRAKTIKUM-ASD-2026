|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020165 |
| Nama |  Inas Asami El Murtadho |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/inasaeel-dev/PRAKTIKUM-ASD-2026/tree/main) |

## 2.1.1 Praktikum 1
```
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama  : nana
NIM   : 254
Kelas : 1D
Tugas nana berhasil dikumpulkan
 
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama  : dudut
NIM   : 255
Kelas : 1C
Tugas dudut berhasil dikumpulkan
 
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh dudut

Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama  : nasywa
NIM   : 256
Kelas : 1F
Tugas nasywa berhasil dikumpulkan
 
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
nana    254     1D
dudut   255     1C
nasywa  256     1F
 

Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 
```

## 2.1.3 Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
```
for (int i = 0; i >= top; i++)
```

2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!
> ada 5 data yg ditampung
```
StackTugasMahasiswa15 stack = new StackTugasMahasiswa15(5);
```

3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?
> !isFull() diperlukan agar push dilakukan saat stack belum penuh. jika kondisi if-else dihapus program akan crash

4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga
pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi
lihat tugas terbawah!
```
public Mahasiswa15 peekBottom(){
        if (!isEmpty()){
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
```
```
case 5:
    Mahasiswa15 m = stack.peekBottom();
        if (m != null){
        System.out.println("Tugas pertama dikumpulkan oleh "+ m.nama);
        }
    break;
```
verifikasi hasil:
```
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama  : Dila
NIM   : 1001
Kelas : 1F
Tugas Dila berhasil dikumpulkan
 
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama  : Erik
NIM   : 1002
Kelas : 1F
Tugas Erik berhasil dikumpulkan
 
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama  : Tika
NIM   : 1003
Kelas : 1F
Tugas Tika berhasil dikumpulkan
 
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh Tika

Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 5
Tugas pertama dikumpulkan oleh Dila
```

5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!
```
public int count(){
        return top + 1;
    }
```
verifikasi hasil:
```
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas yang Terkumpul
Pilih: 1
Nama  : Dila
NIM   : 1001
Kelas : 1D
Tugas Dila berhasil dikumpulkan
 
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas yang Terkumpul
Pilih: 1
Nama  : Erik
NIM   : 1002
Kelas : 1F
Tugas Erik berhasil dikumpulkan
 
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas yang Terkumpul
Pilih: 6
Jumlah tugas yg sudah terkumpul : 2
```

## 2.2 Percobaan 2
```
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas yang Terkumpul
Pilih: 1
Nama  : Tika
NIM   : 1002
Kelas : 1D
Tugas Tika berhasil dikumpulkan
 
Menu: 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas yang Terkumpul
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai tugas Tika adalah 87
Nilai biner tugas : 1010111
```

## 2.2.3 Pertanyaan
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
>konversiDesimalKeBiner bekerja dengan cara membagi bilangan desimal berulang dengan 2 dan menyimpan sisa pembagian ke dalam stack

2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
> error, karena variabel kode tidak pernah di deklarasikan

## 2.4 Latihan Praktikum
```
Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 1
ID Surat: 1001
Nama: inas
Kelas: 1F
Jenis Izin (S/I): i
Durasi: 1

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 1
ID Surat: 1002
Nama: ntip
Kelas: 1F
Jenis Izin (S/I): i
Durasi: 1

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 1
ID Surat: 1003
Nama: ndut
Kelas: 1D
Jenis Izin (S/I): i
Durasi: 1

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 2
Verifikasi Surat 
ID Surat        Nama    Kelas   Jenis Izin      Durasi 
1001            inas    1F      i               1
1002            ntip    1F      i               1
1003            ndut    1D      i               1
 

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 3
Surat terakhir di input pada mahasiswa  ndut

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 4
Cari nama: inas
Surat ditemukan!

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 4   
Cari nama: ntip
Surat ditemukan!

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 5
Pilihan Tidak Valid!
```