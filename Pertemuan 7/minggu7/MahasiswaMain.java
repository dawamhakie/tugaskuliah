/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        
        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;
        
        System.out.println("--------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari Nim Terkecil");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("-------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa setelah diurutkan menggunakan insertion sort: ");
        data.insertionSort();
        data.tampil();
        
        System.out.println("_________________________________________");
        System.out.println("_________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
        System.out.println("NIM : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        
        System.out.println("====================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    } 
}
