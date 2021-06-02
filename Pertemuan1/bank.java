/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class bank {
    public static void main(String[] args) {
        
       int bunga;
       
       bunga = 1000000 * 2/100;
       //500000 dari 1 juta menuju 1juta lima ratus ribu rupiah
       int bulan = 500000 / bunga;
        System.out.println("Saldo nasabah akan mencapai 1,5 juta pada bulan ke " + bulan);
    }
}
