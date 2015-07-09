public class TWIDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TWID id =new TWID(true);
		String TempId = id.getID();
		System.out.println(TWID.isCheckOk(TempId));
		System.out.println(TempId);
		
	}

}
