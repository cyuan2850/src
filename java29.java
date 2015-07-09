import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class java29 {

	public static void main(String[] args) {
		//udp receive
		byte[] buf = new byte[4096];
		
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf,buf. length);
			socket.receive(packet);
			System.out.println(new String (packet.getData()));
			socket.close();
			System.out.println(packet.getAddress().getHostAddress());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("e");
		}
		
	}

}
