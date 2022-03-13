import java.io.*;


public class testread {
    public static void main (String args[]){

        try {
            FileInputStream fins = new FileInputStream("C:\\Users\\Asus\\Desktop\\teste3.txt");

            ObjectInputStream oins = new ObjectInputStream(fins);

            while(oins != null){
                System.out.println((cafe) oins.readObject());
            }
            oins.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }    
}
