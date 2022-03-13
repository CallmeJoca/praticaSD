import java.net.*;

public class GetName {
    public static void main(String[] args) throws Exception {
        InetAddress host = null;
        host = InetAddress.getLocalHost();
        System.out.println(host.getHostName()); //print Host name

        byte ip [] = host.getAddress();
        for ( int i= 0 ; i < ip.length; i++){
            if (i>0) System.out.print(".");
            System.out.print(ip[i] & 0xff); //print IP
        }
    }
}