/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataMahasiswa;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    public String nama;
    public int nim;
    public String jenisKelamin;
    public double ipk;
    
    Mahasiswa(String na, int nm, String jk, double i){
        nama = na;
        nim = nm;
        jenisKelamin = jk;
        ipk = i;
    }
    public void tampil(){
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Nilai IPK : " + ipk);
    }
}
