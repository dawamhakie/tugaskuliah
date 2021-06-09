# Jawaban Jobsheet 13
## 13.2.2 Pertanyaan
Jawaban
1.  Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa? 
## jawab
karena ada hanya 2 langkah untuk melakukan search yaitu mencari dengan menggunakan node nilai lebih kecil dan node lebih besar dengan begitu mudah

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
## jawab
untuk menghubungkan node satu dengan yang lain dan untuk menyimpan datanya

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
## jawab
a.  sebagai penanda data sebagai current
b. Nilai root untuk pertama kali Ketika dibuat adalah null

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
## jawab
Sebelum menambahkan  data akan dilakukan pengecekan apakah terdapat isinya atau masih kosongm, Jika data kosong data yang di tambahkan akan mejadi Node current dan berguna sebagai root

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ? 
## jawab
Pertamakali melakukan pengecekan apakah data kurang dari current. data lalu jika true akan dilakukan pengecekan lagi untuk atribut left tidak sama dengan null makan data yang ada akan menjadi
left



## 13.3.2 Pertanyaan

1.	Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
## jawab
Berfungsi untuk menyimpan data ke array jika idxLast untuk menentukan banyaknya nilai yang ada pada array tersebut

2.	Apakah kegunaan dari method populateData()?
## jawab
Berfungsi untuk menujukkan data pada idxLast

3.	Apakah kegunaan dari method traverseInOrder()?
## jawab
untuk menentukan root awal

4.  Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?
## jawab
Posisi left child berada pada indeks ke 1 dan right child berada pada indeks ke 2

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
## jawab
Membuat indeks terakhir di array ke 6

