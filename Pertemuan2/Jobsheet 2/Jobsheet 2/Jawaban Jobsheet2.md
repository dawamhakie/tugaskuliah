## Pertanyaan 2.2.3 JOBSHEET II


1.	Sebutkan 2 karakteristik class/objek! 
	
	-  Jawab
	 
Atribut dan method.
-	Atribut merupakan status object 
-	method merupakan tingkah laku dari object tersebut
	
2.	Kata kunci apakah yang digunakan untuk mendeklarasikan class? 

	 Jawab
	
- Menggunakan kata kunci class

3.	Perhatikan class Barang yang ada di Praktikum di atas, ada berapa atribut yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan? 

- Jawab

Ada 4 yaitu namaBarang, jenisBarang, stok, dan hargaSatuan, Deklarasi atribut pada baris ke 2 dan ke 3

4.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi method dilakukan? 

	 Jawab
	
- Ada 4 yaitu tampilBarang, tambahStok, kurangstok, dan hitungHargaTotal.
Deklarasi atribut ke 4, ke 10, ke 13, ke 16, dan ke 19

5.	Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0)
 
Jawab

- If (stok > 0 ){ 
stok – n;
}

6.	Menurut Anda, mengapa method tambahStok() dibuat dengan memiliki 1 parameter berupa bilangan int? 

- Jawab 

Karena fungsi dari method itu adalah untuk menambah jumlah stok yang ada dengan data yang berasal dari luar method itu sendiri, sehingga membutuhkan parameter untuk mengambil nilai dari data yang di inputkan. Dan karena fungsinya adalah untuk menambah stok, maka tipe yang sesuai adalah integer 

7.	Menurut Anda, mengapa method hitungHargaTotal() memiliki tipe data int? 

	 Jawab
	 
	- Karena method tersebut digunakan untuk menghitung sebuah operasi matematika dan variabel jumlah yang dikali dengan variabel hargaSatuan, sehingga diperlukan tipe data kembalian berupa integer agar ketika dipanggil dimethod lain, method itu bisa menerima atau mendapatkan nilai dari perhitungan atau pengolahan data dari method hitungHargaTotal().

8.	Menurut Anda, mengapa method tambahStok() memiliki tipe data void?

-	Jawab

-	Karena pada metod tambahStok() tidak memerlukan nilai kembalian yaitu hanya digunakan untuk menjalankan aksi tanpa menyimpan tipe data kembalian



Pertanyaan 2.3.3
1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek yang dihasilkan? 
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
Jawaban :
1.	Pada baris ke 6, terdapat instansiasi objek pada class barang dengan nama objek b1. Dengan syntax barang b1 = new barang();
2.	Dengan cara  menginstansiasi barang b1 = new barang();







Pertanyaan 2.4.3

1. Perhatikan class Barang yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi konstruktor berparameter dilakukan? 
2. Perhatikan class BarangMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris program dibawah ini?
3.Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class Barang.

Jawaban :  
1.	Barang (String nm, String jn, int st, int hs) {
namaBarang = nm;
jenisBarang = jn;
stok = st;
hargaSatuan = hs;
}
2.	Mengisi konstruktor yang tidak berparameter pada class main
3.	Barang b3 = new barang ();
B3.namaBarang = “ Wifi”;
B3.jenisBarang = “4G”;
B3.stok = 1;
B3.hargaSatuan = 300000;
B3.kurangStok(1);
B3.tambahStok(5);
B3.tampilBarang();
Int hargaTotal = b3.hitungHargaTotal(2);
Sytem.out.println(“Harga 2 buah =” + hargaTotal)
























