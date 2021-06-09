/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Tabung {
    public int jari;
    public int tinggi;
    
    public Tabung(int j, int t){
        jari = j;
        tinggi = t;
    }
    public int hitungVolume(){
    return 22/7 * (jari * jari) * tinggi ;
    }
    public int hitungLuasPermukaan(){
    return 2 * (22/7 * jari * tinggi) + 2 * (22/7 * (jari * jari));
    }
}
