/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer2;

/**
 *
 * @author USER
 */
public class PremierLeagueService {
    PremierLeague leagues[] = new PremierLeague[20];
    int indeks;
    
    void tambah(PremierLeague t){
        if(indeks < leagues.length){
            leagues[indeks] = t;
            indeks++;
        } else {
            System.out.println("Tidak ada data lain");
    }
}
    
    void tampilAll(){
      for(PremierLeague t : leagues){
          t.tampilAll();
          System.out.println("----------------------");
      }  
    }
    
    void insertionSort(){
        for(int i = 1; i < leagues.length; i++){
            PremierLeague temp = leagues[i];
            int j = i;
            while(j > 0 && leagues[j - 1].points > temp.points){
                leagues[j] = leagues[j - 1];
                j--;
            }
            leagues[j] = temp;
        }
}
}
