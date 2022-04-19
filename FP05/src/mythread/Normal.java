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
public class Normal extends Thread{
    public Normal(){
        super();
    }
    @Override
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            try{
                sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("I'm the normal thread");
        }
        System.out.println("The normal thread is exiting");
    }
}
