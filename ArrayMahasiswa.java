/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataMahasiswa;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class ArrayMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Mahasiswa[] mhsArray = new Mahasiswa[3];
        
      
        
        for(int i = 0; i < 3; i++){
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan nama :");
            String n = sc.nextLine();
            System.out.print("Masukkan nim :");
            int nm = sc.nextInt();
            System.out.println("Masukkan jenis kelamin :");
            String jk = sc.nextLine();
            System.out.print("Masukkan IPK :");
            double ip = sc.nextDouble();
            mhsArray[i] = new Mahasiswa(n, nm, jk, ip);
        }
    
          System.out.println("nama : " + mhsArray[0].nama);
          System.out.println("nim : " + mhsArray[0].nim);
          System.out.println("Jenis kelamin : " + mhsArray[0].jenisKelamin);
          double a = mhsArray[0].ipk;
          System.out.println("Nilai IPK : " + a);
          System.out.println("");
           System.out.println("nama : " + mhsArray[1].nama);
          System.out.println("nim : " + mhsArray[1].nim);
          System.out.println("Jenis kelamin : " + mhsArray[1].jenisKelamin);
          double b = mhsArray[1].ipk;
          System.out.println("Nilai IPK : " + b);
          System.out.println("");
           System.out.println("nama : " + mhsArray[2].nama);
          System.out.println("nim : " + mhsArray[2].nim);
          System.out.println("Jenis kelamin : " + mhsArray[2].jenisKelamin);
          double c = mhsArray[2].ipk;
          System.out.println("Nilai IPK : " + c);
          System.out.println("");
          
          double d = (a + b + c) / 3;
          System.out.println("IPK Rata-rata seluruh mahasiswa : " + d);
    }
}
