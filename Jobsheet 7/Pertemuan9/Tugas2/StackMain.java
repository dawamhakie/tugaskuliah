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
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        Tugas2 s = new Tugas2(8);
        int menu;
        char pilih;
        
        do{
            System.out.println("------------------Menu------------------");
            System.out.println("1. Push data");
            System.out.println("2. Pop data");
            System.out.println("3. Peek data");
            System.out.println("4. Print data");
            System.out.println("--------------");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Nomor Transaksi : ");
                    String nmr = sc.next();
                    System.out.print("Tanggal : ");
                    String Tanggal = sc.next();
                    System.out.print("Jumlah Barang : ");
                    int jumlahBarang = sc.nextInt();
                    System.out.print("Total Harga : ");
                    int totalHarga = sc.nextInt();
               
                    
                    Struk stu = new Struk(nmr, Tanggal, jumlahBarang, totalHarga);
                    s.push(stu);
                    break;
                    
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.print();
                    break;
            }
            System.out.println("Apakah ingin kembali ke menu (y/n)? : ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        } while (pilih == 'y');
    }
}
