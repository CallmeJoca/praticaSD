import java.io.*;

public class readFile {
    public static void main(String[] args){

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\Desktop\\userText.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(ois != null){
                System.out.println(ois.readObject());
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
