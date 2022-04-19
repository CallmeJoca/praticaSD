/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacinema;

/**
 *
 * @author Asus
 */
public class teste {
    
    public static void main(String[] args) {
        SalaCinema sc = new SalaCinema("movie name", 200);
        SalaCinema sc2 = new SalaCinema("movie name the sequel", 200);
        
        posto p1 = new posto(sc, "posto 1");
        posto p2 = new posto(sc, "posto 2");
        posto p3 = new posto(sc2, "posto 3");
        posto p4 = new posto(sc2, "posto 4");
    }
    
}
