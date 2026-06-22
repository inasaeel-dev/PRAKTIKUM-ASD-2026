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
Banana Orange Watermelon Leci Strawberry 
[Banana, Orange, Watermelon, Leci, Strawberry]
Strawberry Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian
```

## 16.3.3 Pertanyaan Percobaan
1. 