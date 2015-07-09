import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class java30 {

	public static void main(String[] args) {
		// Tcp Server Server
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("before");
			
			Socket socket = server.accept();
			InputStream in = socket.getInputStream();
			
			int temp;
			while ((temp =in.read())!=-1){
				System.out.print((char)temp);
			}
			
//			BufferedReader reder = new BufferedReader(new InputStreamReader(in));
//			int temp;
//			while((temp = reder.read())!=-1){
//				System.out.print((char)temp);
//			}
			System.out.println("after");
			
			server.close();
			System.out.println("ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
