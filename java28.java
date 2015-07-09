import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class java28 {

	public static void main(String[] args) {
		//UTP Sander
		byte[] buf ="資策會".getBytes();
		try {
			DatagramSocket sock = new DatagramSocket();
			DatagramPacket  pack =new DatagramPacket(buf, buf.length,
					InetAddress.getByName("10.2.24.139"),8888);
			sock.send(pack);
			sock.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("e");
		}
	}

}
