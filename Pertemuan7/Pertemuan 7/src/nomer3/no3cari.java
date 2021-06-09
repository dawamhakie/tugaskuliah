/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer3;

/**
 *
 * @author USER
 */
public class no3cari {
    nomer3 array[][] = new nomer3[3][5];
   /* array = new int [][]{
        {45, 78, 7, 200, 80},
        {90, 1, 17, 100, 50},
        {21, 2, 40, 18, 65}
    };*/
        
    public int FindSeqSearch(int cari){
       int posisi = -1;
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 5; i++){
           /* if(array[j][i] == cari){
                posisi = j;
                break;
            }*/    
        }
     }
        return posisi;
   }
    
    void TampilPosisi(int x, int brs, int klm){
        if(brs != -1 && klm != -1){
            System.out.println("data : " + x + "ditemukan pada baris ke-" + brs + "kolom ke-" + klm);
        } else{
            System.out.println("data: " + x + "tidak ditemukan");
        }
    }
}
