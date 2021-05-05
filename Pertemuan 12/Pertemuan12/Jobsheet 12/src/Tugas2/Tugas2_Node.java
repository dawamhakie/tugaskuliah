/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author USER
 */
public class Tugas2_Node {
    String judulBuku;
    Tugas2_Node prev, next;

    Tugas2_Node(Tugas2_Node prev, String judulBuku, Tugas2_Node next) {
        this.prev = prev;
        this.judulBuku = judulBuku;
        this.next = next;
    }
}
