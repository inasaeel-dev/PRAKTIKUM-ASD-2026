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
Masukkan data mahasiswa ke - 1
NIM       : 123
Nama      : asd
Kelas     : 1e
IPK       : 3.4
Masukkan data mahasiswa ke - 2
NIM       : 132
Nama      : qwe
Kelas     : 1b
IPK       : 3.6
Masukkan data mahasiswa ke - 3
NIM       : 134
Nama      : zxc
Kelas     : 1f
IPK       : 3.2
Masukkan data mahasiswa ke - 4
NIM       : 124
Nama      : sdf
Kelas     : 1c
IPK       : 3.1
Masukkan data mahasiswa ke - 5
NIM       : 145
Nama      : wer
Kelas     : 1d
IPK       : 3.5
Nama : asd
NIM : 123
Kelas : 1e
IPK : 3.4
----------------------------
Nama : qwe
NIM : 132
Kelas : 1b
IPK : 3.6
----------------------------
Nama : zxc
NIM : 134
Kelas : 1f
IPK : 3.2
----------------------------
Nama : sdf
NIM : 124
Kelas : 1c
IPK : 3.1
----------------------------
Nama : wer
NIM : 145
Kelas : 1d
IPK : 3.5
----------------------------
------------------------------------
Pencarian data
------------------------------------
Masukkan ipk mahasiswa yang dicari :
IPK : 3.4
------------------------------------
Menggunakan binary search
------------------------------------
data 3.4 tidak ditemukan
Data mahasiswa dengan IPK 3.4 tidak ditemukan
PS D:\Praktikum ASD> ^C
PS D:\Praktikum ASD> 
PS D:\Praktikum ASD>  d:; cd 'd:\Praktikum ASD'; & 'C:\Program Files\Java\jdk-24\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\UsEr\AppData\Roaming\Code\User\workspaceStorage\49ffb8b851824148d63f7d62e2dec0ac\redhat.java\jdt_ws\Praktikum ASD_ede3babb\bin' 'P7.MahasiswaDemo15' 
Masukkan data mahasiswa ke - 1
NIM       : 123
Nama      : qwe
Kelas     : 1f
IPK       : 3.2
Masukkan data mahasiswa ke - 2
NIM       : 124
Nama      : asd
Kelas     : 1b
IPK       : 3.4
Masukkan data mahasiswa ke - 3
NIM       : 126
Nama      : zxc
Kelas     : 1c
IPK       : 3.6
Masukkan data mahasiswa ke - 4
NIM       : 125
Nama      : rew
Kelas     : 1d
IPK       : 3.5
Masukkan data mahasiswa ke - 5
NIM       : 128
Nama      : rex
Kelas     : 1G
IPK       : 3.8
Nama : qwe
NIM : 123
Kelas : 1f
IPK : 3.2
----------------------------
Nama : asd
NIM : 124
Kelas : 1b
IPK : 3.4
----------------------------
Nama : zxc
NIM : 126
Kelas : 1c
IPK : 3.6
----------------------------
Nama : rew
NIM : 125
Kelas : 1d
IPK : 3.5
----------------------------
Nama : rex
NIM : 128
Kelas : 1G
IPK : 3.8
----------------------------
------------------------------------
Pencarian data
------------------------------------
Masukkan ipk mahasiswa yang dicari :
IPK : 3.8
------------------------------------
Menggunakan binary search
------------------------------------
Data mahasiswa dengan IPK : 3.8 ditemukan pada indeks 4
nim      : 128
nama     : rex
kelas    : 1G
ipk      : 3.8
```

## Pertanyan Percobaan 2
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
```
 mid = (left + right)/2;
 ```

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
```
return findBinarySearch(cari, left, mid -1);
return findBinarySearch(cari, mid +1, right);
```

3. Apa fungsi left, right, dan mid?
- left menunjukkan index paling kiri, right menunjukkan index paling kanan dalam array dan mid menunjukkan index tengah dalam array

4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?
- program akan tetap berjalan tetapi outputnya tidak dapat memastikan mana yg lebih kecil atau besar

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
- mengganti simbol > menjadi < karena pencarian dilakukan secara ascending

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
- Binary search menyatakan data tidak ditemukan ketika batas pencarian sudah tidak valid (low > high) karena seluruh bagian array yang mungkin telah diperiksa namun tidak ditemukan nilai yang sesuai

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
```
 System.out.print("Masukkan jumlah mahasiswa : ");
    int n = inas.nextInt();
    System.out.println();

    MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15(n);
```