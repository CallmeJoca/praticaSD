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
public class Thread3 extends Thread{
    
    private final int[] a,b,c;
    private final int first, last;
    
    public Thread3(int[] A, int[] B, int[] C, int p, int u){
        this.a = A;
        this.b = B;
        this.c = C;
        this.first = p;
        this.last = u;
    }
    @Override
    public void run(){
        
        for(int i = this.first; i <= this.last; i++){
            this.c[i] = this.a[i] + this.b[i];
        }
    }
}
