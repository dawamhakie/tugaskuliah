/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class TugasNo2_QueueMain {
   public static void menu() {
        System.out.println("Masukkan Operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position berdasarkan NIM");
        System.out.println("7. Cari Mahasiswa berdasarkan Index");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue : ");
        int n = sc.nextInt();
        int pilih;
        TugasNo2_Queue antri = new TugasNo2_Queue(n);
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nomer Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc.nextInt();
                    TugasNo2_Mahasiswa p = new TugasNo2_Mahasiswa(nama, nim, absen, ipk);
                    antri.Enqueue(p);
                    break;
                case 2:
                    TugasNo2_Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.nim) && data.absen != 0 && data.ipk != 0) {
                        System.out.println("Antrian Yang Keluar : " + data.nama + " " + data.nim + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang Dicari: ");
                    String carinim = sc.next();
                    antri.peekPosition(carinim);
                    break;
                case 7:
                    System.out.print("Masukkan Index atau Antrian yang ingin dicari datanya: ");
                    int index = sc.nextInt();
                    antri.printMahasiswa(index);
                    break;
            }
        } while (pilih > 0 || pilih < 8);
    } 
}
