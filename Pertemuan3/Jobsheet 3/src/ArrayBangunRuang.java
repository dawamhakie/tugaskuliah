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
public class ArrayBangunRuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Volume Balok & Luas Permukaan Balok----------");
        System.out.println("");
        System.out.print("Masukkan Banyaknya Balok: ");
        System.out.print("");
        int n = sc.nextInt();
        Balok[] volumeBalok = new Balok[n];
        Balok[] luasPermukaanBalok = new Balok[n]; 
        
        for(int i = 0; i < n; i++){
            System.out.println("Balok ke-" + i);
            System.out.print("Masukkan Panjang Balok ke-" + i + ": ");
            int q = sc.nextInt();
            System.out.print("Masukkan Lebar Balok ke-" + i + ": ");
            int w = sc.nextInt();
            System.out.print("Masukkan Tinggi Balok ke-" + i + ": ");
            int e = sc.nextInt();
            System.out.println("");
            volumeBalok[i] = new Balok(q, w, e);
            System.out.print("Volume Balok ke-" + i + ": " + volumeBalok[i].hitungVolume());
            System.out.println("");
            luasPermukaanBalok[i] = new Balok(q, w, e);
            System.out.print("Luas Permukaan Balok ke-" + i + ": " + luasPermukaanBalok[i].hitungLuasPermukaan());
            System.out.println("");
            System.out.println("");
         }
        
        System.out.println("----------Volume Kubus & Luas Permukaan Kubus----------");
        System.out.println("");
        System.out.print("Masukkan Banyaknya Kubus: ");
        System.out.print("");
        int o = sc.nextInt();
        Kubus[] volumeKubus = new Kubus[o];
        Kubus[] luasPermukaanKubus = new Kubus[o];
        
        for(int i = 0; i < o; i++){
            System.out.println("Kubus ke-" + i);
            System.out.print("Masukkan Sisi Kubus ke-" + i + ": ");
            int s = sc.nextInt();
            System.out.println("");
            volumeKubus[i] = new Kubus(s);
            System.out.print("Volume Kubus ke-" + i + ": " + volumeKubus[i].hitungVolume());
            System.out.println("");
            luasPermukaanKubus[i] = new Kubus(s);
            System.out.print("Luas Permukaan Kubus ke-" + i + ": " + luasPermukaanKubus[i].hitungLuasPermukaan());
            System.out.println("");
            System.out.println("");
         }
        
        System.out.println("----------Volume Tabung & Luas Permukaan Tabung----------");
        System.out.println("");
        System.out.print("Masukkan Banyaknya Tabung: ");
        System.out.print("");
        int p = sc.nextInt();
        Tabung[] volumeTabung = new Tabung[p];
        Tabung[] luasPermukaanTabung = new Tabung[p];
        
        for(int i = 0; i < p; i++){
            System.out.println("Tabung ke-" + i);
            System.out.print("Masukkan jari-jari Tabung ke-" + i + ": ");
            int j = sc.nextInt();
            System.out.print("Masukkan Tinggi Tabung ke-" + i + ": ");
            int t = sc.nextInt();
            System.out.println("");
            volumeTabung[i] = new Tabung(j, t);
            System.out.print("Volume Tabung ke-" + i + ": " + volumeTabung[i].hitungVolume());
            System.out.println("");
            luasPermukaanTabung[i] = new Tabung(j, t);
            System.out.print("Luas Permukaan Tabung ke-" + i + ": " + luasPermukaanTabung[i].hitungLuasPermukaan());
            System.out.println("");
            System.out.println("");
         }
    }
}
