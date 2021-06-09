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
public class PremierLeague {
    String team;
    int play, goal, points;
    
    PremierLeague(String t, int p, int g, int pt){
       team = t;
       play = p;
       goal = g;
       points = pt;
    }
    
    void tampilAll(){
        System.out.println("Team    : " + team);
        System.out.println("Bermain : " + play);
        System.out.println("Gol     : " + goal);
        System.out.println("Points  : " + points);
    }
}
