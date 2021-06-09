/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No5;

/**
 *
 * @author USER
 */
public class Node {
    String nama, alamat, noRek;
    Node next;

    public Node(String nomorrekening, String nama, String alamat, Node berikutnya) {
        this.noRek = nomorrekening;
        this.nama = nama;
        this.alamat = alamat;
        this.next = berikutnya;
    }
}
