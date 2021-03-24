/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1;

/**
 *
 * @author USER
 */
public class Tiket {
    String maskapai, asal, tujuan;
    int harga;
    
    Tiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    
    void tampilAll(){
        System.out.println("Maskapai : " + maskapai);
        System.out.println("Harga   : " + harga);
        System.out.println("Asal    : " + asal);
        System.out.println("Tujuan  : " + tujuan);
    }
}
