|  | Algorithm and Data Structure |
|--|--|
| NIM | 254107020165 |
| Nama |  Inas Asami El Murtadho |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/inasaeel-dev/PRAKTIKUM-ASD-2026/tree/main) |

## 14.2.1 Verifikasi Hasil Percobaan 1
```
Daftar semua mahasiswa (in ordertraversal) : 
NIM : 244160185 Nama : Candra Kelas : C IPK : 3.21
NIM : 244160220 Nama : Dewi Kelas : B IPK : 3.54
NIM : 244160121 Nama : Ali Kelas : A IPK : 3.57
NIM : 244160221 Nama : Badar Kelas : B IPK : 3.85

Pencarian data mahasiswa : 
Cari mahasiswa dengan ipk : 3.54 : Ditemukan
Cari mahasiswa dengan ipk : 3.22 : Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa : 
InOrder Traversal : 
NIM : 244160185 Nama : Candra Kelas : C IPK : 3.21
NIM : 244160205 Nama : Ehsan Kelas : D IPK : 3.37
NIM : 244160170 Nama : Fizi Kelas : B IPK : 3.46
NIM : 244160220 Nama : Dewi Kelas : B IPK : 3.54
NIM : 244160121 Nama : Ali Kelas : A IPK : 3.57
NIM : 244160131 Nama : Devi Kelas : A IPK : 3.72
NIM : 244160221 Nama : Badar Kelas : B IPK : 3.85

PreOrder Traversal : 
NIM : 244160121 Nama : Ali Kelas : A IPK : 3.57
NIM : 244160185 Nama : Candra Kelas : C IPK : 3.21
NIM : 244160220 Nama : Dewi Kelas : B IPK : 3.54
NIM : 244160205 Nama : Ehsan Kelas : D IPK : 3.37
NIM : 244160170 Nama : Fizi Kelas : B IPK : 3.46
NIM : 244160221 Nama : Badar Kelas : B IPK : 3.85
NIM : 244160131 Nama : Devi Kelas : A IPK : 3.72

PostOrder Traversal : 
NIM : 244160170 Nama : Fizi Kelas : B IPK : 3.46
NIM : 244160205 Nama : Ehsan Kelas : D IPK : 3.37
NIM : 244160220 Nama : Dewi Kelas : B IPK : 3.54
NIM : 244160185 Nama : Candra Kelas : C IPK : 3.21
NIM : 244160131 Nama : Devi Kelas : A IPK : 3.72
NIM : 244160221 Nama : Badar Kelas : B IPK : 3.85
NIM : 244160121 Nama : Ali Kelas : A IPK : 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM : 244160131 Nama : Devi Kelas : A IPK : 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal) : 
NIM : 244160185 Nama : Candra Kelas : C IPK : 3.21
NIM : 244160205 Nama : Ehsan Kelas : D IPK : 3.37
NIM : 244160170 Nama : Fizi Kelas : B IPK : 3.46
NIM : 244160220 Nama : Dewi Kelas : B IPK : 3.54
NIM : 244160131 Nama : Devi Kelas : A IPK : 3.72
NIM : 244160221 Nama : Badar Kelas : B IPK : 3.85
```

## 14.2.2 Pertanyaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibandingbinary tree biasa?
> setiap node memiliki aturan khusus, nilai pada sub tree kiri selalu lebih kecil dari node induk dan nilai pada subtree kanan selalu lebih besar

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
> left dan right digunakan untuk menyimpan referensi alamat ke node kiri dan node kanan
3.   a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
    > root digunakan untuk mentimpan referensi ke node akar, yaitu node pertama atau node paling atas pada struktur binary tree
    b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
    > belum memiliki nilai apapun atau null

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
> cek root, pembuatan node baru, dan node tersebut ditetapkan sebagai root tree karena belum ada node lain di dalam tree

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
```
parent = current;
    if (mahasiswa.ipk < current.mahasiswa.ipk){
        current = current.left;
        if (current == null){
            parent.left = newNode15;
            return;
        }
    } else {
        current = current.right;
        if (current == null){
            parent.right = newNode15;
            return;
    }
}
```
> untuk menentukan posisi node baru berdasarkan nilai ipk mhs dengan melakukan pengecekan untuk membandingkan ipk mhs yang akan ditambahkan dengan ipk pada node saat ini, jika ipk lebih kecil maka node harus ditempatkan di sub tree bagian kiri, jika tidak maka node akan ditempatkan di subtree bagian kanan

6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?
> Saat menghapus node yang memiliki dua anak, method delete() menggunakan getSuccessor() untuk mencari node terkecil pada subtree kanan. Node successor tersebut kemudian menggantikan posisi node yang dihapus sehingga urutan data pada Binary Search Tree tetap terjaga. Method getSuccessor() membantu dengan mencari successor, melepaskannya dari posisi lama, dan menyesuaikan hubungan antar node sebelum successor ditempatkan pada posisi node yang dihapus.

## 14.3.1 Verifikasi Hasil Percobaan 2
```
InOrder Traversal Mahasiswa : 
NIM : 244160220 Nama : Dewi Kelas : B IPK : 3.35
NIM : 244160185 Nama : Candra Kelas : C IPK : 3.41
NIM : 244160131 Nama : Devi Kelas : A IPK : 3.48
NIM : 244160121 Nama : Ali Kelas : A IPK : 3.57
NIM : 244160205 Nama : Ehsan Kelas : D IPK : 3.61
NIM : 244160221 Nama : Badar Kelas : B IPK : 3.75
NIM : 244160170 Nama : Fizi Kelas : B IPK : 3.86
```

## 14.3.2 Pertanyaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
> untuk menyimpan seluruh node atau nilai yang ada dalam binary tree dalam bentuk array, sedangkan atribut idxLast digunakan untuk menyimpan indeks terakhir pada array

2. Apakah kegunaan dari method populateData()?
> untuk mengisi data binary tree yang disimpan dalam array sekaligus menentukan indeks terakhir yang berisi data

3. Apakah kegunaan dari method traverseInOrder()?
> untuk mencari seluruh node pada binary tree menggunakan urutan InOrder

4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing?
> left child = 2 * i + 1 = 2 × 2 + 1 = 5 & right child = 2 * i + 2 = 2 × 2 + 2 = 6

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
> untuk menandai bahwa indeks terakhir yang berisi data pada array binary tree adalah indeks ke 6

6. Mengapa indeks 2 * idxStart + 1 dan 2 * idxStart + 2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?
> berkaitan dengan cara penyimpanan binary tree dalam array, cara ini bisa menulusuri struktur pohon menggunakan array tanpa perlu menyimpan referensi left dan right pada setiap node

## 14.4 Tugas Praktikum
