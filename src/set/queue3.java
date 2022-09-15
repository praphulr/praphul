package set;
import java.util.PriorityQueue;


public class queue3 {

	public static void main(String[] args) {
		int c=0;
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("red");
		p.add("green");
		p.add("blue");
		p.add("black");
		System.out.println(p);
		for(String i:p)
		{
			c++;
		}
		System.out.println(p.size());
		
		// TODO Auto-generated method stub

	}

}
