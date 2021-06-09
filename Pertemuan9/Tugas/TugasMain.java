/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class TugasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat yang diinginkan: ");
        String kal = sc.nextLine();
        Tugas tgs = new Tugas(kal.length());
        System.out.println("Hasil : ");
        tgs.PrintBalik(kal);
    }
}