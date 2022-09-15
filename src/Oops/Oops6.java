package Oops;
class Print1
{
	public void show(int n,char c)
	{
		System.out.println("first");
	}
	public void show (char c, int n)
	{
		System.out.println("second");
	}
}

public class Oops6 {
	

	public static void main(String[] args) {
		
		Print1 p=new Print1();
		p.show(1,'c');
		p.show('c',2);
		p.show('c',2);
		p.show(1,'c');
	
		
		// TODO Auto-generated method stub

	}

}
