/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

/**
 *
 * @author USER
 */
public class Node {
    String noRek, nama, alamat;
    Node next;

    public Node(String nomorRekening, String nama, String alamat, Node berikutnya) {
        this.noRek = nomorRekening;
        this.nama = nama;
        this.alamat = alamat;
        this.next = berikutnya;
    }
}
