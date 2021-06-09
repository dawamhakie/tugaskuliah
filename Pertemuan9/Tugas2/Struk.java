/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author USER
 */
public class Struk {
    String nomorTransaksi, tanggal;
    int jumlahBarang, totalHarga;
    
    Struk(String n, String t, int j, int tot){
        nomorTransaksi = n;
        tanggal = t;
        jumlahBarang = j;
        totalHarga = tot;
    }
}
