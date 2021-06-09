/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak2_doublelinkedlist;

import Prak1_doublelinkedlist.Prak1_Node;

/**
 *
 * @author USER
 */
public class Prak2_Node {
    int data;
    Prak2_Node prev, next;
    
    Prak2_Node(Prak2_Node prev, int data, Prak2_Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
