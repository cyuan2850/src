import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class java31 {

	public static void main(String[] args) {
		// tcp sander client
//		int i =0;
//		while(i<65536){
			try {
				Socket socket =new Socket(
						InetAddress.getByName("127.0.0.1"),7777);
//				System.out.println("port"+i);
				OutputStream out = socket.getOutputStream();
				out.write("hello word".getBytes());
				
				out.flush();
				System.out.println("ok");
			} catch (Exception e) {
//				System.out.println("e");
			} 
//			i++;
//		}

	}

}
