import java.io.*;

public class c2 {
    public static void main (String args[]){
        PrintWriter pw;
        
        try {
        pw = new PrintWriter ( new FileWriter ("C:\\Users\\Asus\\Desktop\\teste2.txt"));
        pw.println(2.31);
        pw.println(false);
        pw.print("X");
        pw.flush();
        pw.close();

        

        }
        catch (IOException e){
        System.out.println(e.getMessage());
        }
        }
}
