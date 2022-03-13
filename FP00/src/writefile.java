import java.io.*;
import java.util.*;

public class writefile {
    
    public static void main(String[] args) {
        try {
            String user_text;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\Desktop\\userText.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            do{
                user_text = br.readLine();
                System.out.println(user_text);
                oos.writeObject(user_text);
                
            }while(user_text != "\n");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
