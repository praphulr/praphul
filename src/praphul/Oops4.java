package praphul;



class shape
{
	public void show()
	{
		System.out.println("This is shape");
	}
}
class rectangle extends shape
{
	public void show1()
	{
		System.out.println("This is rectangular shape");
	}
}
class Circle extends shape
{
	public void showc()
	{
		System.out.println("This is circular Shape");
	}
}
class square extends rectangle
{
	public void shows()
	{
		System.out.println("square is rectangle");
	}
}

public class Oops4 {


	public static void main(String[] args) {
		square obj=new square();
		obj.show1();
		obj.show();
		
		

	}

}
