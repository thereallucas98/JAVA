package application;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vect = new String[] {"Maria", "BOB", "Alex"};
		
		/* 
		 for (int i = 0; i < vect.length; i++) {
		 	System.out.println(vect[i]);
		 }
		 */
		
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
