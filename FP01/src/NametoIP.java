import java.net.*;
import java.io.*;

public class NametoIP {
    
    public static void main(String[] args){
        String s = "";
        char c;
        InetAddress host = null;
        System.out.print("Host Name: ");

        try {
            while((c = (char) System.in.read()) != '\n'){
                s += c;
            }
            s = s.trim();
            host = host.getByName(s);
            System.out.println("Host IP is " + host.getHostAddress());

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
    }

}
