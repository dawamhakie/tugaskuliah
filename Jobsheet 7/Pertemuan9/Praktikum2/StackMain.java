/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Buku st = new Buku(8);
        Scanner sc = new Scanner(System.in);
        
        char pilih;
        do{
            System.out.println("--------------------");
            System.out.println("\t Pilihan Pengecekan");
            System.out.println("--------------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.print("Pilih : ");
           int p = sc.nextInt();
            
            
            Buku bk = new Buku(p);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);
        } while(pilih == 'y');
        
        st.print();
        st.pop();
        st.peek();
        st.print();
    }
}
