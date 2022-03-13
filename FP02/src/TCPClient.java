/**
 *
 * @author Joca
 */
import java.net.*;
import java.io.*;

public class TCPClient {
    public TCPClient(){
        
        ObjectOutputStream os;
        ObjectInputStream is;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        String clientMessage;
        String serverMessage = "";
        
        try{
            Socket sc = new Socket ("127.0.0.1", 2222);
            while(true){
                    os = new ObjectOutputStream(sc.getOutputStream());
                    is = new ObjectInputStream(sc.getInputStream());
                    
                while(!serverMessage.equals("fim")){
                    
                    clientMessage = reader.readLine();
                
                    os.writeObject(clientMessage);
                    os.flush();
                
                    serverMessage = (String) is.readObject();
                    System.out.println(serverMessage);
                }
                os.close();
                is.close();
                sc.close();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TCPClient c = new TCPClient();
    }
    
}
