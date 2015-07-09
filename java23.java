import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class java23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//建立檔案
			FileOutputStream fout =
					new FileOutputStream("mytest/afile");
			fout.write("Hello, Word!\n 你好, 全世界".getBytes());
			fout.flush();//檔案關閉前確保資料送到
			fout.close();
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("E1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("E2");
		}
	}

}
