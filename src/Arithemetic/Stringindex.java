package Arithemetic;

public class Stringindex {

	public static void main(String[] args) {
		try {
			String a="Goodmorning";
			System.out.println(a.substring(17));
			
		}
		catch(StringIndexOutOfBoundsException e)
		{ 
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
