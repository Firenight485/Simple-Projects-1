package IpAdress;

import java.net.InetAddress;

public class IPAdress {
    public static void main(String[] args) throws Exception {
        
        InetAddress myIP = InetAddress.getLocalHost();

        System.out.println("My IP Adress is: " + myIP);
    }
}
