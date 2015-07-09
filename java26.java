import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class java26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("mytest/student.dot"));
			student s1 = (student)ois.readObject();
			student s2 = (student)ois.readObject();
			student s3 = (student)ois.readObject();
			ois.close();
			System.out.println(s1.chinese);
			System.out.println(s2.math);
			System.out.println(s3.english);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ee");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
