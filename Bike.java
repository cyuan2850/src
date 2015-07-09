
//建立一個新的物件就是完成初始化
//類別中並無先後順序性
public class Bike {
	private double speed;
	
	static int i;
	//int i;
	
	{
		//程式區塊，這裡會先做
		System.out.println("B");
	}
	static{
		System.out.println("C");
	}
//	fBike(){
//		//無傳參數建構式
//	}
	//建構式
	Bike(){
		i++;
		System.out.println("A");
	}
	
	void upSpeed(){
		if(speed==0.0){
			speed=3;
		}else
			speed *= 1.2;
	}
	void upSpeed(double rate){
		if(speed==0.0){
			speed=3;
		}else
			speed *= rate;
	}
	void downSpeed(){
		if(speed<=4){
			speed=0;
		}else
			speed *= 0.7;
	}
	double getSpeed(){
		return speed;
	}
}
