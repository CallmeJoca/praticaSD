import java.net.*;
import java.io.*;


public class IPtoName {
    public static void main(String[] args) throws Exception {
        String s = "";
        char c;
        String hostName = "";
        System.out.println("IP Address: ");
        while((c = (char) System.in.read()) != 10){
            s += c;
        }
        s = s.trim();
        System.out.println(s);
        InetAddress host = null;
        try {
            host = host.getByAddress(s.getBytes());
            hostName = host.getHostName();
            System.out.println(hostName);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
