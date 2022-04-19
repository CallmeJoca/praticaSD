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
public class MyThread2 implements Runnable{
    //public MyThtread2(){}
    @Override
    public void run(){
        System.out.println("Hi there, from " + Thread.currentThread().getName() );
    } 
}