/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PercobaanPraktikum;

/**
 *
 * @author USER
 */
public class TugasNo2_NilaiMahasiswa {
    String nim, nama, notelp;

    public TugasNo2_NilaiMahasiswa() {
    }

    public TugasNo2_NilaiMahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp="+ notelp + '}';
    }
}
