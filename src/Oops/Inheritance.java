package Oops;

class Parent
{
	public void show()
	{
		System.out.println("This is parent class");
	}
	
}
class Child extends Parent
{
	public void show()
	{
		System.out.println("This is child class");
	}
	
}
public class Inheritance {
	
	public static void main(String[] args) {
		Parent p=new Parent();
		Child c=new Child();
		p.show();
	}
 
}
