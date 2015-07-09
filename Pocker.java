import java.util.Arrays;

public class Pocker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] poker = new int[52];
		for(int i=0;i<52;i++) poker[i]=i;
		for(int i =0;i<poker.length;i++){
			int temp = (int)(Math.random()*52);
			int temp1=poker[temp];
			int temp2=poker[i];
			poker[temp]=temp2;
			poker[i]=temp1;
		//1.洗牌

		}
		System.out.println("------------------------");
		
		//2.發牌
		int[][] player =new int[4][13];
		for(int i=0;i<poker.length;i++){
			player [i%4][i/4] =poker[i];
		}
		
		for(int i=0 ; i<4;i++){
			for (int v :player[i])
			System.out.print("."+v+"\t");
		System.out.println();
		}
		System.out.println("--------");
		
		//3.攤牌
		String[] flower={"黑桃","紅心","方塊","梅花"};
		String[] value={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i =0;i<player.length;i++){
			Arrays.sort(player[i]);//排大小
			for(int j =0;j<player[i].length;j++){
				int temper = player[i][j];
				System.out.print(flower[temper/13]+value[temper%13]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
