|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020165 |
| Nama |  Inas Asami El Murtadho |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/inasaeel-dev/PRAKTIKUM-ASD-2026/tree/main) |

## 16.2.2 Verifikasi Hasil Percobaan
```
Elemen 0: Satu total elemen: 4 elemen terkahir: Cireng
Elemen 0: Dua total elemen: 4 elemen terkahir: Empat
Elemen 0: Noureen total elemen: 5 elemen terkahir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terkahir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
```

## 16.2.3 Pertanyaan Percobaan
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
> Karena menggunakan list dan arraylist tanpa generic type sehingga arraylist akan menyimpan elemen dengan tipe object atau dapat menampung berbagai jenis data seperti Int dan String

2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
```
List<String> l = new ArrayList();
    l.add("Satu");
    l.add("Dua");
    l.add("Tiga");
    l.add("Cireng");
    System.out.printf("Elemen 0: %s total elemen: %s elemen terkahir: %s\n", 
    l.get(0), l.size(), l.get(l.size() - 1));

    l.add("Empat");
    l.remove(0);
    System.out.printf("Elemen 0: %s total elemen: %s elemen terkahir: %s\n", 
    l.get(0), l.size(), l.get(l.size() - 1));
```

3. Ubah kode pada baris kode 38
```
LinkedList<String> names = new LinkedList<>();
```

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
```
names.push("Mei-mei");
    System.out.printf("Elemen 0: %s total elmeen %s elemen terakhir: %s\n", names.getFirst(), names.size(), names.getLast());
    System.out.println("Names: " + names.toString());
```

5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
> method push bekerja seperti di stack yaitu menambahkan elemen di bagian depan atau head dari linked list
```
Elemen 0: Satu total elemen: 4 elemen terkahir: Cireng
Elemen 0: Dua total elemen: 4 elemen terkahir: Empat
Elemen 0: Noureen total elemen: 5 elemen terkahir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terkahir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
Elemen 0: Mei-mei total elmeen 6 elemen terakhir: Al-Qarni
Names: [Mei-mei, My kid, Akhleema, Shannum, Uwais, Al-Qarni]
```

## 16.3.2 Verifikasi Hasil Percobaan
```
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian
```

## 16.3.3 Pertanyaan Percobaan
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
> push digunakan untuk menambahkan elemen baru ke bagian atas stack sedangkan add untuk menambahkan elemen baru di akhir koleksi sehingga output yang dihasilkan akan sama

2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
```
Banana Orange Watermelon Leci Strawberry 
[Banana, Orange, Watermelon, Leci, Strawberry]
Strawberry Leci Watermelon Orange Banana 
```
> jika method push dihapus maka objek fruits tidak memiliki elemen yang dapat ditampilkan oleh perulangan iterator sehingga ketika dijalankan "melon" dan "durian" tidak muncul output
3. Jelaskan fungsi dari baris 46-49?
> kode program tersebut akan membuat objek iterator terlebih dahulu untuk mengakses elemen dalam collection fruits satu per satu, kemudian akan dilakukan pengecekan apakah masih ada elemen berikutnya yang belum terbaca jika ada maka perulangan akan terus berjalan, jika tidak maka perulangan akan berhenti. "it.next" akan mengambil elemen berikutnya dan memindahkan posisi iterator ke elemen berikutnya dan kemudian program akan menampilkan setiap elemen yang telah diperoleh

4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?
> error, karena pada baris kode yang menggunakan method push, pop dan empty tidak ada dalam library list, program akan tetap berjalan menggunakan list

5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
```
Banana Orange Watermelon Leci Strawberry 
[Banana, Orange, Watermelon, Leci, Strawberry]
Strawberry Leci Watermelon Orange Banana 
```

6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
```
Banana Orange Watermelon Leci Strawberry 
[Banana, Orange, Watermelon, Leci, Strawberry]
Strawberry Leci Watermelon Orange Banana 

Mango Guava Avocado 
Setelah sorting: 
[Avocado, Guava, Mango]
```
## 16.4.2 Verifikasi Hasil Percobaan
```
Mahasiswa{nim = 201234, nama = Noureen, notelp = 021xx1}
 Mahasiswa{nim = 201235, nama = Akhleema, notelp = 021xx2}
 Mahasiswa{nim = 201236, nama = Shannum, notelp = 021xx3}

 Mahasiswa{nim = 201234, nama = Noureen, notelp = 021xx1}
 Mahasiswa{nim = 201235, nama = Akhleema Lela, notelp = 021xx2}
 Mahasiswa{nim = 201236, nama = Shannum, notelp = 021xx3}
 ```

 ## 16.4.3 Pertanyaan Percobaan
 1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?
> menggunakan Varargs (Variable Arguments) dengan beberapa kelebihan sebagai berikut : a. jumlah parameter yang dikirim tidak terbatas b. tidak perlu membuat array secara manual c. kode menjadi lebih sederhana dan fleksibel

2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
```
public int binarySearch(String nim) {
    Collections.sort(mahasiswas, (a, b) -> a.nim.compareTo(b.nim));
    return Collections.binarySearch(mahasiswas, 
        new Mahasiswa15(nim, "", ""),
            (a, b) -> a.nim.compareTo(b.nim)
    );
```

3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!
```
public void sortAsc() {
    Collections.sort(mahasiswas, (a, b) -> a.nim.compareTo(b.nim));
}
public void sortDesc() {
    Collections.sort(mahasiswas, (a, b) -> b.nim.compareTo(a.nim));
}
```

```
Mahasiswa{nim = 201234, nama = Noureen, notelp = 021xx1}
 Mahasiswa{nim = 201235, nama = Akhleema, notelp = 021xx2}
 Mahasiswa{nim = 201236, nama = Shannum, notelp = 021xx3}

 Mahasiswa{nim = 201234, nama = Noureen, notelp = 021xx1}
 Mahasiswa{nim = 201235, nama = Akhleema Lela, notelp = 021xx2}
 Mahasiswa{nim = 201236, nama = Shannum, notelp = 021xx3}
 ```

 ## Tugas
 