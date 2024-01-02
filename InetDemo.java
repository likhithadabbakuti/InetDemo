import java.net.InetAddress;

public class InetDemo {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("localhost");
            System.out.println("hostname:"+ip.getHostName());
            System.out.println("IP Address:"+ip.getHostAddress());
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}