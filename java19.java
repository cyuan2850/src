import java.io.File;
import java.util.Calendar;



public class java19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		
		File file =
				new File("myTest");
		
//		if (file.exists()){	//確認是否有檔案
//			System.out.println("Ok");
//		}else{
//			file.mkdir();
////			file.mkdirs(); //如父目錄不再會建立父目錄
//		}
		

		String[] subfile = file.list();//顯示內容
		for(String s:subfile){
			System.out.println(s);
		}
		
		File[] subfile2 = file.listFiles();//顯示內容
		for(File f: subfile2){
			String filename = f.getAbsolutePath();
					long size = f.length();
					
					String type;
					if(f.isDirectory()){
						type = "<Dir>";
					}else if(f.isFile()){
						type = "<File>";
					}else{
						type = "";
					}
					
					long time = f.lastModified();
					
					System.out.println(filename+"\t");
					System.out.println(size + "bytes");
					System.out.println(type);
					System.out.println(getData(time));
		}
		
		
//		File[] root =File.listRoots();
//		for(File f:root){
//			System.out.println(f.getAbsolutePath());//顯示目錄	
//		}
		
	}
	static String getData(long data){ 
//		Calendar c =Calendar.getInstance();
//		c.setTimeInMillis(data);
//		int year = c.get(Calendar.YEAR);
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(data);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hh = c.get(Calendar.HOUR_OF_DAY);
		int mm = c.get(Calendar.MINUTE);
		int ss = c.get(Calendar.SECOND);
		
		return year + "-" + month + "-" + day + " " + hh + ":" + mm + ":" + ss;
	}

}
