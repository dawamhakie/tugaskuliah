/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiAlgoritma;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class InputNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        
        NilaiAlgoritma[] data = new NilaiAlgoritma[3];
         
        
        System.out.print("Masukkan Nilai Tugas Rani      : ");
        int tugas = s.nextInt();
        System.out.print("Masukkan Nilai Kuis Rani       : ");
        int kuis = s.nextInt();
        System.out.print("Masukkan Nilai UTS Rani        : ");
        int uts = s.nextInt();
        System.out.print("Masukkan Nilai UAS Rani        : ");
        int uas = s.nextInt();
        data[0] = new NilaiAlgoritma("Rani", tugas, kuis, uts, uas);
        
        System.out.print("Masukkan Nilai Tugas Dani      : ");
        int tugas1 = s.nextInt();
        System.out.print("Masukkan Nilai Kuis Dani       : ");
        int kuis1 = s.nextInt();
        System.out.print("Masukkan Nilai UTS Dani        : ");
        int uts1 = s.nextInt();
        System.out.print("Masukkan Nilai UAS Dani        : ");
        int uas1 = s.nextInt();
        data[1] = new NilaiAlgoritma("Dani", tugas1, kuis1, uts1, uas1);
        
        System.out.print("Masukkan Nilai Tugas Saraswati      : ");
        int tugas2 = s.nextInt();
        System.out.print("Masukkan Nilai Kuis Saraswati       : ");
        int kuis2 = s.nextInt();
        System.out.print("Masukkan Nilai UTS Saraswati        : ");
        int uts2 = s.nextInt();
        System.out.print("Masukkan Nilai UAS Saraswati        : ");
        int uas2 = s.nextInt();
        data[2] = new NilaiAlgoritma("Saraswati", tugas2, kuis2, uts2, uas2);
        
        NilaiAlgoritma[] array = new NilaiAlgoritma[3];
        array[0] = new NilaiAlgoritma("Rani", tugas, kuis, uts, uas);
        array[1] = new NilaiAlgoritma("Dani", tugas1, kuis1, uts1, uas1);
        array[2] = new NilaiAlgoritma("Saraswati", tugas2, kuis2, uts2, uas2);
        
        System.out.println("Rata-Rata   : " + array[0] );
    }   
}
