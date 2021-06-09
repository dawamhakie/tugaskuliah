/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class MainTiket {
    public static void main(String[] abcd) {
        Scanner sc = new Scanner(System.in);
        TiketService list = new TiketService();
        System.out.print("Nama maskapai     : ");
        String nm = sc.nextLine();
        System.out.print("Harga Tiket       : ");
        int hrg = sc.nextInt();
        System.out.print("Asal        : ");
        String asl = sc.nextLine();
        System.out.print("Tujuan        : ");
        String tj = sc.nextLine();
        Tiket t1 = new Tiket(nm, hrg, asl, tj);
        
        System.out.print("Nama maskapai     : ");
        String nm1 = sc.nextLine();
        System.out.print("Harga Tiket       : ");
        int hrg1 = sc.nextInt();
        System.out.print("Asal        : ");
        String asl1 = sc.nextLine();
        System.out.print("Tujuan        : ");
        String tj1 = sc.nextLine();
        Tiket t2 = new Tiket(nm1, hrg1, asl1, tj1);
        
        System.out.print("Nama maskapai     : ");
        String nm2 = sc.nextLine();
        System.out.print("Harga Tiket       : ");
        int hrg2 = sc.nextInt();
        System.out.print("Asal        : ");
        String asl2 = sc.nextLine();
        System.out.print("Tujuan        : ");
        String tj2 = sc.nextLine();
        Tiket t3 = new Tiket(nm2, hrg2, asl2, tj2);
        
        System.out.print("Nama maskapai     : ");
        String nm3 = sc.nextLine();
        System.out.print("Harga Tiket       : ");
        int hrg3 = sc.nextInt();
        System.out.print("Asal        : ");
        String asl3 = sc.nextLine();
        System.out.print("Tujuan        : ");
        String tj3 = sc.nextLine();
        Tiket t4 = new Tiket(nm3, hrg3, asl3, tj3);
        
        System.out.print("Nama maskapai     : ");
        String nm4 = sc.nextLine();
        System.out.print("Harga Tiket       : ");
        int hrg4 = sc.nextInt();
        System.out.print("Asal        : ");
        String asl4 = sc.nextLine();
        System.out.print("Tujuan        : ");
        String tj4 = sc.nextLine();
        Tiket t5 = new Tiket(nm4, hrg4, asl4, tj4);
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        
        System.out.println("Data tiket sebelum sorting : ");
        list.tampilAll();
        
        System.out.println("Data tiket setelah sorting berdasarkan harga : ");
        list.bubbleSort();
        list.tampilAll();
        
        System.out.println("Data tiket setelah sorting selectionsort : ");
        list.selectionSort();
        list.tampilAll();
    }
}
