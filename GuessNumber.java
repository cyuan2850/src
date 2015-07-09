import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame{
	private JButton guess;
	private JTextField number;
	private JTextArea hist;
	private String Ans;
	private int time;
	private JButton Rest;
	
	public GuessNumber(){
		super("猜數字遊戲");
		Ans = createAns(3);

		setLayout(new BorderLayout());	//主要排版
		guess = new JButton("猜");		//Button
		number = new JTextField(10);	//text
		Rest = new JButton("Re");
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.LEFT));	//靠左排版,另一種產生物件方法
		jp.add(number);				//新增text
		jp.add(guess);				//新增Button
		jp.add(Rest);
		hist = new JTextArea();		//新增TextView
		
		add(jp, BorderLayout.NORTH); //上半部
		add(hist, BorderLayout.CENTER);//中間
		
		//監聽按鈕
		guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//按下後發生什麼事
				pressGuess();
			}
		});
		
//		add(number);
//		add(guess);	
//		guess.setSize(100,100);
//		guess.setLocation(240, 110);//絕對位置
//		add(guess);
		
		setSize(480,320);//大小
		setVisible(true);//跳出視窗
		setDefaultCloseOperation(EXIT_ON_CLOSE);//按離開時關閉程式 ,JFrame.EXIT_ON_CLOSE  
	}
	
	
	void pressGuess(){
		String gNum = number.getText();//顯示gNum
		String result = checkAB(gNum);//
		JOptionPane.showMessageDialog(null, result);//顯示視窗
		
		hist.append(gNum +"==>"+result+"\n");//顯示提示
		number.setText("");//輸入的數字
	}
	
	
	String checkAB(String gNum){
		int A, B;A=B=0;
		
		for(int i=0;i<gNum.length();i++){
			if(gNum.charAt(i) == Ans.charAt(i)){
				A++;
			}else if(gNum.indexOf(Ans.charAt(i))>=0){
				B++;
			}
		}
		
		return A+"A"+B+"B";
	}
	
	
	static String createAns(int d){
		StringBuffer sb = new StringBuffer();	//字串串接方法
		int[] poker = new int[d];				//位數
		for( int i =0;i<poker.length;i++){		
			int temp = (int)(Math.random()*10);
			
			//檢查有沒有重複
			boolean isOK =true;
			for(int ck =0;ck<i;ck++){
				if(poker[ck]==temp){
					isOK =false;
					break;
				}
			}
			
			if(isOK){
			poker[i] = temp;
			sb.append(temp);
			}else{
				i--;
			}
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessNumber();
	}

}
