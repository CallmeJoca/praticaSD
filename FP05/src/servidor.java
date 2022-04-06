import java.io.*;
import java.net.*;

public class servidor {
    
    private ServerSocket ss;
    private Socket s;
    private Connection c;

    public servidor(){

        try {
            ss = new ServerSocket(5432);
            s = ss.accept();
            c = new Connection (s);
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        servidor dataHora = new servidor();
    }
}
