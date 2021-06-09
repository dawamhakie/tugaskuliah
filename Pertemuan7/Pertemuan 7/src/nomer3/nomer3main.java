/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer3;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class nomer3main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        no3cari array = new no3cari();
        
        System.out.println("Pencarian data");
        System.out.print("Masukkan angka : ");
        int a = s.nextInt();
        System.out.println("Pencarian menggunakan seqsearch");
        int posisi = array.FindSeqSearch(a);
        
       //array.TampilPosisi(a, posisi) 
    }
}
