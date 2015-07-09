
public class java04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float var1;
		double var2;
		//var1 =1.2;
		var1 =1.2f;
		var2 =1.2;
		
		double var3= Math.random();
		System.out.println(var3);
		int latt = (int)(Math.random()*49)+1;//（Math.random*個數）+調整範圍
		System.out.println(latt);
		int sorc = (int)(Math.random()*101);
		System.out.println(sorc);
		int sort4069 = (int)(Math.random()*30)+40;
		System.out.println(sort4069);
		
		int v1 = 10;
		int v2 = 0;
		//int v3 = v1 / v2;
		//System.out.println(v3);//例外
		
		double v4 = 10;
		double v5 = 0;
		double v6 = v4/v5;
		double v7 = 0;
		//System.out.println(v6);//無限大
		double v8 = v5/v7;
		//System.out.println(v8);//
	}

}
