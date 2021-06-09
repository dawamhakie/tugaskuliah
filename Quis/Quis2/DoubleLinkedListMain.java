/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class DoubleLinkedListMain {
     public static void menu() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("=====================================");
        System.out.println("1.  Tambah Data Mahasiswa berdasarkan Index tertentu");
        System.out.println("2.  Tambah Data Mahasiswa posisi Akhir");
        System.out.println("3.  Tambah Data Mahasiswa posisi Awal");
        System.out.println("4.  Hapus Data Mahasiswa berdasarkan Index tertentu");
        System.out.println("5.  Hapus Data Mahasiswa posisi awal");
        System.out.println("6.  Hapus Data Mahasiswa posisi akhir");
        System.out.println("7.  Cetak data Mahasiswa");
        System.out.println("8.  Data Mahasiswa urutan pertama");
        System.out.println("9.  Cari data Mahasiswa berdasarkan NIM");
        System.out.println("10. Urut data Mahasiswa berdasarkan IPK");
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sss = new Scanner(System.in);
        int menu = 0, index, masuk;
        String nama, jurusan, prodi, ipk;
        int nim;
       
        Node current = null;

        DoubleLinkedList dll = new DoubleLinkedList();

        while (menu != 10) {
            menu();
            menu = sc.nextInt();
            System.out.println("=====================================");

            try {
                switch (menu) {
                    case 1:
                        System.out.println("TAMBAH DATA MAHASISWA BERDASARKAN INDEX");
                        System.out.print("Masukkan posisi index : ");
                        index = sc.nextInt();
                        System.out.print("NIM : ");
                        nim = sc.nextInt();
                        System.out.print("Nama : ");
                        nama = sss.nextLine();
                        System.out.print("Jurusan : ");
                        jurusan = sss.nextLine();
                        System.out.print("Prodi : ");
                        prodi = sss.nextLine();
                        System.out.print("IPK : ");
                        ipk = sss.nextLine();
                        dll.add(nim, nama, jurusan, prodi, ipk, index);
                        break;
                    case 2:
                        System.out.println("TAMBAH DATA MAHASISWA POSISI AKHIR");
                        System.out.print("NIM : ");
                        nim = sc.nextInt();
                        System.out.print("Nama : ");
                        nama = sss.nextLine();
                        System.out.print("Jurusan : ");
                        jurusan = sss.nextLine();
                        System.out.print("Prodi : ");
                        prodi = sss.nextLine();
                        System.out.println("IPK : ");
                        ipk = sss.nextLine();
                        dll.addLast(nim, nama, jurusan, prodi, ipk);
                        break;
                    case 3:
                        System.out.println("TAMBAH DATA MAHASISWA POSISI AWAL");
                        System.out.print("NIM : ");
                        nim = sc.nextInt();
                        System.out.print("Nama : ");
                        nama = sss.nextLine();
                        System.out.print("Jurusan : ");
                        jurusan = sss.nextLine();
                        System.out.print("Prodi : ");
                        prodi = sss.nextLine();
                        System.out.println("IPK : ");
                        ipk = sss.nextLine();
                        dll.addFirst(nim, nama, jurusan, prodi, ipk);
                        break;
                    case 4:
                        System.out.println("HAPUS DATA MAHASISWA INDEX TERTENTU");
                        System.out.print("Masukkan posisi index : ");
                        index = sc.nextInt();
                        dll.remove(index);
                        break;
                    case 5:
                        System.out.println("HAPUS DATA MAHASISWA POSISI AWAL");
                        dll.removeFirst();
                        break;
                    case 6:
                        System.out.println("HAPUS DATA MAHASISWA POSISI AKHIR");
                        dll.removeLast();
                        break;
                    case 7:
                        System.out.println("CETAK DATA MAHASISWA");
                        dll.print();
                        System.out.println("Size : " + dll.size());
                        break;
                    case 8:
                        System.out.println("MENCARI DATA MAHASISWA URUTAN PERTAMA");
                        System.out.println("Data awal Mahasiswa adalah " + dll.getFirst());
                        break;
                    case 9:
                        System.out.println("CARI DATA MAHASISWA BERDASARKAN NIM");
                        System.out.print("Masukkan NIM : ");
                        nim = sc.nextInt();
                        dll.search(nim);
                        break;
                    case 10:
                        System.out.println("URUT DATA MAHASISWA BERDASARKAN IPK");
                        dll.sort();
                        
                }
                System.out.println();
            } catch (Exception e) {
            }
        }
    }
}
