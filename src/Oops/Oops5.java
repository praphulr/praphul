package Oops;
class printNumber
{
	public void printn(int a)
	{
		System.out.println("int a");
	}
	public void printn(char a)
	{
		System.out.println("char");
	}
	public void printn(double a)
	{
		System.out.println("float");
	}
	
}

public class Oops5 {

	public static void main(String[] args) {
		printNumber p=new printNumber();
		p.printn(1);
		p.printn('a');
		p.printn(2.2);
		
	}

}
