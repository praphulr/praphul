package Arithemetic;

public class Format {

	public static void main(String[] args) {
		try
		{
			int a=Integer.parseInt("ab");
			System.out.println(a);
		}catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
