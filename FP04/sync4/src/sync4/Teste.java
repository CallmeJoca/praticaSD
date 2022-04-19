/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sync4;

/**
 *
 * @author Asus
 */
public class Teste extends Thread{
    
    Reentrant R;
    public Teste(){
        R = new Reentrant();
        Thread T = new Thread(this);
        T.start();
    }
    public void run(){
        R.myMethod();
    }
    public static void main(String[] args) {
        Teste T1 = new Teste();
    }
}
