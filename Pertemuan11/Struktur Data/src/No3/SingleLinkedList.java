/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

/**
 *
 * @author USER
 */
public class SingleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("");
            while (tmp != null) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            Node tmp = head;

            System.out.println("Isi Stack Teratas = " + tmp.data);

        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void pushFirst(String input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {//jika linked list kosong
            head = ndInput;//head dan tail sama dengan node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
}
