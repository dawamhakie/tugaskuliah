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
public class nomer3 {
    int baris, kolom;
    
    nomer3(int br, int kl){
        baris = br;
        kolom = kl;
    }
    
    void tampil(){
        System.out.println("Baris ke-"+baris);
        System.out.println("Kolom ke-"+kolom);
    }
}
