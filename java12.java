public class java12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//記錄一～六出現次數
				int[] p;
				p = new int[6];//0~5
				for (int k=0; k<100000;k++){
				int point = (int)(Math.random()*9)+1;//1~6
				point = (point>=7)? point-3:point;
				p[point-1]++;
				}	
				for(int i =0; i<p.length;i++){
					System.out.println(i+1+":"+p[i]);
				}
	}

}
