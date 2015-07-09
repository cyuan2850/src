public class Scooter extends Bike{
	//父類別要有無傳參數建構式
	Scooter(){
		//super();=>沒輸入東西會自動執行這行程式
		this(1);//=>就算執行下一區塊程式一樣會錯誤
	}
	Scooter(int a){
	//super(); 
//	super(1.2);	
	}
}
