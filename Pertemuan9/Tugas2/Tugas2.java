/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author USER
 */
public class Tugas2 {
    int size, top;
    Struk data[];
    
    public Tugas2(int size){
        this.size = size;
        data = new Struk[size];
        top = -1;
    }
    
    public boolean IsEmpty(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if(top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    
    public void push(Struk dt){
        if(!IsFull()){
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    
    public void pop(){
        if(!IsEmpty()){
            Struk x = data[top];
            top--;
            System.out.println("Data yang Keluar : " + x.nomorTransaksi + ""
            + x.tanggal + "" + x.jumlahBarang + "" + x.totalHarga + "");
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas : " + data[top].nomorTransaksi + ""
        + data[top].tanggal + "" + data[top].jumlahBarang + "" + data[top].totalHarga
        + "");
    }
    
    public void print(){
        System.out.println("Isi Stack : ");
        for(int i = top; i >= 0; i--){
            System.out.println(data[i].nomorTransaksi + "" + data[i].tanggal + ""
            + data[i].jumlahBarang + "" + data[i].totalHarga + "");
        }
        System.out.println("");
    }
    
    public void clear(){
        if(!IsEmpty()){
            for(int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
