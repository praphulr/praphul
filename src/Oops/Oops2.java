package Oops;

class Member
{
	String name,address;
	int age,phno;
	float salary;
	public void printsalary()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(phno);
		System.out.println(salary);
		
	}
}

class Employee extends Member
{
	char spec,dept;
	
}
class Manager extends Member
{
	char spec,dept;
	
	
}
public class Oops2 {
	

	public static void main(String[] args) {
		Manager  m=new Manager();
		Employee e=new Employee();
		
		
		m.name="PR";
		m.address="Kerala";
		m.age=22;
		m.phno=83288;
		m.salary=20000;
		
		e.name="AR";
		e.address="Kerala";
		e.age=21;
		e.phno=908731;
		e.salary=15000;
		
		m.printsalary();
		System.out.println();
		e.printsalary();
				
	

	}

}
