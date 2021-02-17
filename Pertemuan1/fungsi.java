/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class fungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pilihan Menu :");
        System.out.println("1. Menghitung luas segitiga");
        System.out.println("2. Menghitung luas persegi panjang");
        System.out.println("3. Menghitung luas lingkaran");
        System.out.println("");
        System.out.print("Pilih Menu (1-3) : ");
        int pilih = sc.nextInt();
        if(pilih == 1){
         int menu = luasSegitiga(pilih);
        } else if (pilih == 2){
         int menu = luasPersegiPanjang(pilih);
        } else if (pilih == 3){
         int menu = luasLingkaran(pilih);
        } else {
          System.out.println("Tidak ada menu");
        }
       
    }
    static int luasSegitiga(int a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Alas : ");
        int p = sc.nextInt();
        System.out.print("Masukkan TInggi : ");
        int q = sc.nextInt();
        double luas = 0.5 * p * q;
        System.out.print("Luas segitiga : " + luas);
     return a;   
    }
    static int luasPersegiPanjang(int b){
       Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int p = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        int l = sc.nextInt();
        int luas = p * l;
        System.out.print("Luas persegi panjang : " + luas);
        return b;
    }
    static int luasLingkaran(int c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jari-jari : ");
        int r = sc.nextInt();
        double luas = 22/7 * r * r;
        System.out.println("Luas lingkaran : " + luas);
        return c;
    }
}
