public class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Hi there, from " + Thread.currentThread().getName());
    }
}
