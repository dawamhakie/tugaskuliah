# Jawaban Jobsheet 6
## 4.2.3 Pertanyaan
Jawaban
1. Dalam base line algoritma divide conquer pada class factorial menggunakan pemilihan if (n == 1) return 1, yang artinya jika nilai yang akan dimasukkan nantinya adalah 1 maka hasil yang akan ditampilkan program main nantinya adalah 1 dan berfungsi sebagai batas dari divide conquer dimana perulangan kali akan berakhir saat n sudah samadengan 1
2. Divide : membagi masalah menjadi beberapa upa masalah yang memiliki kemiripan dengan masalah semula namun berukuran lebih kecil .
dalam kodingan percobaan 1 faktorial, divide ditujukan oleh adanya pemecahan masalah menjadi 2 upa masalah yang diisyaratkan dengan kondisi pemilihan if else dimana if berperan sebagai base case dan else sebagai rekursif call

conquer : memecahkan masing masing upamasalah (secara rekursif).
Dalam kodingan percobaan 1 faktorial, conquer ditujukan oleh adanya penyelesaian masalah secara reqursif dimana upa masalah diselesaikan masing-masing yang telah diisyaratkan pada codingan dalam else yang memberikan rumus int fakto = n * faktorialDC(n-1); yang berarti nanti setiap upa masalah akan dikalikan sendiri-sendiri.

Combine: mengabungkan solusi masing-masing upa-masalah sehingga membentuk solusi masalah semula.  Dalam kodingan percobaan 1 faktorial, combine ditujukan oleh adanya penarikan hasil keseluruhan berupa return atau pengembalian nilai dari proses rekursif pada tahap conquer yang diisyaratkan pada return fakto; di else dalam method faktorialDC();

3. Bisa, selama termasuk looping maka jenis looping apapun bisa digunakan pada method faktorialBF() dan saya sudah mencoba membuktikannya dengan looping jenis while dan program tetap berjalan dengan baik.

4. 

5. 



## 4.3.3 Pertanyaan

