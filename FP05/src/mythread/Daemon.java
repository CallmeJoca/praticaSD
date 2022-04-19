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
public class Daemon extends Thread{
    public Daemon(){
        super();
        //setDaemon(true);
    }
    @Override
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            try{
                sleep(500);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("I'm a daemon thread");
        }
    }
}
