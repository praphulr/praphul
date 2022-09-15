package abst;
abstract class Animals
{
	abstract void cats();
	abstract void dogs();
} 
class Cats extends Animals
{

	public void cats()
	{
		System .out.println("cats meow");
	}
	public void dogs()
	{
		
	}
}
class dogs extends Animals
{
	public void dogs()
	{
		System.out.println("dogs bark");
	}
	public void cats()
	{
	}
}
public class Abst2 {
	
	public static void main(String[] args) {
		Cats c=new Cats();
		dogs d=new dogs();
		c.cats();
		d.dogs();
		
		// TODO Auto-generated method stub

	}

}
