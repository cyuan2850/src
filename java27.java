import java.io.ObjectInputStream.GetField;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.UnknownHostException;


public class java27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ip = InetAddress.getByName("192.168.0.1");
			
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("e");
			
		}
	}

}
