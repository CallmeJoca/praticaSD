import java.net.*;
import java.io.*;


public class Connection extends Thread {
    
    private Socket S;

    public Connection (Socket s){
        super();
        S = s;
        start();
    }

    public void run(){
        try {
            ObjectOutputStream os = new ObjectOutputStream(S.getOutputStream());
            os.writeObject("A data e hora do sistema" + new java.util.Date());
            os.flush();
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}
