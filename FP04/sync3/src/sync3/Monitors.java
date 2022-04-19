/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sync3;

/**
 *
 * @author Asus
 */
public class Monitors extends Thread {
    CriticaUm C;
    public Monitors(String nomeObjeto){
        Thread Thread_a, Thread_b;
        C = new CriticaUm();
        Thread_a = new Thread(this, nomeObjeto + ":Thread a");
        Thread_b = new Thread(this, nomeObjeto + ":Thread b");
        Thread_a.start();
        Thread_b.start();
    }
    
    @Override
    public void run(){
        C.method_A();
        C.method_B(); 
    }
}
