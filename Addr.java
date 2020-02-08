import java.io.*;
import java.net.*;
public class Addr
{
    public static void main(String arg[]) throws Exception
    {
        
        InetAddress me=InetAddress.getByName("www.google.com");
        PrintStream o=System.out;
        o.println("localhost by getLocalHost="+me);

        InetAddress me2=InetAddress.getLocalHost();
        o.println("localhost by getLocalHost="+me2);

        InetAddress[] many=InetAddress.getAllByName("microsoft.com");
        for(int i=0;i<many.length;i++)
        o.println(many[i]);

    }
}