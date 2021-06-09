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
public class TiketService {
    int indeks ;
  
    Tiket tikets[] = new Tiket[5];
    
  
    void tambah(Tiket t){
        if(indeks < tikets.length){
            tikets[indeks] = t;
            indeks++;
        } else {
            System.out.println("Data Penuh");
        }
    }
    
    void tampilAll(){
        for(Tiket t : tikets){
            t.tampilAll();
            System.out.println("--------------------------");
        }
    }
    
    void bubbleSort(){
        for(int i = 0; i < tikets.length - 1; i++){
            for(int j = 1; j < tikets.length - 1; j++){
                if(tikets[j].harga > tikets[j - 1].harga){
                    Tiket tampil = tikets[j];
                    tikets[j] = tikets[j - 1];
                    tikets[j - 1] = tampil;
                }
            }
        }
    }
    
    void selectionSort(){
        for(int i = 0; i < tikets.length - 1; i++){
            int idxMin = i;
            for(int j = i + 1; j < tikets.length; j++){
                if(tikets[j].harga < tikets[idxMin].harga){
                      idxMin = j;
                }
            }
            Tiket tampil = tikets[idxMin];
            tikets[idxMin] = tikets[i];
            tikets[i] = tampil;
        }
    }
}