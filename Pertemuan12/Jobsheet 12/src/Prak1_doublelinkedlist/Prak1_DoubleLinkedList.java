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
public class Prak1_DoubleLinkedList {
    Prak1_Node head;
    int size;
    
    public Prak1_DoubleLinkedList(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int item){
        if(isEmpty()){
            head = new Prak1_Node(null, item, null);
        } else {
            Prak1_Node newNode = new Prak1_Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        } else {
            Prak1_Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Prak1_Node newNode = new Prak1_Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(int item, int index){
        if(isEmpty()){
            addFirst(item);
        } else if(index < 0 || index > size){
            System.out.println("Nilai indeks di luar batas");
        } else {
            Prak1_Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Prak1_Node newNode = new Prak1_Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Prak1_Node newNode = new Prak1_Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if(!isEmpty()){
            Prak1_Node tmp = head;
            while(tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
