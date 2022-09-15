package set;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Queue2 {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<String>();
		p.add("red");
		p.add("green");
		p.add("blue");
		p.add("black");
		System.out.println(p);
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		p.add(a);
		System.out.println(p);
		
		
		// TODO Auto-generated method stub

	}

}
