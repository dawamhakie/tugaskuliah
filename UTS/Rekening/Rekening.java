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
public class Rekening {
    String noRekening, namaDepan, namaBelakang, Phone, Email, tanggalTransaksi;
    String saldo, saldoAwal, saldoAkhir;
   
    
    Rekening(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        noRekening = a;
        namaDepan = b;
        namaBelakang = c;
        Phone = d;
        Email = e;
        saldo = f;
        saldoAwal = g;
        saldoAkhir = h;
        tanggalTransaksi = i;
    }
    
    void tampil(){
        System.out.println("No Rekening\t : " + noRekening);
        System.out.println("Nama Depan\t : " + namaDepan);
        System.out.println("Nama Belakang\t : " + namaBelakang);
        System.out.println("Phone\t : " + Phone);
        System.out.println("Email\t : " + Email);
        System.out.println("Saldo\t : " + saldo);
        System.out.println("Saldo Awal\t : " + saldoAwal);
        System.out.println("Saldo AKhir\t : " + saldoAkhir);
        System.out.println("Tanggal Transaksi\t : " + tanggalTransaksi);
    }
}
