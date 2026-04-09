|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020165 |
| Nama |  Inas Asami El Murtadho |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/inasaeel-dev/PRAKTIKUM-ASD-2026/tree/main) |

## 5.2.2 Verifikasi Hasil Percobaan 1
Verifikasi Hasil Percobaan A :
```
Data awal 1 
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20
```
Hasil Percobaan B :
```
Data awal 2
30 20 2 8 14
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 8 14 20 30
```
Hasil Percobaan C :
```
Data awal 3
40 10 4 9 3
Data sudah diurutkan dengan BUBBLE SORT (ASC)
3 4 9 10 40
```

## Pertanyaan Praktikum 1
1. Jelaskan fungsi kode program berikut : 
```
if (data[j - 1] > data[j]){
temp = data[j];
data[j] = data[j - 1];
data[j - 1] = temp;
}
```
- Berfungsi untuk menukar dua elemen agar urut dari kecil ke besar (ASC)

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
```
if (data[j] < data[min]){
    min = j;
}
```

3. Pada Insertion sort, jelaskan maksud dari kondisi perulangan 
```
while (j >= 0 && data[j] > temp)
```
- Perulangan ini digunakan untuk mencari posisi yg tepat untuk menyisipkan nilai dengan cara menggeser elemen yg lebih besar dan index elemen masih di dalam batas index array

4. Pada Insertion sort, apakah tujuan dari perintah 
```
data[j +1] = data[j];
```
- Untuk menggeser elemen ke kanan agar elemen yg lebih kecil dapat posisi urutan yg benar

## 5.3.1 Verifikasi Hasil Percobaan 2
```
Data mahasiswa sebelum sorting : 
Nama : Zidan
NIM : 123
Kelas : 2A
IPK : 3.2
-------------------------
Nama : Ayu
NIM : 124
Kelas : 2A
IPK : 3.5
-------------------------
Nama : Sofi
NIM : 125
Kelas : 2A
IPK : 3.1
-------------------------
Nama : Sita
NIM : 126
Kelas : 2A
IPK : 3.9
-------------------------
Nama : Miki
NIM : 127
Kelas : 2A
IPK : 3.7
-------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama : Sita
NIM : 126
Kelas : 2A
IPK : 3.9
-------------------------
Nama : Miki
NIM : 127
Kelas : 2A
IPK : 3.7
-------------------------
Nama : Ayu
NIM : 124
Kelas : 2A
IPK : 3.5
-------------------------
Nama : Zidan
NIM : 123
Kelas : 2A
IPK : 3.2
-------------------------
Nama : Sofi
NIM : 125
Kelas : 2A
IPK : 3.1
-------------------------
```

## Pertanyaan Praktikum 2
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini :
```
for (int i = 0; i < listMhs.length -1; i++) {
        for (int j = 1; j < listMhs.length -i; j++){
```
a. Mengapa syarat dari perulangan i adalah i < listMhs.length-1 ?
- Syarat tersebut digunakan untuk menempatkan elemen terkecil ke posisi paling akhir setiap iterasi
b. Mengapa syarat dari perulangan j adalah j < listMhs.length-i ?
- Untuk menghindari membandingkan elemen yg sudah berada di posisi yg tepat
c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
- Perulangan i dan tahap bubble sort dilakukan sebanyak 49x

2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!
```
Masukkan jumlah mahasiswa : 2

Nama  : El
NIM   : 127
Kelas : 1F
IPK   : 3.6
-------------------------
Nama  : Sakha
NIM   : 142
Kelas : 1A
IPK   : 3.8
-------------------------
Data mahasiswa sebelum sorting :
Nama    : El
NIM     : 127
Kelas   : 1F
IPK     : 3.6
----------------------
Nama    : Sakha
NIM     : 142
Kelas   : 1A
IPK     : 3.8
----------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :       
Nama    : Sakha
NIM     : 142
Kelas   : 1A
IPK     : 3.8
----------------------
Nama    : El
NIM     : 127
Kelas   : 1F
IPK     : 3.6
----------------------
```

## Verifikasi Hasil Percobaan 3
```
Masukkan jumlah mahasiswa : 5

Nama  : Ali
NIM   : 123
Kelas : 2B
IPK   : 3.9
-------------------------
Nama  : Ila
NIM   : 124
Kelas : 2B
IPK   : 3.1
-------------------------
Nama  : Agus
NIM   : 125
Kelas : 2B
IPK   : 3.6
-------------------------
Nama  : Tika
NIM   : 126
Kelas : 2B
IPK   : 3.3
-------------------------
Nama  : Udin
NIM   : 127
Kelas : 2B
IPK   : 3.2
-------------------------
Data mahasiswa sebelum sorting :
Nama    : Ali
NIM     : 123
Kelas   : 2B
IPK     : 3.9
----------------------
Nama    : Ila
NIM     : 124
Kelas   : 2B
IPK     : 3.1
----------------------
Nama    : Agus
NIM     : 125
Kelas   : 2B
IPK     : 3.6
----------------------
Nama    : Tika
NIM     : 126
Kelas   : 2B
IPK     : 3.3
----------------------
Nama    : Udin
NIM     : 127
Kelas   : 2B
IPK     : 3.2
----------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :

Nama    : Ali
NIM     : 123
Kelas   : 2B
IPK     : 3.9
----------------------
Nama    : Agus
NIM     : 125
Kelas   : 2B
IPK     : 3.6
----------------------
Nama    : Tika
NIM     : 126
Kelas   : 2B
IPK     : 3.3
----------------------
Nama    : Udin
NIM     : 127
Kelas   : 2B
IPK     : 3.2
----------------------
Nama    : Ila
NIM     : 124
Kelas   : 2B
IPK     : 3.1
----------------------
```

## Pertanyaan Praktikum 3
1. Di dalam method selection sort, terdapat baris program
```
int idxMin = i;
    for (int j = i + 1; j < listMhs.length; j++) {
        if (listMhs[j].ipk < listMhs[idxMin].ipk){
            idxMin = j;
        }
    }
```
Untuk apakah proses tersebut, jelaskan!
- Untuk mencari posisi indeks elemen dengan nilai IPK terkecil pada bagian array yg belum berurutan

## Verfikasi Hasil Percobaan 4
```
Masukkan jumlah mahasiswa : 5

Nama  : Ayu
NIM   : 111
Kelas : 2C
IPK   : 3.7
-------------------------
Nama  : Dika
NIM   : 222
Kelas : 2C
IPK   : 3.0
-------------------------
Nama  : Ila
NIM   : 333
Kelas : 2C
IPK   : 3.8
-------------------------
Nama  : Susi
NIM   : 444
Kelas : 2C
IPK   : 3.1
-------------------------
Nama  : Yayuk
NIM   : 555
Kelas : 2C
IPK   : 3.4
-------------------------
Data mahasiswa sebelum sorting :
Nama    : Ayu
NIM     : 111
Kelas   : 2C
IPK     : 3.7
----------------------
Nama    : Dika
NIM     : 222
Kelas   : 2C
IPK     : 3.0
----------------------
Nama    : Ila
NIM     : 333
Kelas   : 2C
IPK     : 3.8
----------------------
Nama    : Susi
NIM     : 444
Kelas   : 2C
IPK     : 3.1
----------------------
Nama    : Yayuk
NIM     : 555
Kelas   : 2C
IPK     : 3.4
----------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama    : Ila
NIM     : 333
Kelas   : 2C
IPK     : 3.8
----------------------
Nama    : Ayu
NIM     : 111
Kelas   : 2C
IPK     : 3.7
----------------------
Nama    : Yayuk
NIM     : 555
Kelas   : 2C
IPK     : 3.4
----------------------
Nama    : Susi
NIM     : 444
Kelas   : 2C
IPK     : 3.1
----------------------
Nama    : Dika
NIM     : 222
Kelas   : 2C
IPK     : 3.0
----------------------
Data yang sudah terurut menggunakan INSERTION SORT (ASC) : 
Nama    : Dika
NIM     : 222
Kelas   : 2C
IPK     : 3.0
----------------------
Nama    : Susi
NIM     : 444
Kelas   : 2C
IPK     : 3.1
----------------------
Nama    : Yayuk
NIM     : 555
Kelas   : 2C
IPK     : 3.4
----------------------
Nama    : Ayu
NIM     : 111
Kelas   : 2C
IPK     : 3.7
----------------------
Nama    : Ila
NIM     : 333
Kelas   : 2C
IPK     : 3.8
----------------------
```

## Pertanyaan Percobaan 4
1. Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending
```
void insertionSortDescending(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa15 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j -1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j -1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
```