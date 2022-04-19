package sincronizacao;

public class processo1 extends Thread {
    
    private Sincronizacao m;
    
    public processo1(Sincronizacao M){
        super();
        this.m = M;
        
    }
    @Override
    public void run(){
        System.out.println("P1 a correr");

        int x = this.m.getVariavelPart();
        int y = -1 * this.m.getVariavelPart();
        while(true){
            synchronized (this.m){
                x = x - this.m.getVariavelPart();
                y = y + this.m.getVariavelPart();
                System.out.println("X: " + x + " Y: " + y);
                if(x + y != 0){
                    System.out.println("Secção critica violada");
                    break;
                }   
            }
        }
    }
}
