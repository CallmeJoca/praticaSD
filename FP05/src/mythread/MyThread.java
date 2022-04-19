/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythread;

/**
 *
 * @author Asus
 */
public class MyThread extends Thread {
    public MyThread(){
        super();
    }
    public void run(){
        System.out.println("Hello there, from " + getName());
    }
    /**
     * @param args the command line arguments
     */
}
