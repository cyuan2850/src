
public class java17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=0,B=10;
		int[] c = new int[3];
		try{
		System.out.println(B/A);
		System.out.println(c[3]);
		}catch(ArithmeticException ae){
			System.out.println("ok");
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("Ok2");
		}catch(Exception e){
			System.out.println("ok3");
		}
		
//		try{
//			System.out.println(B/A);
//		}catch(ArithmeticException ae){
//				System.out.println("ok");
//		}
//			
//		try{
//			System.out.println(c[3]);
//		}catch(ArrayIndexOutOfBoundsException aie){
//				System.out.println("Ok2");
//		}
	}

}
