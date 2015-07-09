import javax.swing.JOptionPane;


public class java09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10;
		final int b =10;//不能運算
		
		switch(a){//可以使用判斷的型態 byte short int(se6) String(se7)
			case 1 :
				System.out.println("A");
				break;
			case b :
				System.out.println("B");
				break;
			case 99+1 :
				System.out.println("C");
				break;
			case 1000 :
				System.out.println("D");
				break;
			default :
				System.out.println("E");
		}
		String sYear = JOptionPane.showInputDialog("輸入年份");
		int iYear = Integer.parseInt(sYear);
		String sMM =JOptionPane.showInputDialog("月份");
		int MM = Integer.parseInt(sMM);
		int Day = 0;
		switch(MM){	
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("1");
				Day = 31;
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("4");
				Day = 30;
				break;
			case 2:
				System.out.println("2");
				if(iYear % 4 != 0){
					 Day = 28;
				}else if( iYear %100 == 0 && iYear %400 !=0){
					 Day = 28;
				}else if(iYear %4==0 ){
					Day=29;
				}
				break;
		}//有幾種比較值
		System.out.println(Day);
		JOptionPane.showMessageDialog(null, Day);
	}
}
