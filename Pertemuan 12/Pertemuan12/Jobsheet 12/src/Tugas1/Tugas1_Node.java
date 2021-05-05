/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author USER
 */
public class Tugas1_Node {
    int data;
    Tugas1_Node prev, next;

    public Tugas1_Node(Tugas1_Node prev, int data, Tugas1_Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;

    }
}
