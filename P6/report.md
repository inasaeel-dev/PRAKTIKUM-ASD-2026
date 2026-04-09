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
