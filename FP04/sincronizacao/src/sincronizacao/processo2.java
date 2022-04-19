package sincronizacao;

/**
 *
 * @author Asus
 */
public class processo2 extends Thread {
    
    private Sincronizacao m;
    
    public processo2(Sincronizacao M){
        super();
        this.m = M;
        setDaemon(true);
    }
    @Override
    public void run(){
        
        int temp;
        
        while(true){
            synchronized(this.m){
                temp = this.m.getVariavelPart() + 1;
                this.m.setVariavelPart(temp);
            }
        }
        
    }
    
}
