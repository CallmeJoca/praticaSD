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
public class Reentrant {

    static int times = 1;
    
    public synchronized void myMethod(){
        int i = times++;
        System.out.println("myMethod has started" + i + "time(s)");
        while(times < 4)
            myMethod();
        System.out.println("myMethod has existed" + i + "time(s)");
    }
}
