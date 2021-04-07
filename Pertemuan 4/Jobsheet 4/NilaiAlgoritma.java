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

public class NilaiAlgoritma {
    public static void main(String[] args) {
        
    }
    String namaMhs;
    int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    
    NilaiAlgoritma(String nm, int nt, int k, int ut, int ua){
      namaMhs = nm;
      nilaiTugas = nt;
      nilaiKuis = k;
      nilaiUTS = ut;
      nilaiUAS = ua;
      
      double t = nilaiTugas * 30/100;
      double ku = nilaiKuis * 20/100;
      double uts = nilaiUTS * 20/100;
      double uas = nilaiUAS * 30/100;
      
      double t1 = nilaiTugas - t;
      double ku1 = nilaiKuis - ku;
      double uts1 = nilaiUTS - uts;
      double uas1 = nilaiUAS - uas;
      
      
        System.out.println("Nama Mahasiswa  : " + namaMhs);
        System.out.println("Nilai Tugas     : " + t1);
        System.out.println("Nilai Kuis      : " + ku1);
        System.out.println("Nilai UTS       : " + uts1);
        System.out.println("Nilai UAS       : " + uas1);
        System.out.println("");
        System.out.println("Nilai Total Mata Kuliah ALgoritma     : " + (t1 + ku1 + uts1 + uas1));
    }    
}
