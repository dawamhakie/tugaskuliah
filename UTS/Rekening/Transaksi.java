/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekening;

/**
 *
 * @author USER
 */
public class Transaksi {
    double saldo, saldoAwal, saldoAkhir;
    double tanggalTransaksi, type;
    int indeks;
    
    Rekening listTrnsks[] = new Rekening[26];
    
    void tambah(Rekening r){
        if(indeks < listTrnsks.length){
            listTrnsks[indeks] = r;
            indeks++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }
    
    void Transaksi(double a, double b, double c, double d, double e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
    }
    
    void tampil(){
        for(Rekening r : listTrnsks){
            r.tampil();
            System.out.println("----------------------------");
        }
    }
    
    void insertionSort(){
        for(int i = 1; i < listTrnsks.length; i++){
            Rekening temp = listTrnsks[i];
            int j = i;
            while(j > 0 && listTrnsks[j - 1].saldo > temp.saldo){
                listTrnsks[j] = listTrnsks[j - 1];
                j--;
            }
            listTrnsks[j] = temp;
        }
    }
    
    public int PencarianSequencialSearch(int cari){
        int posisi = -1;
        for(int i = 0; i < listTrnsks.length; i++){
            if(listTrnsks[i].noRekening.equalsIgnoreCase("cari")){
                posisi = i;
                break;
            } 
        }
        return posisi;
    }
}
