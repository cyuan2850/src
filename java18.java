
public class java18 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar mc = new MyCar();
		mc.m1();
	} 
	

}
class MyCar {
	void m1(){
		try{
		m2(3);
		System.out.println("B");
		}catch(Exception m1){
			System.out.println("A");
			return;
		}finally{
			System.out.println("D");
		}
		System.out.println("C");
	}
	void m2(int a) throws MyException1,MyException2/*Exception*/{
		if (a<0){
			throw new MyException1();
		}else if (a>2){
			throw new MyException2();
		}
	}
}

class MyCard2 extends MyCar{
	void m2(int a) throws MyException1,MyException2
	/*要和 void m2(int a) throws "MyException1,MyException2" 一樣不能多不能少*/{
		
	}
}

class MyException1 extends Exception{
	
}

class MyException2 extends Exception{
	
}