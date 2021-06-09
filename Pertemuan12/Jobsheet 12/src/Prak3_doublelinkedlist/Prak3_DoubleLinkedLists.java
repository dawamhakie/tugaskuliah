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
public class Prak3_DoubleLinkedLists {
    Prak3_Node head;
    int size;
    
    public Prak3_DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int item){
        if(isEmpty()){
            head = new Prak3_Node(null, item, null);
        } else {
            Prak3_Node newNode = new Prak3_Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        } else {
            Prak3_Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Prak3_Node newNode = new Prak3_Node(current, item, null);
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
            Prak3_Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Prak3_Node newNode = new Prak3_Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Prak3_Node newNode = new Prak3_Node(current.prev, item, current);
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
            Prak3_Node tmp = head;
            while(tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dhapus!");
        } else if(size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Prak3_Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void remove(int index){
        if(isEmpty() || index >= size){
            System.out.println("Nilai indeks di luar batas");
        } else if(index == 0){
            removeFirst();
        } else {
            Prak3_Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            } else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public int getFirst(){
        if(isEmpty()){
            System.out.println("Linked List Kosong");
        }
        return head.data;
    }
    
    public int getLast(){
        if(isEmpty()){
            System.out.println("Linked List kosong");
        }
        Prak3_Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int get(int index){
        if(isEmpty() || index >= size){
            System.out.println("Nilai indeks di luar batas!");
        }
        Prak3_Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
