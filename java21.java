import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class java21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream Fin = 
				new FileInputStream("mytest/file1");
			
//			int a = Fin.read();
//			System.out.println((char)a);
			byte[] temp = new byte[3];
			while((Fin.read(temp))!= -1){
				System.out.print(new String(temp));
			}
			
			Fin.close();
			System.out.println("Ok");
		
		}catch(FileNotFoundException fe){
			System.out.println("E1");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("E2");
		}
	}

}
