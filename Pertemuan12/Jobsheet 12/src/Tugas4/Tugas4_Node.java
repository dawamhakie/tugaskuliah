/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author USER
 */
public class Tugas4_Node {
    String nim, nama, nilai;
    Tugas4_Node prev, next;
    int data;

    Tugas4_Node(Tugas4_Node prev, String nim, String nama, String nilai, Tugas4_Node next) {
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.next = next;
    }
}
