package Arithemetic;

public class null1 {

	public static void main(String[] args) {
		try
		{ 
			String ptr=null;
			System.out.println(ptr.length());
		}catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	

	}

}
