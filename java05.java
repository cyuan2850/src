
public class java05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*101)+1;
		System.out.print("Score"+score+"=>");
		if(score >= 60){
			System.out.println("Pass");
		}else{
			System.out.println("Down");
		}
		int year =2100;
		int Day2=0;
		if(year % 4 != 0){
			 Day2 = 28;
		}else if( year %100 == 0 && year %400 !=0){
			 Day2 = 28;
		}else if(year %4==0 ){
			Day2=29;
		}
		System.out.println(Day2);
	}

}
