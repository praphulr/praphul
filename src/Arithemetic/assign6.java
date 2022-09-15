package Arithemetic;
import java.util.Iterator;
import java.util.LinkedList;

public class assign6 {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.addFirst(2);
		l.addLast(8);
		Iterator<Integer> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		l.add(0,2);
		System.out.println(1);
		
		
		
		// TODO Auto-generated method stub

	}

}
