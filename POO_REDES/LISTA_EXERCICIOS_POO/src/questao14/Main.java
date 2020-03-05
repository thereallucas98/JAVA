package questao14;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		
		while(x <= 10) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i+" X "+x+" = "+(i * x));
			}
			x += 1;
			if (x > 10){
				break;
			} else {
				System.out.println("TABUADA DO "+x);
			}
		}

	}

}
