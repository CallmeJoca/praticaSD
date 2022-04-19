/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacao;

public class teste {
    
    public static void main(String[] args) {
        
        Sincronizacao m = new Sincronizacao(0);
        
        processo1 p1 = new processo1(m);
        processo2 p2 = new processo2(m);
        
        p1.start();
        p2.start();
        
    }
    
}
