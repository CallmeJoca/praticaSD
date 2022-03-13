import java.io.*;

public class testwrite {
    public static void main (String args[]){
        
        int id = 1;

        cafe c1 = new cafe(id+0);
        cafe c2 = new cafe(id+1);
        cafe c3 = new cafe(id+2);

        System.out.println(c1.tostring());
        System.out.println(c2.tostring());
        System.out.println(c3.tostring());

        try {
            FileOutputStream outF = new FileOutputStream("C:\\Users\\Asus\\Desktop\\teste3.txt");

            ObjectOutputStream outO = new ObjectOutputStream(outF);

            outO.writeObject(c1);
            outO.writeObject(c2);
            outO.writeObject(c3);

            outO.flush();
            outO.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
