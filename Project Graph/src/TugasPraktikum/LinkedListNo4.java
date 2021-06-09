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
public class LinkedListNo4 {
    NodeNo4 head;
    int size;
 
    public LinkedListNo4(){
        head = null;
        size = 0;
    }
 
    public boolean isEmpty(){
        return head == null;
    }
 
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new NodeNo4(null, item, null);
        } else {
            NodeNo4 newNode = new NodeNo4(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
 
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeNo4 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeNo4 newNode = new NodeNo4(current, item, null);
            current.next = newNode;
            size++;
        }
    }
 
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks di luarbatas");
        } else {
            NodeNo4 current = head;
            int i = 0;
            while (i< index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeNo4 newNode = new NodeNo4(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeNo4 newNode = new NodeNo4(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
 
    public int size() {
        return size;
    }
 
    public void clear() {
        head = null;
        size = 0;
    }
 
    public void print() {
        if (!isEmpty()) {
            NodeNo4 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasildiisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
 
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masing kosong, tidakdapatdihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
 
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masihkosong, tidakdapatdihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeNo4 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
 
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luarbatas");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeNo4 current = head;
            int i = 0;
            while (i< index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
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
 
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
 
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        NodeNo4 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
 
    public int get(int index) throws Exception {
        if (isEmpty() ||  index >= size) {
            throw new Exception("Nilai indeks di luarbatas.");
        }
        NodeNo4 tmp = head;
        for (int i = 0; i< index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
