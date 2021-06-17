/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PercobaanPraktikum;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import java.util.Stack;
public class TugasNo1_PerpustakaanMain {
    public static void main(String[] args) {

        Stack<TugasNo1_Perpustakaan> buku = new Stack<>();
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("=====================");
            System.out.println("Data Buku Perpustakan");
            System.out.println("=====================");
            System.out.println("");
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cetak Buku Teratas");
            System.out.println("4. Info semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println("=====================");
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            if (pilih == 1) {
                input.nextLine();
                System.out.print("Isbn\t   : ");
                String isbn = input.nextLine();
                System.out.print("Judul\t   : ");
                String judul = input.nextLine();
                System.out.print("Terbit\t   : ");
                String terbit = input.nextLine();
                System.out.print("Penerbit   : ");
                String penerbit = input.nextLine();
                TugasNo1_Perpustakaan b = new TugasNo1_Perpustakaan();
                buku.push(b = new TugasNo1_Perpustakaan(isbn, judul, terbit, penerbit));
                System.out.println("");
            }

            if (pilih == 2) {
                buku.pop();
                System.out.println("");
            }

            if (pilih == 3) {
                System.out.print("Buku{" + "isbn=" + (buku.get(buku.size() - 1).isbn)
                        + ", " + "judul=" + (buku.get(buku.size() - 1).judul) + ", "
                        + "Terbit=" + (buku.get(buku.size() - 1).terbit) + ", "
                        + "Penerbit=" + (buku.get(buku.size() - 1).penerbit) + '}');
                System.out.println("");
            }

            if (pilih == 4) {
                buku.stream().forEach(b -> {
                    System.out.println("Buku{" + "isbn=" + b.isbn + ", " + "judul=" + b.judul
                            + ", " + "terbit=" + b.terbit + ", " + "penerbit=" + b.penerbit + '}');
                });
                System.out.println("");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
