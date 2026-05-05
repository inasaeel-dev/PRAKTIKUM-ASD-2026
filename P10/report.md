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
> 

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```
if (rear == max - 1){
        rear = 0;
```
>

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```
if (front == max -1){
         front = 0;
```
> 

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i = front?
> 

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
```
i = (i + 1) % max;
```
>

6. Tunjukkan potongan kode program yang merupakan queue overflow!
> 

Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
> 