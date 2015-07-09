public class TWID {
	//Static 1.靜態2.類別共有,不專屬物件
	 private String id;
	 private static String Chack="ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	 TWID(){
		 this((int)(Math.random()*2)==0,(int)(Math.random()*26));
	 }
	 TWID(String id){
		 this.id=id;//this.id=>這類別的id
	 }
	 TWID(boolean isMale){
		 this(isMale,(int)(Math.random()*26));
	 }
	 TWID(int area){
		 this((int)(Math.random()*2)==0,area);
	 }
	 TWID(boolean isMale,int area){
		 //String sId = Chack.substring(area,area+1);
		 StringBuffer sb = new StringBuffer(Chack.substring(area,area+1));
		 sb.append((isMale)?1:2);
		 //sId += (isMale)?1:2;
		 
		 for(int i=0; i<7;i++){
			 sb.append((int)(Math.random()*10));
			 //sId += (int)(Math.random()*10);
		 }
		 for(int i =0; i<10;i++){
			 String temp =sb.toString()+i;
			 if(isCheckOk(temp)){
				 id = sb.toString()+i;
				 break;
			 }
		 }
	 }
	 
	static  boolean isCheckOk(String id){
		 if (!id.matches("^[A-z][12][0-9]{8}$"))return false;

		 char first = id.charAt(0);
		 int temp =Chack.indexOf(first)+10;
		 
		 int C1= temp / 10;
		 int C2= temp % 10;
		 
		 int checkSum = 0;
		 int[] aNumber=new int[10];
		 for(int i=1;i<10;i++){
		 char sNumber =id.charAt(i);
		 int iNumber = (int)(sNumber)-'0';
		 aNumber[i]=iNumber;

		 }
		 for(int i =1; i<9; i++){
			 checkSum = checkSum+(aNumber[i]*(9-i));
		 }
		 int CheckID = (C1*1+C2*9+checkSum+aNumber[9])%10;
		 if (CheckID != 0 )
			 return false;
		 else
			 return true; 
	 }
	 int getArea(){
		 return 1;
	 }
	 boolean isMan(){
		 return false;
	 }
	 String getID(){
		 return id;
	 }
	 
}
