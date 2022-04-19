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
public class MyThread5 extends Thread{
    
    public MyThread5(String name){
        super(name);
    }
    
    @Override
    public void run(){
        while(true){
            System.out.println("Sou a " + this.getName());
            if(isInterrupted())
                break;
            Thread.yield();
        }
    }
    
}
