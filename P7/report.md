|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020165 |
| Nama |  Inas Asami El Murtadho |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/inasaeel-dev/PRAKTIKUM-ASD-2026/tree/main) |

## Verifikasi Hasil Percobaan 1
```
Masukkan data mahasiswa ke - 1
NIM       : 121
Nama      : inas
Kelas     : 1F
IPK       : 3.4
Masukkan data mahasiswa ke - 2
NIM       : 122
Nama      : sakha
Kelas     : 1A
IPK       : 3.6
Masukkan data mahasiswa ke - 3
NIM       : 123
Nama      : qina
Kelas     : 1C
IPK       : 3.5
Masukkan data mahasiswa ke - 4
NIM       : 124
Nama      : al
Kelas     : 1D
IPK       : 3.2
Masukkan data mahasiswa ke - 5
NIM       : 125
Nama      : anara
Kelas     : 1B
IPK       : 3.7
Nama : inas
NIM : 121
Kelas : 1F
IPK : 3.4
----------------------
Nama : sakha
NIM : 122
Kelas : 1A
IPK : 3.6
----------------------
Nama : qina
NIM : 123
Kelas : 1C
IPK : 3.5
----------------------
Nama : al
NIM : 124
Kelas : 1D
IPK : 3.2
----------------------
Nama : anara
NIM : 125
Kelas : 1B
IPK : 3.7
----------------------
------------------------------------
Pencarian data
------------------------------------
Masukkan ipk mahasiswa yang dicari :
IPK : 3.7
Menggunakan sequential searching
Data mahasiswa dengan IPK : 3.7ditemukan pada indeks4
nim      : 125
nama     : anara
kelas    : 1B
ipk      : 3.7
```

## Pertanyaan Percobaan 1
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
- tampilDataSearch digunakan untuk menampilkan data mahasiswa setelah pencarian nim ditemukan, sedangkan tampilPosisi untuk menampilkan index data dalam array

2. Jelaskan fungsi break pada kode program dibawah ini!
```
if (listMhs[j].ipk == cari){
        posisi = j;
        break;
    }
```
- memberhentikan perulangan ketika data sudah ditemukan

3.  Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
- untuk menyimpan index data yg telah ditemukan jika tidak program tidak dapat menyimpan index data

4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan!
- karena ada break di dalam kode program maka data yg disimpan adalah data yg pertama kali cocok lalu program tidak akan mengecek data yg lain, jika tidak menggunakan break program akan menyimpan data terakhir yg cocok dengan kondisi yg ditentukan

5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
- program akan terus melakukan pengecekan data

## Verifikasi Hasil Percobaan 2
```