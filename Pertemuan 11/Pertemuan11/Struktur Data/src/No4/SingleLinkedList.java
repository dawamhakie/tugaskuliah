/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

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
            int urut = 0;
            System.out.println("Antrian : ");
            while (tmp != null) {
                System.out.println("Nasabah ke-" + urut + " = " + tmp.noRek + " "
                        + tmp.nama + " " + tmp.alamat);
                tmp = tmp.next;
                urut++;
            }
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void antrianDepan() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Antrian paling depan : \n"
                    + tmp.noRek + " " + tmp.nama + " " + tmp.alamat);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void antrianBelakang() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                if (tmp == tail) {
                    System.out.println("Antrian paling belakang : \n" + tmp.noRek
                            + " " + tmp.nama + " " + tmp.alamat);
                }
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void tambahData(String nomorRekening, String nama, String alamat) {
        Node ndInput = new Node(nomorRekening, nama, alamat, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void cariDataIndex(int index) {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong");
        } else {
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada Index ke-" + index + " adalah " + tmp.noRek
                    + " " + tmp.nama + " " + tmp.alamat);
        }
    }

    public void cariDataNoRek(String key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && (!(tmp.noRek.equals(key)))) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Data " + key + " berada pada index ke " + index);
        }
        System.out.println("Data nasabah : \n" + tmp.noRek + " " + tmp.nama + " "
                + tmp.alamat);
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
}
