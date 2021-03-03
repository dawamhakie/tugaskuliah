/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class laundry {
    public static void main(String[] args) {
        
        int tarif = 4500;
        double total;
        
        //customer ani
        System.out.println("Customer Ani 4kg pakaian :");
        double customer1 = perhitungan(4, 4 * tarif);
        //customer Budi
        System.out.println("Customer Budi 15kg pakaian :");
        double customer2 = perhitungan(15, 15 * tarif);
        //customer Bina
        System.out.println("Customer Bina 6kg pakaian :");
        double customer3 = perhitungan(6, 6 * tarif);
        //customer Cita
        System.out.println("Customer Cita 11kg pakaian :");
        double customer4 = perhitungan(11, 11 * tarif);
        
        total = customer1 + customer2 + customer3 + customer4;
        
       System.out.println("Pendapat Smile laundry pada hari itu adalah " + total);
       
       
    }
    static double perhitungan(int a, double b){
        if(a > 10){
          double n = b - (b * 5/100);
            System.out.println(n);
          return n;
        } else {
            System.out.println(b);
          return b;
        }
    }
}
