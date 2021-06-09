/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author USER
 */
public class NodeNo4 {
    int data;
    NodeNo4 prev;
    NodeNo4 next;

    NodeNo4(NodeNo4 prev, int data, NodeNo4 next) {

        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}
