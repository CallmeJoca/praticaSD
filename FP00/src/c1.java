import java.io.*;


public class c1 {
    public static void main (String args[]){
        BufferedWriter bw;
        BufferedReader br;
        String buffer;
        try {
            bw = new BufferedWriter ( new FileWriter ("C:\\Users\\Asus\\Desktop\\teste1.txt"));
            bw.write("1");
            bw.newLine();
            bw.write("2");
            bw.flush();
            bw.close();


            br = new BufferedReader( new FileReader ("C:\\Users\\Asus\\Desktop\\teste1.txt"));
            buffer = br.readLine();
            System.out.println(buffer);
            buffer = br.readLine();
            System.out.println(buffer);
            br.close();

            }
        catch (IOException e){
            System.out.println(e.getMessage());
            }
        }
        
}
