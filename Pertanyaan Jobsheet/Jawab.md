# Jawaban Jobsheet 13
## 12.2.3 Pertanyaan Percobaan
Jawaban
1.  Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah  kegunaan algoritma-algoritma tersebut? 
 
## jawab
- Binary Tree 
- Binary Search Tree 
- Adjacency Matriks 
- Adjacency List 


2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList lis[]. Apakah tujuan pembuatan variabel tersebut ? 

## jawab
Untuk memanggil fungsi linked list dan mengisi list yang berupa vertex pada linked list tersebut. 


3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph? 

## jawab
Karena method addFirst untuk menambahkan data di node paling depan. 

4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge  pada graph ? 

## jawab
Dengan cara melakukan looping vertex. Jadi, jika vertex lebih besar dari (i) dan destination sama dengan (i) maka edge akan otomatis dihapus. 


5. Kenapa pada praktikum 12.2 langkah ke-12 untuk menghapus path yang bukan merupakan lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ? 

## jawab
Output yang dikeluarkan tidak error namun data vertex yang dilewati mengalami 
perubahan path / lintasan.



## 12.3.3 Pertanyaan

1.	1.	Apakah perbedaan degree/derajat pada directed dan undirected graph? 
## jawab
- Pada directed graph degree mempengaruhi bobot pada edge antar vertex (bobotnya tidak sama antara A ke B dan B ke A).  
- Sedangkan undirected graph degree tidak mempengaruhi bobot (bobot antara A ke B dan B ke A nilai bobotnya sama). 

2.	Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus ditambahkan dengan 1 pada indeks array berikut?
## jawab
Karena vertex dimasukkan ke dalam matriks sedangkan pada matriks indeks pertama dimulai dari 0. Maka, agar vertex dalam matrix sama dengan vertex yang aslinya harus di +1.

3.	Apakah kegunaan method getEdge() ?
## jawab
Untuk menampilkan suatu lintasan yang diperlukan

4. 	Termasuk jenis graph apakah uji coba pada praktikum 12.3 ? 
## jawab
Adjacency matrix

5. Mengapa pada method main harus menggunakan try-catch Exception ?
## jawab
Karena untuk mengurungkan eksekusi yang menampilkan error dan dapat membuat program tersebut tetap berjalan tanpa harus dihentikan secara langsung

