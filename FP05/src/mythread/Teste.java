/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythread;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Asus
 */

public class Teste {
    
    static int[] randomness(int length){
        Random rand = new Random();
        int[] a = new int[length];
        for (int i = 0; i < length; i++){
            a[i] = rand.nextInt(5);
        }
        return a;
    }
    
    public static void main(String[] args) {
        
        //exercicio 1
        MyThread Ta, Tb;
        Ta = new MyThread();
        Tb = new MyThread();
        Ta.start();
        Tb.start();
        
        //exercicio 2
        MyThread2 T = new MyThread2();
        Thread Tc, Td;
        Tc = new Thread(T);
        Td = new Thread(T);
        Tc.start();
        Td.start();
        
        //exercicio 3
        int length = 1000000;
        
        int[] A = Teste.randomness(length);
        int[] firstHalfA  = Arrays.copyOfRange(A,   0    , length/2);
        int[] secondHalfA = Arrays.copyOfRange(A, length/2, length);
        
        int[] B = Teste.randomness(length);
        int[] firstHalfB  = Arrays.copyOfRange(B,   0    , length/2);
        int[] secondHalfB = Arrays.copyOfRange(B, length/2, length);
        
        int[] C           = new int[length];
        int[] firstHalfC  = new int[length/2];
        int[] secondHalfC = new int[length/2];
        
        int p = 0;
        int u = length/2-1;
        
        Thread3 addFirstArrays = new Thread3(firstHalfA, firstHalfB, firstHalfC, p, u);
        Thread3 addSecondArrays = new Thread3(secondHalfA, secondHalfB, secondHalfC, p, u);
        
        long threadStartTime = System.currentTimeMillis();
        addFirstArrays.start();
        addSecondArrays.start();
        
        try {
            addFirstArrays.join();
            addSecondArrays.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());;
        }
        long threadEndTime = System.currentTimeMillis();
        //------------------------------------------------
        long sequenceStartTime = System.currentTimeMillis();
        for(int i = p; i < length; i++){
            C[i] = A[i] + B[i];
        }
        long sequenceEndTime = System.currentTimeMillis();
        //------------------------------------------------
        long threadTime = threadEndTime - threadStartTime;
        long sequenceTime = sequenceEndTime - sequenceStartTime;
        System.out.println("Thread time: " + threadTime);
        System.out.println("Sequence time: " + sequenceTime);
        
        //exercicio 4
        Normal ThreadNormal = new Normal();
        Daemon ThreadDaemon = new Daemon();
        
        ThreadNormal.start();
        ThreadDaemon.start();
        
        try {
            ThreadNormal.join();
            ThreadDaemon.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());;
        }
        
        //exercicio 5
        MyThread5 Te, Tf, Tg;
        ThreadGroup this_group = Thread.currentThread().getThreadGroup();
        System.out.println("O nome do grupo é " + this_group.getName());
        System.out.println("O nº de threads activas no grupo é " + this_group.activeCount());
        
        Te = new MyThread5("Thread A");
        Tf = new MyThread5("Thread B");
        Tg = new MyThread5("Thread C");
        
        Te.start();
        Tf.start();
        Tg.start();
        
        System.out.println("O nome do grupo é " + this_group.getName());
        System.out.println("O nº de threads activas no grupo é " + this_group.activeCount());
        
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        this_group.interrupt();
        
    }
}
