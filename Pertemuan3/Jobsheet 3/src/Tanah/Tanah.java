/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanah;

/**
 *
 * @author USER
 */
public class Tanah {
    public int panjang;
    public int lebar;
    
    public Tanah(int p, int l){
        panjang = p;
        lebar = l;
    }
    public int hitungLuas(){
    return panjang * lebar;
}
}
