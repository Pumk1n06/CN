import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            System.out.println("CLient connected");
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            BufferedReader br = new BufferedReader(new FileReader(str));
            while(true)
            {
                String s1=br.readLine();
                if(s1==null) break;
                System.out.println(s1);
            }
            ss.close();
        }

        catch(Exception e)
        {
            System.out.println("error!");
            e.printStackTrace();
        }
        
    }
    
}
