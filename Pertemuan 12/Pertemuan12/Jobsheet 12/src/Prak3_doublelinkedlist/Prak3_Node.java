/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak3_doublelinkedlist;

/**
 *
 * @author USER
 */
public class Prak3_Node {
    int data;
    Prak3_Node prev, next;
    
    Prak3_Node(Prak3_Node prev, int data, Prak3_Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
