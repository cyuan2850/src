public class java10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i=0;
		// for(System.out.println("A"); i <20;System.out.println("B")){
		// System.out.println(i++);
		// System.out.println("======");
		// }

		for (int k = 0; k < 3; k++) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= 5; j++) {
					int cont = j +k*4;
					System.out.print(cont + " * " + i + " = " + i * cont + "\t");
				}
				System.out.println("");
			}
			System.out.println("=============================================================");
		}
	
		
	}

}
