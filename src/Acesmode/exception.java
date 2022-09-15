package Acesmode;

public class exception {

	public static void main(String[] args) {
		try {
			int dividebyzero=(5/0);
			System.out.println("Try code");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithemetic exp"+e.getMessage());
		}
		

	}

}
