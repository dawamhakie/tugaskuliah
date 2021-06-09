/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak1_doublelinkedlist;

/**
 *
 * @author USER
 */
public class Prak1_Node {
    int data;
    Prak1_Node prev, next;
    
    Prak1_Node(Prak1_Node prev, int data, Prak1_Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
