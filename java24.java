import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;


public class java24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//串接，沒用到網路
		try{
			FileInputStream fin =
					new FileInputStream("mytest/csvTestFile.csv");
			
			
			InputStreamReader ir = 
					new InputStreamReader(fin);
			BufferedReader reader=
					new BufferedReader(ir);
			String line;
			
			while( (line = reader.readLine()) != null){
			//System.out.println(line);
				String[] data =line.split(",");//遇到逗號換下一個陣列
				
				for(String d:data){
				System.out.println(d);
				}
				System.out.println("-----------");
			}
			fin.close();
		}catch(Exception e){
			System.out.println("E");
		}
		 
		
	}

}
