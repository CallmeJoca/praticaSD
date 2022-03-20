public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    public void run(){
        while(true){
            System.out.println("Hello there, from " + this.getName());
            if(isInterrupted())
                break;
            Thread.yield();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        
    }
}
