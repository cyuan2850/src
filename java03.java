
public class java03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1=10, var2=3;
		int var3;
		var3=var1/var2;
		System.out.println(var3);//運算結果int=>整數
		
		long var4 =12;
		long var5= var1+var4;//int不能加long但long可以加int
		long var6 = 12L;
		
		int var7 =012;//0x12 =>16進位
		System.out.println(var7);//8進位
		
		char v1= 'a';//單引號只可以是單一字元但可以是0~65535
		v1=65;//
		System.out.println(v1);
		int v2=12;
		int v3 = v1+v2;//可以和int運算
		System.out.println(v3);
		
	}

}
