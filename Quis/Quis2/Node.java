/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis2;

/**
 *
 * @author USER
 */
public class Node {
    String nama, jurusan, prodi, ipk;
    Node prev, next;
    int data, nim;
    
    
    Node(Node prev, int nim, String nama, String jurusan, String prodi, String ipk, Node next) {
        this.prev = prev;
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.ipk = ipk;
        this.next = next;
    }
}
