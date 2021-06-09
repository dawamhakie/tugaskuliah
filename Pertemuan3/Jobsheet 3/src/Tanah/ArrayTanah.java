/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanah;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class ArrayTanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah Tanah: ");
        int n = sc.nextInt();
        System.out.println("");
        
        Tanah[] luasTanah = new Tanah[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Tanah " + (i + 1));
            System.out.print("Panjang: ");
            int p = sc.nextInt();
            System.out.print("Lebar: ");
            int l = sc.nextInt();
            System.out.print("");
            luasTanah[i] = new Tanah(p, l);
            
        }
        System.out.println("");
        int a = luasTanah[0].hitungLuas();
        System.out.println("Luas Tanah " + 1 + ": " + a); 
        int b = luasTanah[1].hitungLuas();
        System.out.println("Luas Tanah " + 2 + ": " + b);
        int c = luasTanah[2].hitungLuas();
        System.out.println("Luas Tanah " + 3 + ": " + c); 
        System.out.println("");
        if(a > b && a > c){
        System.out.print("Tanah terluas: Tanah 1"); 
        } else if(b > a && b > c){
        System.out.print("Tanah terluas: Tanah 2");
        } else {
        System.out.print("Tanah terluas: Tanah 3");    
        }
        
    }
}
