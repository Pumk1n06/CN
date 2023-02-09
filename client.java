import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args)
    {
        try{
            Socket s=new Socket(InetAddress.getLocalHost(),6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("data.txt");
            dout.flush();
            dout.close();

        }
        catch(Exception e)
        {
            System.out.println("error!");
            e.printStackTrace();
        }
    }
    
}
