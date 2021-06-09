/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author USER
 */
public class Tugas3_Node {
    String nama;
    int nomor;
    Tugas3_Node prev, next;

    Tugas3_Node(Tugas3_Node prev, int nomor, String nama, Tugas3_Node next) {
        this.prev = prev;
        this.nama = nama;
        this.nomor = nomor;
        this.next = next;
    }
}
