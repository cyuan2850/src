import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class java25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 =new student(80,70,60);
		student s2 =new student(50,70,60);
		student s3 =new student(20,70,60);
		System.out.println(s1.calcSoc()+":"+s1.getAng());
		System.out.println(s2.calcSoc()+":"+s2.getAng());
		System.out.println(s3.calcSoc()+":"+s3.getAng());
		
		try {
			ObjectOutputStream oos =new ObjectOutputStream(
					new FileOutputStream("mytest/student.dot"));
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		oos.flush();
		oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("e"+e.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ee"+e.toString());
		}
	}

}
//implements Serializable 序列化
class student implements Serializable{
	int chinese;
	transient int math; 
	int english;
	bard bard;
	
	student(int c, int m ,int e){
		chinese = c;math = m; english = e;
		bard =new bard();
	}

	int calcSoc(){
		return chinese+math+english;
	}
	double getAng(){
		return calcSoc() /3f;
	}

}
class bard implements Serializable{
	
}
