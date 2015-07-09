import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class java22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
//			FileReader Fin = 
//				new FileReader("mytest/file1");
//			
//			int temp;
//			while((temp = Fin.read())!=-1){
//				System.out.print((char)temp);
//			}
			long befer =System.currentTimeMillis();
			File file = new File("mytest/file1");
			
			FileInputStream fin =new FileInputStream(file);
			
			byte[] temp = new byte[(int)file.length()];
			fin.read(temp);
			
			fin.close();
			
			
			long after = System.currentTimeMillis();
			System.out.println(after-befer);
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
