# Jawaban Jobsheet 12
## 12.2.3 Pertanyaan
Jawaban
1. Jelaskan perbedaan antara single linked list dengan double linked lists! 
## jawab
Perbedaan antara single linked list dengan double linked list yakni hanya terletak pada pointernya saja, pada single linked list pointer hanya ada 1 yaitu next, sementara pada double linked list ada 2 pointer yakni next dan previsious/prev.

2. Perhatikan class Node, didalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut? 
## jawab
Atribut next berguna untuk menunjuk kepada node berikutnya, dan atribut prev berguna untuk menunjuk kepada node sebelumnya

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini? 
## jawab
Dilakukan inisialisai atribut head==null dilakukan untuk menunjukkan bahwa head belum menunjuk ke node manapun. Sedangkan size diinisialisasi untuk menyimpan jumlah data pada linked list.

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null? Node newNode = new Node(null, item, head); 
## jawab
pembuatan object dari konstruktor class Node prev dianggap sama dengan null karena, operasi addFirst digunakan untuk penambahan data/node  di awal atau di index 0. Yang mana dalam hal ini, data yang ditambahkan ke node baru prevnya akan bernilai null karena pointer prev pada node tersebut tidak menunjuk ke node manapun.

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ? 
## jawab
arti statement head.prev = newNode yakni pointer prev pada data yang sudah ada pada linked list akan menunjuk ke node yang baru.

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null? Node newNode = new Node(current, item, null);
## jawab
current digunakan untuk menyimpan node yang sebelumnya, dimana jika dilakukan penambahan data pada index terakhir, maka pointer prev pada node yang ditambahkan akan menunjuk ke node yang sebelumnya.

## 12.3.3 Pertanyaan

1.	Apakah maksud statement berikut pada method removeFirst()? head = head.next; head.prev = null; 
## jawab
Maksud dari method removeFirst()? head = head.next; head.prev = null; yakni ketika dilakukan penghapusan node pada index pertama, maka posisi head akan berpindah posisi ke node yang selanjutnya, dan pointer prev pada head akan bernilai null atau tidak menunjuk ke node manapun

2.	Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()? 
## jawab
Cara  mendeteksi posisi data ada pada bagian akhir pada method removeLast() yakni dengan melihat apakah pointer next pada node bernilai null atau tidak. Jika pointer next pada node bernilai null maka bisa dipastikan bahwa data tersebut berada pada bagian akhir.

3.	Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
## jawab
Kode program di bawah ini tidak cocok untuk perintah remove karena potongan kode tersebut lebih cocok digunakan untuk removeFirst dimana tmp menyimpan data setelah head, lalu head.next menyimpan data tmp.next. Kemudian pointer prev pada tmp.next menunjuk ke head// karena tidak jelas dalam penunjukannya serta ambigu sehingga tidak cocok di gunakan untuk perintah remove.

4. Jelaskan fungsi kode program berikut ini pada fungsi remove!
## jawab
pointer next pada current/node sebelumnya akan menunjuk ke current/node selanjutnya, dan pointer prev pada current/node selanjutnya akan menunjuk ke current/node sebelumnya

## 12.4.3 Pertanyaan

1. Jelaskan method size() pada class DoubleLinkedLists! 
## jawab
method size() pada class DoubleLinkedLists akan mereturn nilai 0 jika linked list dalam kondisi kosong atau tidak ada datanya.

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1! 
## jawab
cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1 yakni dengan cara melakukan perulangan dan diinisilisasikan index sama dengan 1.

3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! 
## jawab
perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists yakni jika pada single linked list operasi terbagi menjadi beberapa fungsi (insertafter, insertbefore, dan insert at), sedangkan pada double linked list menjadi satu fungsi yang berdasarkan indeks. Indeks yang akan ditambahkan dapat disisipkan di awal maupun akhir dari double linked list.

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!
## jawab
Pada gambar A Jika atribut size atau jumlah data bernilai 0, maka akan mereturn true atau kondisi tersebut adalah true.Jika tidak maka kondisi tersebut adalah false. sedangkan pada gambar B Jika head atau data pada index pertama bernilai null, maka kondisi tersebut adalah true.