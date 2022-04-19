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
public class CriticaUm {

    public synchronized void method_A(){
        System.out.println(Thread.currentThread().getName() + " Método A");
        try{
            Thread.sleep((int) Math.round(Math.random()*5000));
        }
        catch(InterruptedException e)
        {System.out.println(e.getMessage());}
        System.out.println(Thread.currentThread().getName() + " Saindo do Método A");
    }
    public static synchronized void method_B(){
            System.out.println(Thread.currentThread().getName() + " Método B");
            try{
            Thread.sleep((int) Math.round(Math.random()*5000));
        }
        catch(InterruptedException e)
        {System.out.println(e.getMessage());}
        System.out.println(Thread.currentThread().getName() + " Saindo do Método B");
    }
    
}
