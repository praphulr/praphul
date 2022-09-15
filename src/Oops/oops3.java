package Oops;

class Rect
{
	int len,wid;
	Rect(int a,int b)
	{
		len=a;
		len=b;
	}
	public void area()
	{
		System.out.println(len*wid);
	}
	public void perimeter()
	{
		System.out.println(2*(len+wid));
	}
}
class Square extends Rect
{
	Square(int s)
	{
		super(s,s);
	}
}

public class oops3 {


	public static void main(String[] args) {
		Square[] c=new Square[9];
		c[0]=new Square(1);
		c[0].area();
		c[0].perimeter();
		c[1]=new Square(2);
		c[1].area();
		c[1].perimeter();
		c[2]=new Square(3);
		c[2].area();
		c[2].perimeter();
		c[3]=new Square(4);
		c[3].area();
		c[3].perimeter();
		c[4]=new Square(5);
		c[4].area();
		c[4].perimeter();
		c[5]=new Square(6);
		c[5].area();
		c[5].perimeter();
		c[6]=new Square(7);
		c[6].area();
		c[6].perimeter();
		c[7]=new Square(8);
		c[7].area();
		c[7].perimeter();







	}

}
