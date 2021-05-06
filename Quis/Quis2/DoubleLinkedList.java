/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis2;

/**
 *
 * @author USER
 */
public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nim, String nama, String jurusan, String prodi, String ipk) {
        if (isEmpty()) {
            head = new Node(null, nim, nama, jurusan, prodi, ipk, null);
        } else {
            Node newNode = new Node(null, nim, nama, jurusan, prodi, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nim, String nama, String jurusan, String prodi, String ipk) {
        if (isEmpty()) {
            addFirst(nim, nama, jurusan, prodi, ipk);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nim, nama, jurusan, prodi, ipk, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int nim, String nama, String jurusan, String prodi, String ipk, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nim, nama, jurusan, prodi, ipk);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, nim, nama, jurusan, prodi, ipk, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nim, nama, jurusan, prodi, ipk, current);
                newNode.prev = newNode;
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
            Node tmp = head;
            System.out.println("NIM\t\t\t Nama \t\t\t Jurusan \t\t Prodi \t\t\t IPK");
            while (tmp != null) {
                System.out.print(tmp.nim + "\t\t\t");
                System.out.print(tmp.nama + "\t\t\t");
                System.out.print(tmp.jurusan + "\t\t\t");
                System.out.print(tmp.prodi + "\t\t\t");
                System.out.print(tmp.ipk + "\t\t\t");
                System.out.println("");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
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
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
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

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return (head.nim + head.nama + head.jurusan + head.prodi + head.ipk);
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return (tmp.nim + tmp.nama + tmp.jurusan + tmp.prodi + tmp.ipk);
    }

    public void search(int search) {
        int i = 0;
        boolean cek = false;
        Node current = head;
        if (head == null) {
            System.out.println("List kosong");
            return;
        }
        while (current != null) {
            if (current.data == search) {
                cek = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (cek) {
            System.out.println("Data " + search + " ditemukan pada index ke : " + i);
        } else {
            System.out.println("Index tidak ditemukan");
        }
    }
    

    public void sort() {
        Node current = head, index = null;
        String temp, tmpn;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (Integer.parseInt(current.ipk) < Integer.parseInt(index.ipk)) {
                        temp = current.ipk;
                        current.ipk = index.ipk;
                        index.ipk = temp;
                        tmpn = current.nama;
                        current.nama = index.nama;
                        index.nama = tmpn;
                    }
                }
            }
        }
    }        
       /* public void selectionSort(boolean bool){
        Node current = head, index = null;
        int temp;
        if (head == null) {
            //return;
        }else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                        if (current.data< index.data) {
                            temp = (int) (double) current.data;
                            current.data= index.data;
                            index.data = temp;
                        }
                    index = index.next;
                }
            }
        }*/
    

    
   /* public int FindBinarySearch(int cari, int left, int right){
        int mid;
        Node current = null;
        if(right >= left){
            mid = (left + right) / 2;
            if(current.nim == cari){
                return current.data;
            } else if(current.nim > cari){
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
         return -1;
    }*/
}
    
  