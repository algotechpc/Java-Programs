
/*
import java.net.InetAddress;
 

class IPAddress
{
   public static void main(String args[]) throws Exception
{

//System.out.println(InetAddress.getLocalHost().getHostAddress())//;
System.out.println(InetAddress.getLocalHost());
//System.out.println(InetAddress.getHostAddress());
   }

}
*/

import java.net.InetAddress;

import java.net.UnknownHostException;

public class IPAddress {
  
  
    public static void main(String args[]) throws UnknownHostException {
    
        InetAddress addr = InetAddress.getLocalHost();
      
        //Getting IPAddress of localhost - getHostAddress return //IP Address
        // in textual format
        String ipAddress = addr.getHostAddress();
      
        System.out.println("IP address of localhost from Java Program: " + ipAddress);
      
        //Hostname
        String hostname = addr.getHostName();
        System.out.println("Name of hostname : " + hostname);
      
    }
  
}


