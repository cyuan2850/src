import javax.swing.JOptionPane;


public class java06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String year = JOptionPane.showInputDialog("輸入年份");
		System.out.println(year);
		int intYear = Integer.parseInt(year);
		//System.out.println(intYear);
		int Day2=0;
		if(intYear % 4 != 0){
			 Day2 = 28;
		}else if( intYear %100 == 0 && intYear %400 !=0){
			 Day2 = 28;
		}else if(intYear %4==0 ){
			Day2=29;
		}
		JOptionPane.showMessageDialog(null,Day2);
	}

}
